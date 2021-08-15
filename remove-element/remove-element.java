class Solution {
    public int removeElement(int[] nums, int val) {
        
        //Both Soln work
        
//         int k =nums.length - 1;
//         for(int i=0;i<=k;i++){

//             while(nums[i]==val){
//                 if(i==k && nums[i]==val)
//                     return k;
//                 nums[i] = nums[k];
//                 k--;
//             }
//         }
//         // for(int num:nums)
//         //     System.out.print(num+",");
//         // System.out.println();
//         // System.out.println("k+1: "+(k+1));      
//         return k+1;
        
        
        
     // 2 pointer approach   
        int j =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
        
    }
}