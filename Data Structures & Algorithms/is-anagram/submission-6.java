class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        ArrayList<Character> arrayList = new ArrayList<>();
        for(Character ch : s.toCharArray()) arrayList.add(ch);
        
        for(Character ch : t.toCharArray()){
            if(arrayList.contains(ch)){
                arrayList.remove(ch);
            } else {
                return false;
            }
        }
        return true;
    }
}
