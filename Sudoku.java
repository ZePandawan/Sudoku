
public class Sudoku {
	
	private int taille;

	int[][] grille;
	int i;
	int j;
	
	public Sudoku(int[][] grilledonne) {
		this.grille = grilledonne; 
		//Est-ce idÃ©al? Pourquoi pas?
		this.taille= this.grille.length;
	}
	
	
	public boolean estPossible(int v, int i, int j, int [][] grille) {
		for (int x = 0; x < 9; x++) {
            // Row
            if (grille[i][x] == v) {
                return false;
            }
            // Column
            if (grille[x][j] == v) {
                return false;
            }
        }
		
        int ligneBox = 3*(i/3);
        int colonneBox = 3*(j/3);
        
        // Check in the current sub box
        for (int x = ligneBox; x < ligneBox + 3; x++) {
            for (int y = colonneBox; y < colonneBox + 3; y++) {
                if (grille[x][y] == v) {
                    return false;
                }
            }
        }
        // Return true
        return true;
		
	}
	
	
	
	
	public int[][] getgrille(){
		return this.grille;
	}
	
	
	public int[] caseSuivante (int[] ij) {
		if (ij[1] == 8) {
			ij[0] += 1;
			ij[1] = 0;
		}
		else
		{
			ij[1] += 1;
		}
		return ij;
	}
	
	public boolean solve(int[] ij) {
		ij = caseSuivante(ij);
		this.i = ij[1];
		this.j = ij[0];
		
		if(i == 9) {
			return true;
		}
		
		if(grille[this.i][this.j] != 0) {
			return solve(ij);
		}
		else
		{
			for (int v = 1; v < 10; v++) {
				if(!estPossible(v,this.i,this.j,grille)) {
					continue;
				}
				grille[this.i][this.j] = v;
				boolean estCorrect = solve(ij);
				if(estCorrect) {
					return true;
				}
			}
			grille[this.i][this.j] = 0;
			return false;
		}
	}
	
	
	public String toString() {
	//oÃ¹ est la faute dans cette mÃ©thode? Il faut mettre des " et non des '
		String affichage = "";
		
		for (int i=0; i<this.taille; i++) {
			for (int j=0; j<this.taille-1; j++) {
				affichage += this.grille[i][j]+ " ";
			}
			affichage += this.grille[i][taille-1] + "\n"; 
		}
		return affichage;
	}

	
}
