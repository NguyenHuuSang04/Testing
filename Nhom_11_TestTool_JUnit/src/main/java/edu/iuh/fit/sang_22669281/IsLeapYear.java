package edu.iuh.fit.sang_22669281;

/**
 * @Dự án: Nhom_11_TestTool_JUnit
 * @Class: IsLeapYear
 * @Tạo vào ngày: 10/19/2025
 * @Tác giả: Nguyen Huu Sang
 */
public class IsLeapYear {
    public boolean isLeapYear(int n)
    {
        if (n % 4 == 0 || (n % 100 == 0 && n % 400 == 0))
        {
            return true;
        }
        return false;
    }
}