import java.util.*;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("Even Number");
        } else {
            System.out.print("Odd Number");
        }

    }
}