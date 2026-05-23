import java.util.*;

public class Ransom_Note {
    public static boolean ransom(String r,String m){
        int[] freq=new int[26];
        for(char ch:m.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:r.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String r=sc.next();
        String m=sc.next();
        System.out.println(ransom(r,m));

    }
}
