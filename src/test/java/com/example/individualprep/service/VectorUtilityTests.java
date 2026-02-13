package com.example.individualprep.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class VectorUtilityTests {
    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    @DisplayName("Should return sum of two vectors when dimensions match")
    void add_Success() {
        double[] vectorA = {2.0, 3.0, 10.0};
        double[] vectorB = {6.0, 5.0, 7.0};
        double[] expectedResult = {8.0, 8.0, 17.0};

        double[] actualResult = vectorUtility.add(vectorA, vectorB);

        assertArrayEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should handle negative numbers correctly in addition")
    void add_Negative_Success() {
        double[] negativeVector = {-10.0, -2.0};
        double[] mixedVector = {2.0, -3.0};
        double[] expectedResult = {-8.0, -5.0};

        double[] actualResult = vectorUtility.add(negativeVector, mixedVector);

        assertArrayEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should throw exception when vector dimensions mismatch in addition")
    void add_DimensionMismatch_ThrowsException() {
        double[] vector2D = {6.0, 2.0};
        double[] vector3D = {3.0, 8.0, 3.0};

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(vector2D, vector3D));
    }

    

    @Test
    @DisplayName("Should return correct dot product of two vectors")
    void dotProduct_Success() {
        double[] vectorA = {1.0, 2.0, 3.0};
        double[] vectorB = {4.0, 5.0, 6.0};
        double expectedResult = 32.0; 

        double actualResult = vectorUtility.dotProduct(vectorA, vectorB);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should handle negative numbers correctly in dot product")
    void dotProduct_Negative_Success() {
        double[] vectorA = {-1.0, 2.0, -3.0};
        double[] vectorB = {4.0, -5.0, 6.0};
        double expectedResult = -32.0; 

        double actualResult = vectorUtility.dotProduct(vectorA, vectorB);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should throw exception when vector dimensions mismatch in dot product")
    void dotProduct_DimensionMismatch_ThrowsException() {
        double[] vector2D = {1.0, 2.0};
        double[] vector3D = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.dotProduct(vector2D, vector3D));
    }

    @Test
    @DisplayName("Should return zero when one vector is all zeros")
    void dotProduct_ZeroVector_Success() {
        double[] vectorA = {1.0, 2.0, 3.0};
        double[] zeroVector = {0.0, 0.0, 0.0};
        double expectedResult = 0.0;

        double actualResult = vectorUtility.dotProduct(vectorA, zeroVector);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should return correct dot product for single element vectors")
    void dotProduct_SingleElement_Success() {
        double[] vectorA = {5.0};
        double[] vectorB = {3.0};
        double expectedResult = 15.0;

        double actualResult = vectorUtility.dotProduct(vectorA, vectorB);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should return correct dot product for orthogonal vectors")
    void dotProduct_OrthogonalVectors_Success() {
        double[] vectorA = {1.0, 0.0};
        double[] vectorB = {0.0, 1.0};
        double expectedResult = 0.0; 

        double actualResult = vectorUtility.dotProduct(vectorA, vectorB);

        assertEquals(expectedResult, actualResult, 0.0001);
    }
}
