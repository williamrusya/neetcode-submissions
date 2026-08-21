class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String signature = new String(ch);

            if(!map.containsKey(signature)){
                map.put(signature, new ArrayList<>());
            }

            map.get(signature).add(str);
        }

        return new ArrayList<>(map.values());
    }

    /*
    1. Iterate through every string.
    2. Create signature that identify its anagram group.
    3. Use signature as a HashMap key.
    4. Add the original string to the corresponding group.
    5. Return all groups.
    */
}
