import java.util.*;
public class fibbonacci_sequence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            if (N == 1 || N == 2) {
                System.out.println(1);
                return;
            }

            int first = 1, second = 1, third = 0;

            for (int i = 3; i <= N; i++) {
                third = first + second;
                first = second;
                second = third;
            }

            System.out.println(third);
        }
}

