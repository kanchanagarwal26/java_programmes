import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double area = 3.14 * r * r;
        System.out.println(area);
        sc.close();

    }
}