import java.util.Scanner;
public class star_and_Hash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int star=0,hash=0;
        for(char ch:st.toCharArray()){
            if(ch=='*'){
                star++;
            }else{
                hash++;
            }
        }
        if(star> hash){
            System.out.println(star - hash);
        }else if(hash > star){
            System.out.println(star - hash);
        }else{
            System.out.println("0");
        }
    }
}
