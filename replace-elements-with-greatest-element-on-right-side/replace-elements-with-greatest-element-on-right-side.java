class Solution {
    public int[] replaceElements(int[] arr) {
        
        //my solution
//         for(int i=0; i < (arr.length-1); i++){
            
//             int max= Integer.MIN_VALUE;
//             for(int j=(i+1);j<arr.length;j++){
//                 if(arr[j]>=max)
//                     max = arr[j];                
//                 arr[i] = max;
//                 }            
//         }
//         arr[arr.length-1] = -1;
//         return arr;
        
        
        
         int right=-1, temp;
        for (int i = arr.length - 1; i >= 0; --i){
            temp = arr[i];
            arr[i]=right;
            right = Math.max(temp, right);        
        }
        return arr;
    }
}