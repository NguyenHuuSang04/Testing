//package edu.iuh.fit;
//
///**
// * @Dự án: Nhom_11_TestTool_JUnit
// * @Class: Max
// * @Tạo vào ngày: 10/19/2025
// * @Tác giả: Nguyen Huu Sang
// */
//public class Max {
//    public int Max(int A, int B, int C) {
//        if (A < 1 || A > 50 || B < 1 || B > 50 || C < 1 || C > 50) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        if (A > B) {
//            if (A > C) {
//                return A;
//            }
//
//            return B;
//        }
//
//        if (B > C) {
//            return B;
//        }
//
//        return C;
//    }
//
//}

package edu.iuh.fit.sang_22669281;

/**
 * Implementation của hàm Max (logic theo yêu cầu).
 * Nếu bất kỳ tham số nào <1 hoặc >50 => ném IndexOutOfBoundsException
 */
public class Max {

    public int Max(int A, int B, int C) {
        if (A < 1 || A > 50 || B < 1 || B > 50 || C < 1 || C > 50) {
            throw new IndexOutOfBoundsException();
        }

        if (A > B) {
            if (A > C) {
                return A;
            }
            return B;
        }

        if (B > C) {
            return B;
        }

        return C;
    }
}