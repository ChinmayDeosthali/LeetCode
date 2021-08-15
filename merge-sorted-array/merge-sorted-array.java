class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = 0;
        int i = 0, j = 0;
        int[] nums3 = new int[nums1.length];
        while(i < m && j < n){
            if(nums1[i]>nums2[j]){
                nums3[pos] = nums2[j];
                pos++;
                j++;
            }
            else{
                nums3[pos] = nums1[i];
                pos++;
                i++;
            }
        }
        if(i==m){
            while(j<n){
                nums3[pos] = nums2[j];
                pos++; 
                j++;
            }
        }
        else{
            while(i<m){
                nums3[pos] = nums1[i];
                pos++; 
                i++;
            }
        }
        pos = 0;
        for(int num: nums3){
            nums1[pos++] = num;
        }
    }
}