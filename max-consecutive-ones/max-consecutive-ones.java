class Solution {

// MY SOLUTION
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        int max = 0;
        for(int number:nums){
            if(number==1)
                length += 1;
            else
                length = 0;
            
            if(length>=max)
                max = length;
        }
        return max;
    }



    // public int findMaxConsecutiveOnes(int[] nums) {
    //     int max = 0;
    //     int sum = 0;
    //     for(int i = 0 ; i< nums.length; i ++){
    //         sum += nums[i];
    //         if(nums[i] == 0)    // reset sum to zero when encounters zeros
    //             sum = 0;
    //         else                // keep update max
    //             max = Math.max(max, sum);
    //     }
    //     return max;
    // }
    // 1,0,1,1,0,1
    // 0,sum =1 ms=1,sum=4 ms=4
    
    
// FASTEST SOLUTION        
    // public int findMaxConsecutiveOnes(int[] nums) {
    //     int maxSum = 0, sum = 0;
    //     for (int n : nums) {
    //         sum *= n;
    //         sum += n;
    //         maxSum = Math.max(maxSum, sum);
    //         System.out.println("Sum: "+sum+" maxSum: "+maxSum);
    //     }
    //     return maxSum;
    // }

}