class Solution {
    // public List<Integer> findDisappearedNumbers(int[] nums) {
    //     int j = 0;
    //     List<Integer> list = new ArrayList<Integer>();
    //     HashSet<Integer> set = new HashSet<Integer>();

    //     for(int num: nums)
    //         set.add(num);
    //     for(int i = 0; i < nums.length; i++){
    //         if(!set.contains(i+1)){
    //             list.add(i+1);
    //         }
    //     }
    //     return list;
    // }
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();
    for (int n : nums) {
        int i = Math.abs(n) - 1;
        nums[i] = -Math.abs(nums[i]);
    }
    for(int num: nums)
        System.out.println(num+",");
    System.out.println();    
    for (int i = 0; i < nums.length; ++i) {
        if (nums[i] > 0) {
            result.add(i + 1);
        }
    }
    return result;
    }
}