import java.util.*;

public class repeated_names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String name = sc.nextLine();

        String[] words = text.split(" ");
        int count = 0;

        for(String word : words) {
            if(word.equals(name)) {
                count++;
            }
        }

        System.out.println(count);
    }
}