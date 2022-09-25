package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AppTest {

    private Matrix matrix1;
    private Matrix matrix2;
    private Matrix matrix3;
    private Matrix matrix4;

    @BeforeEach
    void setUp() { // Create object before compilation
        matrix1 = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        matrix2 = new Matrix(new double[][]{{11, 12, 13}, {2, 3, 1}, {18, 42,0}});
        matrix3 = new Matrix(new double[][]{{1, 5, 9}, {7, 3, 2}});
        matrix4 = new Matrix(new double[][]{{1, 0, 0}, {0, 1, 0}, {0, 0,1}});
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

}
