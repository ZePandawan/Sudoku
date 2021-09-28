public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] grille = {
                {1,0,0,0,0,7,0,9,0},
                {0,3,0,0,2,0,0,0,8},
                {0,0,9,6,0,0,5,0,0},
                {0,0,5,3,0,0,9,0,0},
                {0,1,0,0,8,0,0,0,2},
                {6,0,0,0,0,4,0,0,0},
                {3,0,0,0,0,0,0,1,0},
                {0,4,0,0,0,0,0,0,7},
                {0,0,7,0,0,0,3,0,0}};
        
//        int[][] grille = {
//                  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
//                  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
//                  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
//                  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
//                  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
//                  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
//                  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
//                  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
//                  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
//                };
        
        Sudoku partie1 = new Sudoku(grille);
        //System.out.println(partie1.toString());
        int[] start = {0,0};
        boolean solved = partie1.solve(start);
        System.out.println(solved);
        System.out.println(partie1.toString());
    }

}
