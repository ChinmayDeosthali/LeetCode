class Solution {
    Integer[][] triangle;

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        triangle = new Integer[rowIndex+1][rowIndex+1];
        for(int i = 0; i <= rowIndex; i++)
            for(int j = 0; j <= rowIndex; j++)
                triangle[i][j] = 0;
        for(int i=0;i<=rowIndex;i++){
            row.add(getElem(rowIndex,i));
        }
        
        return row;
    }
    
    public int getElem(int i, int j){

       if(j==0 || j==i)
            return 1;
       if(triangle[i][j]!=0)
           return triangle[i][j];
        
        triangle[i][j] = getElem(i-1,j-1) + getElem(i-1,j);
        
        return triangle[i][j];
    }
    
    
}