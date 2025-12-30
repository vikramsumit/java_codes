public class spiralmatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    return;
                }
                // if (startRow == endRow){
                // break;
                // }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    return;
                }
                // if (startCol == endCol){
                // break;
                // }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static int primarydiagonalsun(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;

    }

    public static int secondarydiagonalsuum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // for(int i=0; i<matrix.length; i++) {
        // for(int j=0; j<matrix[0].length; j++){
        // if (i == j) {
        // sum += matrix[i][j];
        // }
        // else if(i+j == matrix.length-1){
        // sum+= matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // {99,65,77,34}};

        printSpiral(matrix);
        // diagonalSum(matrix);
        // primarydiagonalsun(matrix);
        System.out.println(primarydiagonalsun(matrix));
        System.out.println("Total sum of secondary diagonal are:" + secondarydiagonalsuum(matrix));

        System.out.println(diagonalSum(matrix));

    }
}
