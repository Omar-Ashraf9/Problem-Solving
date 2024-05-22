class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0, en = numbers.length - 1;
        int []res = new int[2];
        while(st <= en)
        {
            int sol = numbers[st] + numbers[en];
            if(sol == target)
            {
                res[0] = st + 1;
                res[1] = en + 1;
                return res;
            }else if(sol <= target)
            {
                st++;
            }else
            {
                en--;
            }
        }
        return res;
    }
}