import java.util.*;
public class reverseStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> stk = new Stack<>();
        for(int i =0;i<n;i++){
            stk.push(sc.next());
            System.out.print(stk+" ");
        }
        System.out.println();
        while(!stk.isEmpty()){
            System.out.print(stk.pop()+" ");
        }
        System.out.println();
    }
}
