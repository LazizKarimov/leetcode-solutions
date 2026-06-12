class Solution {
    public int removeDuplicates(int[] nums) {

        Arrays.sort(nums);

        int i = 0;
        int j = 1;
        int len = nums.length;

        while (j < len) {
            if (nums[j] != nums[i]) { 
                i++;
                nums[i] = nums[j];
            }

        j++;

        }

        return i + 1;
         
    }

    // private Set<Integer> integersToMap(int [] nums) {
    //     Map<Integer, Integer> mapa = new HashMap<>();

    //     for(int i : nums) {
    //         mapa.put(i, mapa.getOrDefault(i, 0) + 1);
    //     }

    //     // Set<Integer> keySet = mapa.keySet();


    //     return mapa.keySet();
    // }
}