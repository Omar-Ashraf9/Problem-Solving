class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n)
        {
            /**
             * i   -> index to iterate over nums1.
             * j   -> index to iterate over nums2.
             * idx -> index to iterate over the resultant array.
             * The idea: fill the resultant array from the end by comparing two values located at the same index among the two arrays.
             */
            int i = m - 1, j = n - 1, idx = n + m - 1;
            while(i >= 0 && j >= 0)
            {
                if(nums1[i] >= nums2[j])
                    nums1[idx--] = nums1[i--];
                else
                    nums1[idx--] = nums2[j--];
            }
            while(i >= 0)
                nums1[idx--] = nums1[i--];
            while(j >= 0)
                nums1[idx--] = nums2[j--];
        }
};