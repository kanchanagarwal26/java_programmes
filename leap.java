import java.util.Scanner;

public class leap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year:");
        int a = sc.nextInt();
        boolean x = (a % 4 == 0);
        boolean y = (a % 100 != 0);

        boolean z = (a % 100 == 0) && (a % 400 == 0);
        if (x && y || z) {
            System.out.println("yes");
        } else
            System.out.println("no");

        sc.close();

    }
}
