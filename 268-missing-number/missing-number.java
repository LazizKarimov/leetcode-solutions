class Solution {
    public int missingNumber(int[] nums) {
        
        int i = 0;
        int sumNums = 0;
        int len = nums.length;

        while (i < len) {
            sumNums += nums[i];
            i++;
        }

        int sumNums2 = 0;
        for(int j = 0; j <= nums.length; j++) {
            sumNums2 += j;
        }

        return sumNums2 - sumNums;   
    }
}