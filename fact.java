public class fact{
    public static void main(String[] args){
        int ans = factorial(5);
        System.out.print(ans);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = factorial(n-1);
        System.out.println(fact);
        return n*fact;
    }
}