import java.util.Scanner;

public class reverse_counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int n = a; n >= 0; n--) {
            System.out.println(n);
        }
        sc.close();

    }
}