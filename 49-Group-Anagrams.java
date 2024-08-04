class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs)
        {
            int[] code = new int[26];

            for(char c : s.toCharArray())
                code[c - 'a']++;

            String strCode = Arrays.toString(code);
            if(!mp.containsKey(strCode))
                mp.put(strCode, new ArrayList<>());

            mp.get(strCode).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}