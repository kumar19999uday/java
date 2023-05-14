import java.util.*;

public class binarySerc{
    public static int bS(int[] arr,int key){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = (start +end)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }else{
                if(key>arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
                mid = (start+end)/2;
    
            }
        }
        return -1;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = bS(arr,k);
        if(ans==-1){
            System.out.println("not present  "+ans);
        }
        else{
            System.out.println("present  "+ans);
        }
       
    }
}