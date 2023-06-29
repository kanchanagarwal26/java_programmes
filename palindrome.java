import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 0) {
            int last_digit = a % 10;
            System.out.print(last_digit);
            a /= 10;// a=a/10
        }
        sc.close();

    }
}