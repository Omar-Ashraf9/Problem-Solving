class Solution {
    private static final int SZ = 1005;
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[SZ];
        boolean[] vis = new boolean[SZ];
        int len = target.length;
        for(int i = 0; i < len; i++)
        {
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        boolean ans = true;
        for(int q : freq)
        {
            if(q != 0)
            {
                ans = false;
                break;
            }
        }
        return ans;
    }
}