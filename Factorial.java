import java.util.*;
class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int chhoti = fact(n-1);
        int badi = n*chhoti;
        return badi;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fact(n));

    }
}
