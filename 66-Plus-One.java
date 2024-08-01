class Solution {
    public int[] plusOne(int[] digits) {
        int sz = digits.length;
        for(int i = sz - 1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] newNum = new int[sz + 1];
        newNum[0] = 1;
        return newNum;
    }
}