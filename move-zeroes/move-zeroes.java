class Solution {
    public void moveZeroes(int[] nums) {
    
        //Two - pointer approach
        
        int m = -1;
       
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                continue;
            }
            else{
               // System.out.println("i: "+i+", m: "+m);
                nums[m+1] = nums[i];
                m++;
            }
        }
        
        for(int j=m+1; j<nums.length; j++){
            nums[j] = 0;
        }
        
    }
}