package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;


public class AppTest {

    private Matrix matrix1;
    private Matrix matrix2;
    private Matrix matrix3;

    @BeforeEach
    void setUp() { // Create object before compilation
        matrix1 = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        matrix2 = new Matrix(new double[][]{{11, 12, 13}, {2, 3, 1}, {18, 42,0}});
        matrix3 = new Matrix(new double[][]{{1, 5, 9}, {7, 3, 2}});
    }

    @Test
    void testAddition1(){
        Matrix sum = App.addition(matrix1, matrix2);
        Assertions.assertArrayEquals(sum.getValues(), new double[][]{{12, 14, 16}, {6, 8, 7}, {25, 50, 9}});
    }

    @Test
    void testAddition2(){
        Assertions.assertNull(App.addition(matrix1, matrix3));
    }

    @Test
    void testAddition3(){
        Assertions.assertNull(App.addition(matrix1, null));
    }

    @Test
    void testSubtraction1(){
        Matrix sum = App.subtraction(matrix1, matrix2);
        Assertions.assertArrayEquals(sum.getValues(), new double[][]{{-10, -10, -10}, {2, 2, 5}, {-11, -34, 9}});
    }

    @Test
    void testSubtraction2(){
        Assertions.assertNull(App.subtraction(matrix1, matrix3));
    }

    @Test
    void testSubtraction3(){
        Assertions.assertNull(App.subtraction(matrix1, null));
    }

    @Test
    void testMultiply1() throws IllegalDimensionException {
        Matrix mult = App.multiply(matrix1, matrix2);
        Assertions.assertArrayEquals(mult.getValues(), new double[][]{{69, 144, 15}, {162, 315, 57}, {255, 486, 99}});
    }

    @Test
    void testMultiply3(){
        Assertions.assertNull(App.addition(matrix1, null));
    }

    @Test
    void testTranspose1(){
        Matrix tr = App.transpose(matrix1);
        Assertions.assertArrayEquals(tr.getValues(), new double[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
    }

    @Test
    void testTranspose2(){
        Assertions.assertNull(App.transpose(null));
    }

    @Test
    void testTranspose3(){
        Matrix tr = App.transpose(matrix3);
        Assertions.assertArrayEquals(tr.getValues(), new double[][]{{1, 7}, {5, 3}, {9, 2}});
    }

    @Test
    void testDetermined1() throws NoSquareException {
        Matrix oneDet = new Matrix(new double[][]{{1}});
        Assertions.assertEquals(1, App.determinant(oneDet));
    }


    @Test
    void testDetermined2() throws NoSquareException {
        Assertions.assertEquals(0, App.determinant(matrix1));
    }

    @Test
    void testCofactor() throws NoSquareException {
        Matrix cof = App.cofactor(new Matrix(new double[][]{{2, 1, 3}, {2, 5, 2}, {1, 9, 8}}));
        Assertions.assertArrayEquals(cof.getValues(), new double[][]{{22, -14, 13}, {19, 13, -17}, {-13, 2, 8}});
    }
}
