// Copied from solutions
class Solution {
  public void rotate(int[] nums, int k) {
        int numsbck[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int offset = (i + k)%(nums.length);
            int temp = nums[i];
            numsbck[offset] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsbck[i];
        }
  }
}