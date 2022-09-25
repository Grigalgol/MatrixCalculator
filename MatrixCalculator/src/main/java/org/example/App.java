package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static Matrix addition(Matrix matrix1, Matrix matrix2){
        if (matrix1.getNcols() != matrix2.getNcols() || matrix1.getNrows() != matrix2.getNrows())
            return null;
        Matrix sumMatrix = new Matrix(matrix1.getNrows(), matrix1.getNcols());
        for (int i=0; i<matrix1.getNrows();i++) {
            for (int j=0;j<matrix1.getNcols();j++)
                sumMatrix.setValueAt(i, j, matrix1.getValueAt(i, j) + matrix2.getValueAt(i,j));
        }
        return sumMatrix;
    }
    public static Matrix subtraction(Matrix matrix1, Matrix matrix2){return null;}
    public static Matrix multiply(Matrix matrix1, Matrix matrix2){return null;}
    public static Matrix transpose(Matrix matrix) {return null;}
    public static double determinant(Matrix matrix){return 0;}
    public static Matrix createSubMatrix(Matrix matrix, int excluding_row, int excluding_col) {return null;}
    public static Matrix inverse(Matrix matrix){return null;}
    public static Matrix cofactor(Matrix matrix){return null;}
}
