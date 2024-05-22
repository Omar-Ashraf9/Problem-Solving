class Solution {
     public String removeNonAlphaNumeric(String s)
    {
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
                ans.append(c);
        }
        return ans.toString().toLowerCase();
    }
    public boolean isPalindrome(String s) {
        String afterProcess = removeNonAlphaNumeric(s);
        int sz = afterProcess.length();
        for(int i = 0; i < sz/2; i++)
        {
            if(afterProcess.charAt(i) != afterProcess.charAt(sz - i - 1))
                return false;
        }
        return true;
    }
}