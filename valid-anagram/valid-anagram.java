class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i),val+1);
            }
            else 
                map.put(s.charAt(i),1);            
        }
        
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==1)
                    map.remove(t.charAt(i));
                else{
                    int val = map.get(t.charAt(i));
                    map.put(t.charAt(i),val-1);
                }
            }
            else
                return false;
        }
        
        if(map.isEmpty())
            return true;
        
        return false;
    }
}