import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number in which you want to stop the counting: ");
        int n = sc.nextInt();
        int a = 1;
        while (a <= n) {
            System.out.println(a);
            a++;
        }
        sc.close();

    }
}
