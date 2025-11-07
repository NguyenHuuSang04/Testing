package edu.iuh.fit.sang_22669281;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Parameterized tests for Max using JUnit 5.
 *
 * Quy ước expected:
 * - "IndexOutOfRangeException" => mong Max ném IndexOutOfBoundsException
 * - "FormatException" => mong parsing input gặp lỗi (NumberFormatException) -> coi là FormatException
 * - numeric => so sánh giá trị trả về
 */
public class TestMax {

    @DisplayName("Max parameterized test cases")
    @ParameterizedTest(name = "Case {index} => A={0}, B={1}, C={2} -> expected={3}")
    @CsvSource(value = {
            "5,6,3,6",
            "-5,6,7,IndexOutOfRangeException",
            "55,6,7,IndexOutOfRangeException",
            "a,6,7,FormatException",
            "null,6,7,FormatException",
            "6,-5,7,IndexOutOfRangeException",
            "6,55,7,IndexOutOfRangeException",
            "6,a,7,FormatException",
            "6,null,7,FormatException",
            "7,6,-5,IndexOutOfRangeException",
            "7,6,55,IndexOutOfRangeException",
            "7,6,a,FormatException",
            "7,6,null,FormatException",
            "1,4,7,7",
            "50,2,3,50",
            "4,1,7,7",
            "2,50,3,50",
            "2,2,1,2",
            "2,2,50,50",
            "-1,2,3,IndexOutOfRangeException",
            "51,2,3,IndexOutOfRangeException",
            "2,-1,3,IndexOutOfRangeException",
            "2,51,3,IndexOutOfRangeException",
            "2,2,-1,IndexOutOfRangeException",
            "2,2,51,IndexOutOfRangeException"
    }, nullValues = "null")
    void testMaxParameterized(String aStr, String bStr, String cStr, String expected) {
        Max math = new Max();

        // chuyển literal "null" => null (CsvSource nullValues đã làm việc), nhưng bảo đảm parse logic cho null
        try {
            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);
            int c = Integer.parseInt(cStr);

            if ("IndexOutOfRangeException".equals(expected)) {
                // mong ném IndexOutOfBoundsException
                assertThrows(IndexOutOfBoundsException.class, () -> math.Max(a, b, c),
                        () -> "Expected IndexOutOfBoundsException for input: " + aStr + "," + bStr + "," + cStr);
            } else {
                // mong trả về số
                int expectedValue = Integer.parseInt(expected);
                int actual = math.Max(a, b, c);
                assertEquals(expectedValue, actual,
                        "Incorrect result for input: " + aStr + "," + bStr + "," + cStr);
            }
        } catch (NumberFormatException nfe) {
            // Nếu input không thể parse (ví dụ "a" hoặc null), mong expected là FormatException
            if ("FormatException".equals(expected)) {
                // Passed: parse error tương đương FormatException theo yêu cầu
            } else {
                fail("Unexpected NumberFormatException while parsing inputs: " + aStr + "," + bStr + "," + cStr + " -> " + nfe.getMessage());
            }
        } catch (IndexOutOfBoundsException iobe) {
            // Nếu hàm ném IndexOutOfBoundsException khi gọi, kiểm tra expected
            if ("IndexOutOfRangeException".equals(expected)) {
                // pass
            } else {
                fail("Unexpected IndexOutOfBoundsException for input: " + aStr + "," + bStr + "," + cStr);
            }
        } catch (Exception ex) {
            fail("Unexpected exception: " + ex.getClass().getName() + " - " + ex.getMessage());
        }
    }
}