package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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



}
