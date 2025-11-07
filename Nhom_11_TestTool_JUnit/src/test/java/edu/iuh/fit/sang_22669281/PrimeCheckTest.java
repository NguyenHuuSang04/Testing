package edu.iuh.fit.sang_22669281;

/**
 * @Dự án: Nhom_11_TestTool_JUnit
 * @Class: PrimeCheckTest
 * @Tạo vào ngày: 10/19/2025
 * @Tác giả: Nguyen Huu Sang
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PrimeCheckTest {

    PrimeCheck prime = new PrimeCheck();

    // #01 - #03: Valid partition
    @Test
    void testPrimeNumberValid() throws Exception {
        assertTrue(prime.primeCheck(3)); // #01 là số nguyên tố
        assertFalse(prime.primeCheck(4)); // #02 không là số nguyên tố
        assertFalse(prime.primeCheck(1)); // #03 đặc biệt: 1 không phải số nguyên tố
    }

    // #08 - #09: Valid boundary
    @Test
    void testPrimeNumberBoundary() throws Exception {
        assertFalse(prime.primeCheck(0));   // #08 giá trị biên: 0
        assertFalse(prime.primeCheck(1000)); // #09 giá trị biên: 1000
    }

    // #04 - #05 - #10 - #11: Invalid numeric range
    @Test
    void testPrimeNumberInvalidRange() {
        assertThrows(Exception.class, () -> prime.primeCheck(-2));   // #04 nhỏ hơn 0
        assertThrows(Exception.class, () -> prime.primeCheck(1002)); // #05 lớn hơn 1000
        assertThrows(Exception.class, () -> prime.primeCheck(-1));   // #10 biên dưới không hợp lệ
        assertThrows(Exception.class, () -> prime.primeCheck(1001)); // #11 biên trên không hợp lệ
    }

    // #06 - #07: Invalid input type & empty input
    @Test
    void testPrimeNumberInvalidInput() {
        // #06 - Trường hợp không phải số nguyên
        assertThrows(Exception.class, () -> {
            String input = "aa";
            int num = Integer.parseInt(input); // sẽ ném NumberFormatException
            prime.primeCheck(num);
        });

        // #07 - Trường hợp không nhập (rỗng)
        assertThrows(Exception.class, () -> {
            String input = "";
            int num = Integer.parseInt(input); // sẽ ném NumberFormatException
            prime.primeCheck(num);
        });
    }
}
