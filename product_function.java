import java.util.Scanner;

public class product_function {


     public static int calpro(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        int product=calpro(a,b);
        System.out.println("product is:"+product);
        sc.close();
    }}
















               

