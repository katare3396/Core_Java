import java.util.Scanner;

public class Matrix_Class {

    /*
     * 01) Program to read and write matrix elements.
     * 02) Program to read and calcualte addition of two matrices.
     * 03) Program to read and calcualte subtraction of two matrices.
     * 04) Program to perform scalar matrix multiplication.
     * 05) Program to perform normal matrix multiplication.
     * 06) Program to read and calcualte sum of all the elements present in the
     * matrix.
     * 07) Program to find row wise sum values
     * 08) Program to find col wise sum values
     * 09) Program to calcualte tranpose of the given matrix
     * 10) Program to check whether the given matrix is identity matrix or not?
     * 11) Swaping of two rows
     * 12) Swaping of two cols
     * 13) sum of diagonal elements
     * 14) sum of opposite diagonal elements
     * 15) interchanging of diagonal
     */
    public static void main(String[] args) {

        // print_MatrixForm();

        // addition_Two_Matrix();

        // subtract_Two_Matrix();

        // scalarMutiple_Matrix();

        // normal_MatrixMultiplication ();

        // allElementSum_Matrix();

        // row_WiseSum_Matrix();

        // column_WiseSum_Matrix();

        // tranpose_Matrix();

        // System.out.println(boolean_itIs_IdentifyMatrix());

        // swap_Two_Row_Matrix();

        // swap_Two_Column_Matrix();

        // sum_Diagonal_Element();

        // sum_OppositeDiagonal_Element();

        interchanging_Diagonal();
    }

    static Scanner obj = new Scanner(System.in);

