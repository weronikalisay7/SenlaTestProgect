package task5__palindrome_numbers;
import java.util.*;

public class PalindromeNumbers {
    public static void palindromeNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input N:");
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
                System.out.println(i + "- it's a palindrome");
            }
        }
    }
}
