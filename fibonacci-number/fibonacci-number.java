class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        return fibo(n,cache);
            
    }
    private int fibo(int N,HashMap<Integer, Integer> cache) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }
        int result;
        if (N < 2) {
            result = N;
        } else {
            result = fibo(N-1, cache) + fibo(N-2, cache);
        }
        // keep the result in cache.
        cache.put(N, result);
        return result;
    }
    
}