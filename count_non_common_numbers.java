import java.util.Scanner;

public class count_non_common_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String l1=sc.nextLine();
        String l2=sc.nextLine();



        int count=0;
        int i=0,j=0;
        while(i<l1.length() || j< l2.length()){
            if( i <l1.length()){
                if(!l2.contains(String.valueOf(l1.charAt(i)))) {
                    count++;
                }
                i++;
            }
            if(j< l2.length()){
                if(l1.contains(String.valueOf(l2.charAt(j)))) {
                    count++;
                }
                j++;
            }
        }
        System.out.println(count);

    }
}
