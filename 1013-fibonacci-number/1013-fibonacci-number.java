class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        int ans = fibonacci(n);
        return ans;
    }
    public int fibonacci(int n){
        if(n<=2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}