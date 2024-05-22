class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeftIndex(nums, target);
        result[1] = findRightIndex(nums, target);
        return result;
    }

    private int findLeftIndex(int[] nums, int target)
    {
        int left = 0, right = nums.length - 1;
        int leftIdx = -1;

        while (left <= right)
        {
            int mid = (right + left) / 2;
            if(nums[mid] == target)
            {
                leftIdx = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return leftIdx;
    }

    private int findRightIndex(int[] nums, int target)
    {
        int left = 0, right = nums.length - 1;
        int rightIdx = -1;

        while (left <= right)
        {
            int mid = (right + left) / 2;
            if(nums[mid] == target)
            {
                rightIdx = mid;
                left = mid + 1;
            }
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return rightIdx;
    }
}