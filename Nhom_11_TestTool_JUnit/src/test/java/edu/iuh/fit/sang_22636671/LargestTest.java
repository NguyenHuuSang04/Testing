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

        // Test này sẽ FAIL!
        // Expected: 9
        // Actual: 2147483647 (vì logic code sai)
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("TC2: Mảng rỗng")
    void testValidPartition_TC2_EmptyArray() {
        int[] numbers = {};
        // Bạn mong đợi 2147483647
        int expectedResult = 2147483647; // Chính là Integer.MAX_VALUE

        int actualResult = largest.Largest(numbers);

        // Test này sẽ PASS!
        // Vì hàm của bạn trả về giá trị khởi tạo khi mảng rỗng
        assertEquals(expectedResult, actualResult);
    }
}
