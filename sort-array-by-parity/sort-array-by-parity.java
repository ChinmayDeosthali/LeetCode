class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            while(nums[start]%2!=0 && (start<end)){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
            start++;
        }
        return nums;
    }
}