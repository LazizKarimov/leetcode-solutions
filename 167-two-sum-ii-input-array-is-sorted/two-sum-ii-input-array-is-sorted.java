class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int [] resIndxs = new int[2];

        int i = 0;
        while (i < length) {
            int j = i + 1;
            while (j < length) {
                if (numbers[i] + numbers[j] == target){
                    resIndxs[0] = i + 1;
                    resIndxs[1] = j + 1;
                    return resIndxs;
                }
                j++;
            }
            i++;
        }
        return resIndxs;
    }
}