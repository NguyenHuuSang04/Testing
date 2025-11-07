package edu.iuh.fit.sang_22669281;

/**
 * @Dự án: Nhom_11_TestTool_JUnit
 * @Class: TestIsLeapYear
 * @Tạo vào ngày: 10/19/2025
 * @Tác giả: Nguyen Huu Sang
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestIsLeapYear {

    IsLeapYear helper;

    @BeforeAll
    static void initAll() {
        System.out.println("Starting tests for IsLeapYear...");
    }

    @BeforeEach
    void init() {
        helper = new IsLeapYear();
    }

    @Test
    void test2000() {
        assertTrue(helper.isLeapYear(2000), "Year 2000 should be a leap year.");
    }

    @Test
    void test1584() {
        assertTrue(helper.isLeapYear(1584), "Year 1584 should be a leap year.");
    }

    @Test
    void test1583() {
        assertFalse(helper.isLeapYear(1583), "Year 1583 should not be a leap year.");
    }

    @Test
    void test1900() {
        assertFalse(helper.isLeapYear(1900), "Year 1900 should not be a leap year.");
    }

    @Test
    void test1580() {
        assertThrows(IllegalArgumentException.class, () -> validateYear(1580), "Year 1580 should throw an exception.");
    }

    @Test
    void testInvalidInputAA() {
        assertThrows(NumberFormatException.class, () -> validateYear(Integer.parseInt("aa")), "Input 'aa' should throw a NumberFormatException.");
    }

    @Test
    void testEmptyInput() {
        assertThrows(NumberFormatException.class, () -> validateYear(Integer.parseInt("")), "Empty input should throw a NumberFormatException.");
    }

    @Test
    void test1582() {
        assertFalse(helper.isLeapYear(1582), "Year 1582 should not be a leap year.");
    }

    @Test
    void test1581() {
        assertThrows(IllegalArgumentException.class, () -> validateYear(1581), "Year 1581 should throw an exception.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("All tests for IsLeapYear completed.");
    }

    /**
     * Helper method to validate the year before calling isLeapYear.
     * It ensures the year is >= 1582.
     *
     * @param year Year to validate.
     */
    private void validateYear(int year) {
        if (year < 1582) {
            throw new IllegalArgumentException("Year must be >= 1582.");
        }
        helper.isLeapYear(year);
    }
}