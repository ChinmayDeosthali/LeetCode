class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for(int num:nums){
            int count = countDigits(num);
            if (count%2 ==0)
                evenDigitCount++;
        }
        return evenDigitCount;
    }
    
    public int countDigits(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }
}