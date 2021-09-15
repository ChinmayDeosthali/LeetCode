class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int pLength = p.length();
        for(int i = 0; i <= s.length()-pLength; i++){
            String sub = s.substring(i, i+pLength);
           // System.out.println("i: "+i+", sub: "+sub+", p:"+p);
            if(isAnagram(sub, p))
                list.add(i);
        }
        return list;
    }
    
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
}
}