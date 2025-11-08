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
        // Mong đợi: TRUE. Code sẽ trả về TRUE.
        // Test này sẽ PASS.
        assertTrue(isSymmetry.isSymmetry(a, n));
    }

    @Test
    @DisplayName("TC2: Mảng không đối xứng hợp lệ")
    void testNonSymmetricArray() {
        int[] a = {4, 3, 7, 8, 2, 8, 7, 3, 3}; // Số cuối là 3
        int n = 9;
        // Mong đợi: FALSE. Code sẽ trả về FALSE (vì 4 != 3).
        // Test này sẽ PASS.
        assertFalse(isSymmetry.isSymmetry(a, n));
    }

    @Test
    @DisplayName("TC3: Mảng có phần tử số thực")
    void testInvalidArray_Float_TC3() {
         int[] a = {1, 2.2, 1}; // Lỗi biên dịch
         int n = 3;
        // Expected: Exception

        // Ghi chú: TC3 là lỗi biên dịch, không phải lỗi runtime.
        // Java không cho phép gán giá trị 2.2 (số thực) vào mảng int[].

        /*
        // Đây là assert mong muốn, nhưng nó sẽ không biên dịch:
        assertThrows(Exception.class, () -> {
            // Lỗi: "double cannot be converted to int"
            // int[] a_invalid = {1, 2.2, 1};
            // isSymmetry.isSymmetry(a_invalid, n);
        }, "TC3: Mong đợi lỗi do mảng chứa số thực");
        */
        System.out.println("TC3: Không thể test runtime - Lỗi biên dịch (Mảng chứa số thực)");
    }
    @Test
    @DisplayName("TC3-TC7: Lỗi biên dịch (Invalid Type)")
    void testInvalidTypes_CompileErrors() {
        // Ghi chú: TC3, TC4, TC5, TC6, TC7 không thể test bằng JUnit.
        // Lý do: Java là ngôn ngữ định kiểu mạnh.
        // 1. (TC3, TC4) Bạn không thể đưa số thực (2.2) hoặc chuỗi ("ha1") vào một mảng int[].
        // 2. (TC5, TC6, TC7) Bạn không thể truyền 1.4, 5.5, hoặc "ba" vào tham số (int n).
        // Tất cả đều là lỗi biên dịch (Compile Error), không phải lỗi lúc chạy (Runtime Error).
        assertTrue(true);
    }

    @Test
    @DisplayName("TC8: Lỗi n không khớp a.length (n > length)")
    void testMismatch_N_larger_than_Length() {
        int[] a = {1, 2, 1};
        int n = 9;
        // Mong đợi: Exception (Từ bảng test case)
        // Thực tế: Code sẽ ném ra ArrayIndexOutOfBoundsException
        // khi cố gắng truy cập a[n-i-1] (ví dụ: a[8]).
        // Test này sẽ PASS (vì code đã ném ra lỗi như mong đợi).
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            isSymmetry.isSymmetry(a, n);
        });
    }

    @Test
    @DisplayName("TC9: Giá trị biên không hợp lệ (n = -1)")
    void testInvalidBoundary_NegativeN() {
        int[] a = {};
        int n = -1;
        // Mong đợi: Exception (Từ bảng test case)
        // Thực tế: Code sẽ trả về TRUE (vì vòng lặp for(i=0; i<0; i++) bị bỏ qua).
        // Do đó, test này sẽ FAIL (Thất bại) - và đây chính là BUG.
        // Là một tester, bạn phải viết test case mong đợi "Exception".
        assertThrows(Exception.class, () -> {
            isSymmetry.isSymmetry(a, n);
        });
    }

    @Test
    @DisplayName("TC10: Giá trị biên hợp lệ (n = 0)")
    void testValidBoundary_ZeroN() {
        int[] a = {};
        int n = 0;
        // Mong đợi: TRUE (Từ bảng test case)
        // Thực tế: Code sẽ trả về TRUE (vì vòng lặp for(i=0; i<0; i++) bị bỏ qua).
        // Test này sẽ PASS.
        assertTrue(isSymmetry.isSymmetry(a, n));
    }
}