    // 1) Program to read and write matrix elements.
    public static void print_MatrixForm() {

        System.out.println("Enter row size matrix");
        int rSize = obj.nextInt();

        System.out.println("Enter Coloumn Size Matrix");
        int cSize = obj.nextInt();

        int xyz[][] = new int[rSize][cSize];
        System.out.println("Enter Row wise Data");

        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                xyz[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                System.out.print(xyz[i][j] + "  [" + i + " , " + j + "]    ");
            }
            System.out.println();
        }
    }

    // 2) Program to read and calcualte addition of two matrices.
    public static void addition_Two_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        System.out.println("Enter row size of matix B");
        int rowSize_B = obj.nextInt();

        System.out.println("Enter column size of matix B");
        int columnSize_B = obj.nextInt();

        if (rowSize_A == rowSize_B && columnSize_A == columnSize_B) {

            int matrix_A[][] = new int[rowSize_A][columnSize_A];
            int matrix_B[][] = new int[rowSize_B][columnSize_B];

            System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");
            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_A; j++) {
                    matrix_A[i][j] = obj.nextInt();
                }
            }

            System.out.println("Enter Data for Matrix B " + rowSize_B * columnSize_B + " Number of Data Required");
            for (int i = 0; i < rowSize_B; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    matrix_B[i][j] = obj.nextInt();
                }
            }

            for (int i = 0; i < rowSize_B; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    System.out.print(matrix_B[i][j] + matrix_A[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Size of Both matrix is not same");
        }

    }

    // 3) Program to read and calcualte subtraction of two matrices
    public static void subtract_Two_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        System.out.println("Enter row size of matix B");
        int rowSize_B = obj.nextInt();

        System.out.println("Enter column size of matix B");
        int columnSize_B = obj.nextInt();

        if (rowSize_A == rowSize_B && columnSize_A == columnSize_B) {

            int matrix_A[][] = new int[rowSize_A][columnSize_A];
            int matrix_B[][] = new int[rowSize_B][columnSize_B];

            System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");
            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_A; j++) {
                    matrix_A[i][j] = obj.nextInt();
                }
            }

            System.out.println("Enter Data for Matrix B " + rowSize_B * columnSize_B + " Number of Data Required");
            for (int i = 0; i < rowSize_B; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    matrix_B[i][j] = obj.nextInt();
                }
            }

            for (int i = 0; i < rowSize_B; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    System.out.print(matrix_B[i][j] - matrix_A[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Size of Both matrix is not same");
        }

    }

    // 4) Program to perform scalar matrix multiplication.
    public static void scalarMutiple_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        System.out.println("Enter Value for mutiple Matrix");
        int mutipler = obj.nextInt();

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {

                System.out.print(matrix_A[i][j] * mutipler + " ");
            }
            System.out.println();
        }
    }

    // 5) Program to perform normal matrix multiplication.
    public static void normal_MatrixMultiplication() {

        System.out.println("Enter row size of matrix A:");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matrix A:");
        int columnSize_A = obj.nextInt();

        System.out.println("Enter row size of matrix B:");
        int rowSize_B = obj.nextInt();

        System.out.println("Enter column size of matrix B:");
        int columnSize_B = obj.nextInt();

        // Check for matrix multiplication compatibility
        if (columnSize_A == rowSize_B) {
            int[][] matrix_A = new int[rowSize_A][columnSize_A];
            int[][] matrix_B = new int[rowSize_B][columnSize_B];
            int[][] matrix_C = new int[rowSize_A][columnSize_B];

            System.out.println("Enter elements of Matrix A one-by-one (row by row):");
            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_A; j++) {
                    matrix_A[i][j] = obj.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix B one-by-one (row by row):");
            for (int i = 0; i < rowSize_B; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    matrix_B[i][j] = obj.nextInt();
                }
            }

            // Perform matrix multiplication
            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    matrix_C[i][j] = 0;
                    for (int k = 0; k < columnSize_A; k++) {
                        // System.out.println("i" + i + " j " + j + " K " + k);
                        matrix_C[i][j] += matrix_A[i][k] * matrix_B[k][j];
                    }
                }
            }

            // Display Matrix C
            System.out.println("MATRIX-C ELEMENTS ARE:");
            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_B; j++) {
                    System.out.print(matrix_C[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println(
                    "Matrix multiplication is not possible. The number of columns in Matrix A must equal the number of rows in Matrix B.");
        }

        obj.close();
    }

    // 06) Program to read and calcualte sum of all the elements present in the
    // matrix
    public static void allElementSum_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                sum += matrix_A[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all element  " + sum);
    }

    // 07) Program to find row wise sum values
    public static void row_WiseSum_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < rowSize_A; i++) {
            int sum = 0;
            for (int j = 0; j < columnSize_A; j++) {
                sum += matrix_A[i][j];
            }
            System.out.println("Row wise Sum of all element  " + sum);
        }
    }

    // 08) Program to find col wise sum values
    public static void column_WiseSum_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < rowSize_A; i++) {
            int sum = 0;
            for (int j = 0; j < columnSize_A; j++) {
                sum += matrix_A[j][i];
            }
            System.out.println("Column wise Sum of all element  " + sum);
        }
    }

    // 09) Program to calcualte tranpose of the given matrix
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9 -->convert Tranpose matrix
     * 
     * 1 4 7
     * 2 5 8
     * 3 6 9
     */
    public static void tranpose_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];
        int matrix_B[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        System.out.println("Tranpose Matrix");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_B[i][j] = matrix_A[j][i];
                System.out.print(matrix_B[i][j] + "   ");
            }
            System.out.println();
        }
    }

    // 10) Program to check whether the given matrix is identity matrix or not?
    /*
     * 1 0 0
     * 0 1 0
     * 0 0 1 -->identify matrix
     */
    public static Boolean boolean_itIs_IdentifyMatrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        System.out.println("check it is Identitfy Matrix");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {

                if (i == j && matrix_A[i][j] != 1) {
                    return false;
                }
                if (i != j && matrix_A[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 11) Swaping of two rows
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * -->. swap
     * 7 8 9
     * 4 5 6
     * 1 2 3
     */
    public static void swap_Two_Row_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        System.out.println("Swap Two row");

        for (int i = rowSize_A - 1; i >= 0; i--) {
            for (int j = 0; j < columnSize_A; j++) {
                System.out.print(matrix_A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 11) Swaping of two cols
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * -->. swap column
     * 3 2 1
     * 6 5 4
     * 9 8 7
     */
    public static void swap_Two_Column_Matrix() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        System.out.println("Swap Two coloumn");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = columnSize_A - 1; j >= 0; j--) {
                System.out.print(matrix_A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 13) sum of diagonal elements
    /*
     * for (int i = 0; i < rowSize_A; i++) {
     * sum += matrix_A[i][i];
     * }
     */
    public static void sum_Diagonal_Element() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < rowSize_A; i++) {
            sum += matrix_A[i][i];
        }

        System.out.println("Sum of Diagonal Element " + sum);
    }

    // 14) sum of opposite diagonal elements
    /*
     * for (int i = 0; i < rowSize_A; i++) {
     * sum += matrix_A[i][rowSize_A - i - 1];
     * }
     */
    public static void sum_OppositeDiagonal_Element() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        for (int i = 0; i < rowSize_A; i++) {
            for (int j = 0; j < columnSize_A; j++) {
                matrix_A[i][j] = obj.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < rowSize_A; i++) {
            sum += matrix_A[i][rowSize_A - i - 1];
        }

        System.out.println("Sum of opposite Diagonal Element " + sum);
    }

    // 15) interchanging of diagonal
    /*
     * for (int i = 0; i < rowSize_A; i++) {
     * int temp = matrix_A[i][i];
     * matrix_A[i][i] = matrix_A[i][rowSize_A - i - 1];
     * matrix_A[i][rowSize_A - i - 1] = temp;
     * }
     */
    public static void interchanging_Diagonal() {

        System.out.println("Enter row size of matix A");
        int rowSize_A = obj.nextInt();

        System.out.println("Enter column size of matix A");
        int columnSize_A = obj.nextInt();

        int matrix_A[][] = new int[rowSize_A][columnSize_A];

        System.out.println("Enter Data for Matrix A " + rowSize_A * columnSize_A + " Number of Data Required");

        if (rowSize_A == columnSize_A) {

            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_A; j++) {
                    matrix_A[i][j] = obj.nextInt();
                }
            }

            System.out.println("Interchange The diagonal");

            for (int i = 0; i < rowSize_A; i++) {
                int temp = matrix_A[i][i];
                matrix_A[i][i] = matrix_A[i][rowSize_A - i - 1];
                matrix_A[i][rowSize_A - i - 1] = temp;
            }

            for (int i = 0; i < rowSize_A; i++) {
                for (int j = 0; j < columnSize_A; j++) {
                    System.out.print(matrix_A[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Column & Row are not Equal");
        }

    }

}