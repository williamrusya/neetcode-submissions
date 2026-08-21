class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            int number = entry.getKey();
            int count = entry.getValue();

            if(buckets[count] == null){
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(number);
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for(int count = buckets.length - 1; count >= 1; count--){
            if(buckets[count] == null){
                continue;
            }

            for(int number : buckets[count]){
                result[resultIndex] = number;
                resultIndex++;

                if(resultIndex == k){
                    return result;
                }
            }
        }

        return result;
    }

    /*
    1. Iterate through array and define frequency.
    2. Put the number and frequency to the map.

    */
}
