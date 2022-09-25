package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static Matrix addition(Matrix matrix1, Matrix matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        if (matrix1.getNcols() != matrix2.getNcols() || matrix1.getNrows() != matrix2.getNrows())
            return null;
        Matrix sumMatrix = new Matrix(matrix1.getNrows(), matrix1.getNcols());
        for (int i = 0; i < matrix1.getNrows(); i++) {
            for (int j = 0; j < matrix1.getNcols(); j++)
                sumMatrix.setValueAt(i, j, matrix1.getValueAt(i, j) + matrix2.getValueAt(i, j));
        }
        return sumMatrix;
    }

    public static Matrix subtraction(Matrix matrix1, Matrix matrix2) {
        if (matrix1 == null || matrix2 == null) return null;
        return addition(matrix1, matrix2.multiplyByConstant(-1));
    }


    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if(matrix1 == null || matrix2 == null) return null;
        if(matrix1.getNcols() != matrix2.getNrows()) return null;
        Matrix multipliedMatrix = new Matrix(matrix1.getNrows(), matrix2.getNcols());

        for (int i=0;i<multipliedMatrix.getNrows();i++) {
            for (int j=0;j<multipliedMatrix.getNcols();j++) {
                double sum = 0.0;
                for (int k=0;k<matrix1.getNcols();k++) {
                    sum += matrix1.getValueAt(i, k) * matrix2.getValueAt(k, j);
                }
                multipliedMatrix.setValueAt(i, j, sum);
            }
        }
        return multipliedMatrix;
    }

    public static Matrix transpose(Matrix matrix) {
        if(matrix == null) return null;
        Matrix transposedMatrix = new Matrix(matrix.getNcols(), matrix.getNrows());
        for (int i=0;i<matrix.getNrows();i++) {
            for (int j=0;j<matrix.getNcols();j++) {
                transposedMatrix.setValueAt(j, i, matrix.getValueAt(i, j));
            }
        }
        return transposedMatrix;
    }

    public static double determinant(Matrix matrix) {
        return 0;
    }

    public static Matrix inverse(Matrix matrix) {
        return null;
    }

    public static Matrix cofactor(Matrix matrix) {
        return null;
    }
}
