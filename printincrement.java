package recursion;

public class printincrement {
    public static void main(String[] args){
        int num =1;
        printNum(num);

    }
    public static void printNum(int n ){
        if(n==10){
            return;
        }
      
        System.out.println(n);
        printNum(n+1);
        
    }
}

