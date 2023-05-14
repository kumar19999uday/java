import java.util.*;

public class charFr {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] arr = new char[n];for(
    int i = 0;i<n;i++)
    {
        arr[i] = sc.next().charAt(i);
    }
    HashMap<Character, Integer> hm = new HashMap<>();for(
    int i = 0;i<n;i++)
    {
        hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }for(
    Map.Entry<Character, Integer> val:hm.entrySet())
    {
        System.out.println(val.getKey() + " " + val.getValue());
    }

}
