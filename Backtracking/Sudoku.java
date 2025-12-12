// public class Sudoku {
//     // Method to check if it's safe to place a digit in the current cell
//     // of the sudoku board.
//     public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
//         // Check the row
//         for (int i = 0; i < 9; i++) {
//             if (sudoku[row][i] == digit) {
//                 return false;
//             }
//         }

//         // Check the column
//         for (int i = 0; i < 9; i++) {
//             if (sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         // Check the 3x3 subgrid
//         int SR = (row/3)*3;
//         int SC = (col/3)*3;
//         for (int i = SR; i < SR + 3; i++) {
//             for (int j = SC; j < SC + 3; j++) {
//                 if (sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
//         // Base case
//         if (row == 9 && col == 9) {
//             return true;
//         }
//         else if(row == 9){
//             return false;
//         }

//         // recursion
//         int nextRow = row, nextCol = col+1;
//         if(col+1 == 9){
//             nextRow = row+1;
//             nextCol = 0;
//         }

//         // If the current cell is already filled, move to the next cell
//         if (sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         // Try filling the current cell with digits from 1 to 9
//         for (int digit = 1; digit <= 9; digit++) {
//             if (isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit;
//                 // Recursively try to solve the Sudoku with the current cell filled
//                 if (sudokuSolver(sudoku, nextRow, nextCol + 1)) {
//                     return true;
//                 }
//                 // If the current digit doesn't lead to a solution, backtrack
//                 sudoku[row][col] = 0;
//             }
//         }

//         // If no digit from 1 to 9 can be placed in the current cell, return false
//         return false;
//     }

//     // Method to print the Sudoku grid
//     public static void printSudoku(int[][] sudoku) {
//         for (int r = 0; r < 9; r++) {
//             for (int d = 0; d < 9; d++) {
//                 System.out.print(sudoku[r][d] + " ");
//             }
//             System.out.print("\n");

//             // if ((r + 1) % 3 == 0) {
//             //     System.out.print("");
//             // }
//         }
//     }

//     public static void main(String[] args) {
//         int[][] sudoku = {
//             {5, 3, 0, 0, 7, 0, 0, 0, 0},
//             {6, 0, 0, 1, 9, 5, 0, 0, 0},
//             {0, 9, 8, 0, 0, 0, 0, 6, 0},
//             {8, 0, 0, 0, 6, 0, 0, 0, 3},
//             {4, 0, 0, 8, 0, 3, 0, 0, 1},
//             {7, 0, 0, 0, 2, 0, 0, 0, 6},
//             {0, 6, 0, 0, 0, 0, 2, 8, 0},
//             {0, 0, 0, 4, 1, 9, 0, 0, 5},
//             {0, 0, 0, 0, 8, 0, 0, 7, 9}
//         };

//         if (sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("solution exists");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("No solution exists.");
//         }
//     }

    
// }

public class Sudoku {
    // Method to check if it's safe to place a digit in the current cell
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check the row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int SR = (row / 3) * 3;
        int SC = (col / 3) * 3;
        for (int i = SR; i < SR + 3; i++) {
            for (int j = SC; j < SC + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }

        // Move to the next row if we've reached the end of the current row
        int nextRow = row, nextCol = col + 1;
        if (col == 8) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the current cell is already filled, move to the next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try filling the current cell with digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                // Recursively try to solve the Sudoku with the current cell filled
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                // If the current digit doesn't lead to a solution, backtrack
                sudoku[row][col] = 0;
            }
        }

        // If no digit from 1 to 9 can be placed in the current cell, return false
        return false;
    }

    // Method to print the Sudoku grid
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("This is the required solutions:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

