import java.util.Scanner;

public class coun_products {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(char ch: s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)==-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
