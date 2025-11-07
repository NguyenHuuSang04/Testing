package edu.iuh.fit.sang_22636671;

public class IsSymmetry {
    public boolean isSymmetry(int[] a, int n)
    {
        for (int i = 0; i < n / 2; i++)
        {
            if (a[i] != a[n - i - 1])
            {
                return false;
            }
        }

        return true;
    }
}
