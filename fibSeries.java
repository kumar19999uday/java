package recursion;
public class fibSeries{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        pfibonacci(a,b,n-2);
    }
    public static void pfibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        pfibonacci(b, c, n-1);
    }
}
