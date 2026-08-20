class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> hashSet = new HashSet<>();

       for(int i : nums){
        hashSet.add(i);
       }

       if(nums.length != hashSet.size()) return true;

       return false;
    }
}