import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income < 500000) {
            System.out.println("tax is 0%");
        } else if (500000 <= income && income < 1000000) {
            System.out.println("your tax is   " + (int) income * 0.2);// 20%
        } else {
            System.out.println("your tax is " + (int) income * 0.3);// 30%
        }
        sc.close();
    }

}
