class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3 || arr ==null)
            return false;
        if(arr[1] < arr[0])
            return false;
        
        boolean flag = false;
        for(int i = 1; i < arr.length; i++){
            if(flag == false){
                // if(arr[i]>arr[i-1]){
                //     continue;
                // }
                if(arr[i] < arr[i-1]){
                    flag = true;
                }
                else if(arr[i] == arr[i-1])
                    return false;
            }
            else{
                if(arr[i] >= arr[i-1]){
                    return false;
                }
            }            
        }
        if(flag == true)
            return true;
        return false;
    }
}