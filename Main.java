public class Main {
    public static void printInc(int n){
        if(n==0){
            return;
        }
        //faith
        printInc(n-1);
        //print
        System.out.println(n);
    }
    public static void main(String[] args){
        printInc(10);
    } 
    
}
