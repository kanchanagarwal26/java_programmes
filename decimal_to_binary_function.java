import java.util.Scanner;

public class decimal_to_binary_function {
    public static int dectobin(int n){
                
                int pow=0;
                int bin=0;
                while(n>0){
                    int rem=n%2;
                    bin=bin+(rem*(int)Math.pow(10, pow));
                    pow++;
                    n=n/2;
                }
                return bin;
                
            }
            public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                int n =sc.nextInt();
                int bin=dectobin(n);
                
                 System.out.println("binary  is : "+bin);
                 sc.close();
            }


    
}
