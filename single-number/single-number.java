//copied from solutions
// class Solution {
//   public int singleNumber(int[] nums) {
//     HashMap<Integer, Integer> hash_table = new HashMap<>();

//     for (int i : nums) {
//       hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
//     }
//     for (int i : nums) {
//       if (hash_table.get(i) == 1) {
//         return i;
//       }
//     }
//     return 0;
//   }
// }


class Solution{
    public int singleNumber(int[] nums) {
     
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(set.contains(i))
                set.remove(i);
            else 
                set.add(i);
        }
        Iterator<Integer> i = set.iterator();
        return i.next();
        
    }  
    
}