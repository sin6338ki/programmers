class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();
        
        for(String s : strs){
            char[] sCharArr = s.toCharArray();
            Arrays.sort(sCharArr);
            String key = String.valueOf(sCharArr);
            
            if(!anagrams.containsKey(key))
                anagrams.put(key, new ArrayList<>());
            
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
        
    }
}