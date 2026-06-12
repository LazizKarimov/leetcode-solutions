class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int [] resultArray = new int [len];

        int i = 0;
        int sum = 0;
        while(i < len) { 
            sum += nums[i];
            resultArray[i] = sum;
            i++;
        }
        return resultArray;
    }
}