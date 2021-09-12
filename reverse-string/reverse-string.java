class Solution {
    public void reverseString(char[] s) {
        int start = 0;
		int end = s.length - 1;
		while(start < s.length/2){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end--;
		}		
    }
}