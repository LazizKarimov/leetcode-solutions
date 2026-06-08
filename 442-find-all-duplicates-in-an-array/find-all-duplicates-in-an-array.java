class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length == 1){
            return new ArrayList();
        }

        Map<Integer, Integer> mapa = new HashMap<>();

    int i = 0;
    while (i < nums.length){
        mapa.put(nums[i], mapa.getOrDefault(nums[i], 0) + 1);
        i++;
    }
    
    List<Integer> resList = new ArrayList();

    for(Map.Entry<Integer, Integer> entry : mapa.entrySet()){
        if (entry.getValue() % 2 == 0) {
            resList.add(entry.getKey());
        }
    }
    return resList;
    }
}