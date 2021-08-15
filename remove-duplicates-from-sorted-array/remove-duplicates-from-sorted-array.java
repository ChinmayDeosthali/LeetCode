class Solution {
    public int removeDuplicates(int[] nums) {
        
        int m = 0;

        
        // Two-pointer approach
        if(nums.length == 1)
            return 1;
        else if(nums.length == 0)
            return 0;        
        else{
            for(int i=1;i<nums.length;i++){

                if(nums[i]==nums[m]){
                    continue;
                }
                else{
                    nums[m+1] = nums[i];
                    m++;
                }
            }
            return m+1;
        }
        
        
        
        
        
        
        
//     int len = nums.length;
//         int i = 0;
//         while(i < (len-1)){
//             while(nums[i] == nums[i+1]){
//                 for(int j=i;j<(len-1);j++){
//                     nums[j] = nums[j+1];
//                 }
//                 nums[len-1] = Integer.MAX_VALUE;
//                 len--;
//             }
//             i++;
//         }


//         // System.out.println("len: " + len);
//         // System.out.println("nums: ");
//         // for (int l = 0; l < len; l++) {
//         //     System.out.print(nums[l]);
//         // }
//         // System.out.println();
//         return len;
    }
}