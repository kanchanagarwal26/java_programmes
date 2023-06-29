import java.util.Scanner;

public class sum_natural_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number up to sum :");
        int number = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number) {

            sum += i;
            i++;

        }
        System.out.println(sum);
        sc.close();

    }
}
