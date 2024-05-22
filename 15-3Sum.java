class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sz = nums.length;
        if(sz < 3)
            return new ArrayList<>();

        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < sz - 2; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int st = i + 1;
            int en = sz - 1;

            while (st < en)
            {
                int sum = nums[i] + nums[st] + nums[en];

                if(sum == 0)
                {
                    ans.add(Arrays.asList(nums[i], nums[st], nums[en]));
                    st++;
                }
                else if(sum > 0)
                {
                    en--;
                }
                else
                    st++;
            }

        }
        return ans.stream().toList();
    }
}