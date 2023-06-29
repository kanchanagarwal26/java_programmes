import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();// space k baad nhi leta
        System.out.println(name);
        sc.close();

        // for multiple words

        String fullname = sc.nextLine();
        System.out.println(fullname);

        // for integers
        int num = sc.nextInt();
        System.out.println(num);

        // for float
        float decimal = sc.nextFloat();
        System.out.println(decimal);

    }

}
