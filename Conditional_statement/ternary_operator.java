import java.util.*;

public class ternary_operator {

    public static void main(String[] args) {
        // ternary operator
        // variable = condition? statement!: statement2;
        int num = 6;
        String type = ((num % 2) == 0) ? "even" : "odd";
        System.out.print(type);
    }
}