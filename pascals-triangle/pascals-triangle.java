// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> triangle = new ArrayList<List<Integer>>();
//         for(int i=0; i < numRows; i++){
//             List<Integer> row = new ArrayList<Integer>();
//             for(int j=0; j<=i; j++){
//                 row.add(getElem(i,j));
//             }
//             triangle.add(row);
//         }
//         return triangle;
        
//     }
    
//     public int getElem(int i, int j){
//         if(j==0 || j==i)
//             return 1;
        
//         return getElem(i-1,j-1) + getElem(i-1,j);
//     }
// }

//Leetcode premium soln
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // Base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
