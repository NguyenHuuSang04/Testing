package edu.iuh.fit.sang_22636671;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Đây là lớp test cho class IsSymmetry,
 * được viết dựa trên bảng thiết kế test case.
 * Vai trò của tester là bám sát test case để tìm lỗi.
 */
class IsSymmetryTest {

    private IsSymmetry isSymmetry;

    @BeforeEach
    void setUp() {
        isSymmetry = new IsSymmetry();
    }

    @Test
    @DisplayName("TC1: Mảng đối xứng hợp lệ")
    void testSymmetricArray() {
        int[] a = {4, 3, 7, 8, 2, 8, 7, 3, 4};
        int n = 9;
        assertTrue(isSymmetry.isSymmetry(a, n));
    }

    @Test
    @DisplayName("TC2: Mảng không đối xứng hợp lệ")
    void testNonSymmetricArray() {
        int[] a = {4, 3, 7, 8, 2, 8, 7, 3, 3};
        int n = 9;
        assertFalse(isSymmetry.isSymmetry(a, n));
    }

//    @Test
//    @DisplayName("TC3: Mảng có phần tử số thực")
//    void testInvalidArray_Float_TC3() {
//        assertThrows(Exception.class, () -> {
//            int[] a_invalid = {1, 2.2, 1};
//            isSymmetry.isSymmetry(a_invalid, 3);
//        });
//
//    }
//
//    @Test
//    @DisplayName("TC4: Mảng có phần tử kiểu chuỗi")
//    void testInvalidArray_String_TC4() {
//        assertThrows(Exception.class, () -> {
//            int[] a_invalid = {1, "ha1", 1};
//            isSymmetry.isSymmetry(a_invalid, 3);
//        });
//    }
//
//    @Test
//    @DisplayName("TC5: n < 0 (n = -4)")
//    void testInvalidN_Negative4_TC5() {
//        // Input
//        int[] a = {};
//        int n = -4;
//
//        assertThrows(Exception.class, () -> {
//            isSymmetry.isSymmetry(a, n);
//        });
//    }
//
//    @Test
//    @DisplayName("TC6: n là số thực (5.5)")
//    void testInvalidN_Float_TC6() {
//        assertThrows(Exception.class, () -> {
//            int[] a = {};
//            isSymmetry.isSymmetry(a, 5.5);
//        });
//    }
//
//    @Test
//    @DisplayName("TC7: n là kiểu chuỗi (ba)")
//    void testInvalidN_String_TC7() {
//
//        assertThrows(Exception.class, () -> {
//            int[] a = {};
//            isSymmetry.isSymmetry(a, "ba");
//        });
//    }

    @Test
    @DisplayName("TC8: Lỗi n không khớp a.length (n > length)")
    void testMismatch_N_larger_than_Length() {
        int[] a = {1, 2, 1};
        int n = 9;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            isSymmetry.isSymmetry(a, n);
        });
    }

    @Test
    @DisplayName("TC9: Giá trị biên không hợp lệ (n = -1)")
    void testInvalidBoundary_NegativeN() {
        int[] a = {};
        int n = -1;
        assertThrows(Exception.class, () -> {
            isSymmetry.isSymmetry(a, n);
        });
    }

    @Test
    @DisplayName("TC10: Giá trị biên hợp lệ (n = 0)")
    void testValidBoundary_ZeroN() {
        int[] a = {};
        int n = 0;
        assertTrue(isSymmetry.isSymmetry(a, n));
    }
}