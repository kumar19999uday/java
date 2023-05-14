import java.util.Set;

public class longestSubstrin {
    public static int longestSubString(String s){
        int n = s.length();
        HashSet<Character> hashSet = new HashSet<>();
        int i =0;
        int j =0;
        int max =0;
        while(j<n){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                max = Math.max(max,j-i+1);
                j++;
            }else{
                if(hashSet.contains(s.charAt(i))){
                    hashSet.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        String s = "abcdefasd";
        int ans = longestSubString(s);
        System.out.println(ans);
    }
    
}
