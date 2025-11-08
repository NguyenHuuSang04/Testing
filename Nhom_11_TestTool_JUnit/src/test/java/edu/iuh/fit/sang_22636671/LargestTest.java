package edu.iuh.fit.sang_22636671;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestTest {
    private Largest largest;

    @BeforeEach
    void setUp() {
        largest = new Largest();
    }

    @Test
    @DisplayName("TC1: Mảng số nguyên hợp lệ")
    void testValidPartition_TC1() {
        int[] numbers = {5, 1, 2, 7, 9, 3, 5, 6};
        int expectedResult = 9; // Bạn mong đợi số 9

        int actualResult = largest.Largest(numbers);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("TC2: Mảng rỗng")
    void testValidPartition_TC2_EmptyArray() {
        int[] numbers = {};

        int expectedResult = 2147483647;

        int actualResult = largest.Largest(numbers);

        assertEquals(expectedResult, actualResult);
    }

//    @Test
//    @DisplayName("TC3: Mảng chứa số thực (Invalid Partition)")
//    void testInvalidPartition_TC3_ContainsFloat() {
//         int[] numbers = {5, 1, 2, 7, 9.3, 3, 5, 6};
//         String expectedResult = "Exception";
//         int actualResult = largest.Largest(numbers);
//
//        assertEquals(expectedResult, actualResult);
//
//    }
//
//    @Test
//    @DisplayName("TC4: Mảng chứa ký tự (Invalid Partition)")
//    void testInvalidPartition_TC4_ContainsString() {
//        int[] numbers = {5, 1, 2, 7, 9, "abc", 5, 6};
//
//        String expectedResult = "Exception";
//        int actualResult = largest.Largest(numbers);
//        assertEquals(expectedResult, actualResult);
//    }
}
