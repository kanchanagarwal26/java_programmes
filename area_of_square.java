import java.util.Scanner;

public class area_of_square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of the square is :" + area);
        sc.close();

    }
}
