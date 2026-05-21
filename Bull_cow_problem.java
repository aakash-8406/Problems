import java.util.Scanner;

public class Bull_cow_problem {
    public static String getHint(String secret, String guess) {
        int cow = 0, bull = 0;
        int[] x=new int[10];
        int[] y=new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char r=secret.charAt(i);
            char t=guess.charAt(i);
            if (r==t) {
                bull++;
            } else {
                x[r-'0']++;
                y[t-'0']++;
            }
        }
        int d=0;
        while(d<10){
            cow+=Math.min(x[d],y[d]);
            d++;
        }
        return bull+ " bulls " + cow + " cows";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Four Digit Secret Number: ");
        String secret=sc.next();

        for(int i=1;i<=2;i++) {
            int tries=1;
            while (true) {
                if(tries == 10){
                    System.out.println("Player 1 OUT ! Cannot Guess the Number!");
                    break;
                }
                System.out.print("Player "+i+" Enter a Four Digit Guess Number: ");
                String guess = sc.next();
                if(guess.length()==4) {
                    String res = getHint(secret, guess);
                    if (res.charAt(0) == '4') {
                        System.out.println("Got it! You Guessed a Number is : " + guess + ". Player " + i + " Tries :" + tries + " times");
                        break;
                    } else {
                        System.out.println(res);
                        tries++;
                    }
                }else{
                    System.out.println("Please Enter a Four Digit Guess Number");
                }
            }
        }
    }
}
