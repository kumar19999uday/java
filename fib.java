public class fib {
    public static void main(String[] args){
        int ans = fib(9);
        System.out.println(ans);
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int ans  = fib(n-1)+fib(n-2);
        return ans;

    }
}
