class Solution {
    public StringBuilder convertToString(int x)
    {
        StringBuilder num = new StringBuilder();
        while (x != 0)
        {
            int digit = x % 10;
            char cDigit = (char) (digit + '0');
            num.append(cDigit);
            x /= 10;
        }
        return num;
    }
    public boolean isPalindrome(int x) {
        boolean ans = true;
        if(x < 0)
            ans = false;

        if(ans)
        {
            StringBuilder num = convertToString(x);
            int sz = num.length();

            for(int i = 0; i < sz / 2; i++)
                if(num.charAt(i) != num.charAt(sz - i - 1))
                    ans = false;
        }
        return ans;
    }
}