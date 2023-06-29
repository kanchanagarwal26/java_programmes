import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.print(avg);
        sc.close();

    }

}
