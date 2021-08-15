class Solution {
    
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1;
        int[] result = Arrays.copyOf(nums,nums.length);
        int j = nums.length - 1;
        while(left <= right){
            if(Math.abs(nums[right]) >= Math.abs(nums[left])){
                result[j] = nums[right]*nums[right];
                right--;
            }
            else {
                result[j] = nums[left]*nums[left];
                left++;
            }
            j--;
        }
        return result;
    }
    
    
//     public int[] sortedSquares(int[] nums) {
//         // for(int i = 0; i<nums.length; i++){
//         //     nums[i] = nums[i]*nums[i];
//         // }
//         // Arrays.sort(nums);
        
//         int right = nums.length;
//         for(int i=0; i <nums.length; i++){
//             if(nums[i]>=0){
//                 right = i ;
//                 break;
//             }
//         }
//         int left = right -1;
//         System.out.println("1");
//         int[] newArray = new int[nums.length];
//         int pos = 0;
//         while(left>=0 && right<=nums.length-1){
//             System.out.println("right: "+right+", left: "+left);
//             if(Math.abs(nums[left]) <= Math.abs(nums[right])){
//                 newArray[pos] = nums[left];
//                 left--;
//             }
//             else{
//                 newArray[pos] = nums[right];
//                 right++;
//             }
//             pos++;
//         }
//         System.out.println("2");
//         if(left==-1){
//             while(right!=nums.length){
//                 newArray[pos] = nums[right];
//                 right++;
//                 pos++;
//             }                
//         }
//         else{
//             while(left!=-1){
//                 newArray[pos] = nums[left];
//                 left--;
//                 pos++;
//             } 
//         }
//         System.out.println("3");
//         for(int i = 0; i<newArray.length; i++){
//             newArray[i] = newArray[i]*newArray[i];
//         }
        
        
//         return newArray;
//     }
}