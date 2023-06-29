import java.util.Scanner;

public class avearge_function {
    public static int avg(int a,int b,int c){
                    int x=(a+b+c)/3;
                    return x;
                }
                public static void main (String[]args){
                    Scanner sc=new Scanner(System.in);
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    int x=avg(a,b,c);
                    System.out.println("average is :" +x);
                    sc.close();
                }
    
}
