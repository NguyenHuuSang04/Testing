package edu.iuh.fit.sang_22636671;

public class Largest {
    public int Largest(int[] list) {
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] > num)
            {
                num = list[i];
            }
        }

        return num;
    }
}
