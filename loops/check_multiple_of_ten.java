import java.util.*;

public class check_multiple_of_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Not multiple of 10");
        } while (true);
    }

}
