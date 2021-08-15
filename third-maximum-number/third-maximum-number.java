class Solution {
    
//     public int thirdMax(int[] nums) {
//         int max1 = nums[0], max2 = nums[0], max3 = nums[0];

//         for(int i = 1; i < nums.length; i++){
//          if(nums[i] > max1){
//              max3 = max2;
//              max2 = max1;
//              max1 = nums[i];
//          }
//          if(nums[i] < max1 && nums[i] > max2){
//              max3 = max2;
//              max2 = nums[i];
//          }
//          if(nums[i] > max3){
//              max3 = nums[i];
//          }
//         System.out.println("nums[i]: "+nums[i]); 
//         System.out.println("max1: "+max1);
//         System.out.println("max2: "+max2);
//         System.out.println("max3: "+max3);

//         }
        

//         if(max3 < max2 && max2 < max1)
//             return max3;
        
//         return max1;
        
        
//     }
    
    // public int thirdMax(int[] nums) {
    //     int max1 = Integer.MIN_VALUE;
    //     int max2 = Integer.MIN_VALUE;
//         int max3 = Integer.MIN_VALUE;
        
//         for(int num: nums){
            
//             if(num > max1){
//                 max3 = max2;
//                 max2 = max1;
//                 max1 = num;
//             }
//             else if(num > max2 && num < max1){
//                 max3 = max2;
//                 max2 = num;
//             }
//             else if(num > max3 && num < max2)
//                 max3 = num;
            
//             System.out.println("max1: "+max1);
//             System.out.println("max2: "+max2);
//             System.out.println("max3: "+max3);
//             System.out.println();
            
//         }
        

//         if(nums.length < 3)
//             return max1;
//         if(max3 < max2 && max2 < max1 && max3 > Integer.MIN_VALUE)
//             return max3;
        
//         return max1;
        
        
        
//     }
    
    public int thirdMax(int[] nums) {
        
        if(nums.length<3)
            return findMax(nums);
        
        int firstMax = findMax(nums);
        // System.out.println("firstMax: "+firstMax);
        int countFirstMax = 0;
        for(int num: nums){
            if(num==firstMax)
                countFirstMax++;
        }
        
        int[] nums1 = new int[nums.length-countFirstMax];
        int j=0;
        for(int num: nums){
            if(num!=firstMax){
                nums1[j++] = num; 
            }
        }
        
        if(nums1.length==0)
            return firstMax;
        
        int secondMax = findMax(nums1);
        // System.out.println("secondMax: "+secondMax);
        int countSecondMax = 0;
        for(int num: nums1){
            if(num==secondMax)
                countSecondMax++;
        }
        
        int[] nums2 = new int[nums1.length-countSecondMax];
        int k=0;
        for(int num: nums1){
            if(num!=secondMax){
                nums2[k++] = num; 
            }
        }
        
        if(nums2.length == 0)
            return firstMax;
        
        int thirdMax = findMax(nums2);
        // System.out.println("thirdMax: "+thirdMax);
        return thirdMax;    
    }
    
    public int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            // System.out.print(num+",");
            if(num>=max)
                max = num;
        }
        // System.out.println();
        return max;
    }
}