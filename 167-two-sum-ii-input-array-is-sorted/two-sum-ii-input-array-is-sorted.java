class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        int [] resIndxs = new int[2];

        while (leftPointer < rightPointer) { 
            int sum = numbers[leftPointer] + numbers[rightPointer];

            if (sum == target) {
                resIndxs[0] = leftPointer + 1;
                resIndxs[1] = rightPointer + 1;
                return resIndxs;
            }

            if (sum < target) {
                leftPointer++;
            }
            if (sum > target) {
                rightPointer--;
            }
        }

        return resIndxs;
    }
}