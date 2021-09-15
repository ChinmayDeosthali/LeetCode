class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        List<String> retList = new ArrayList<String>();
        for(List<String> ticket: tickets){
            if(hm.containsKey(ticket.get(0))){
                List<String> val = hm.get(ticket.get(0));
                val.add(ticket.get(1));
                hm.put(ticket.get(0),val);
            }
            else{
                List<String> val = new ArrayList<String>();
                val.add(ticket.get(1));
                hm.put(ticket.get(0),val);
            }
        }
        System.out.println("Adjacency List: "+ hm);
        for(Map.Entry<String,List<String>> e: hm.entrySet()){
            List<String> val = e.getValue();
            Collections.sort(val);
            e.setValue(val);
        }
        System.out.println("Sorted Adjacency List: "+ hm);
        
        Stack<String> stack = new Stack<String>();
        stack.push("JFK");
        while(!stack.isEmpty()){
            String src = stack.peek();
            System.out.println("src: "+src);
            if((hm.containsKey(src) && hm.get(src).size()==0) || !hm.containsKey(src)){
                retList.add(src);
                stack.pop();
            }
            else{
                String dst = hm.get(src).get(0);
                stack.push(dst);
                List<String> val = hm.get(src);
                val.remove(dst);
                hm.put(src,val);
            }
        }
        
        Collections.reverse(retList);
        return retList;       
    }
}