class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> as = new HashSet<Integer>();
        for(int i=0;i < arr.length; i++){
            if(as.contains(arr[i]*2) || (as.contains(arr[i]/2) && arr[i]%2==0))
                return true;
            as.add(arr[i]);
        }
        return false;
    }
}