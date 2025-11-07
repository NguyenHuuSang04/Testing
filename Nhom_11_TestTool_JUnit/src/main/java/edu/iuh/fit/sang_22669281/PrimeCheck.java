package edu.iuh.fit.sang_22669281;

/**
 * @Dự án: Nhom_11_TestTool_JUnit
 * @Class: primeCheck
 * @Tạo vào ngày: 10/19/2025
 * @Tác giả: Nguyen Huu Sang
 */
public class PrimeCheck {

    public boolean primeCheck(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        if (num > 1000) {
            throw new IllegalArgumentException("Number must be <= 1000.");
        }

        double num2 = Math.sqrt(1000.0);
        boolean[] array = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            array[i] = true;
        }

        int num3 = 2;
        for (int i = num3 + num3; i <= 1000; i += num3) {
            array[i] = false;
        }

        for (num3 = 3; num3 <= num2; num3 += 2) {
            if (array[num3]) {
                for (int i = num3 + num3; i <= 1000; i += num3) {
                    array[i] = false;
                }
            }
        }

        return array[num];
    }
}