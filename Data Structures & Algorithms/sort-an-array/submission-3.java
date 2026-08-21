class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length < 2){
            return nums;
        }

        int min = nums[0];
        int max = nums[0];

        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] counts = new int[max - min + 1];


        for(int num : nums){
            counts[num - min]++;
        }

        int numsIndex = 0;

        for(int countIndex = 0; countIndex < counts.length; countIndex++){
            int number = countIndex + min;

            while(counts[countIndex] > 0){
                nums[numsIndex] = number;
                numsIndex++;
                counts[countIndex]--;
            }
        }
        return nums;
    }
    
}