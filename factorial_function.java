import java.util.Scanner;

public class factorial_function {
    public static int fact(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            return fact;
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int fact=fact(a);
            System.out.println(fact);
            sc.close();
        }
    
}
