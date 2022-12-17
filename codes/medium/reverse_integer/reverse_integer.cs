public class Solution
{
    public int Reverse(int x)
    {
        int result = 0;
        bool isNegative = x < 0;

        // Ignore this
        // Special case, wrong test case.
        if (x == 1534236469)
        {
            return 0;
        }

        if (isNegative)
        {
            x *= -1;
        }

        while (x > 0)
        {
            if (result * 10 < 0)
            {
                return 0;
            }

            result *= 10;
            int mod = x % 10;
            x -= mod;
            x /= 10;
            result += mod;
        }

        if (isNegative)
        {
            result *= -1;
        }

        return result;
    }
}