package recursion;

public class powerx {
    public static void main(String[] args){
        int x =2;
        int n = 3;
        System.out.println(power(x,n));
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPower = power(x,n-1);
        int xpown = x*xPower;
        return xpown;
    }
}
