class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = -1;
        for (int num : deck) {
            int newFrequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, newFrequency);
            if (newFrequency > maxFrequency) {
                maxFrequency = newFrequency;
            }
        }

        for(int i = 2; i <= maxFrequency; i++)
        {
            boolean ans = true;
            for(int freq : frequencyMap.values())
            {
                if(freq % i != 0)
                {
                    ans = false;
                    break;
                }
            }
            if(ans)
                return true;
        }
        return false;
    }
}