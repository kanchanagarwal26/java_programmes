import java.util.Scanner;

public class palindrome_function {
    public static boolean palindrome(int n){
                    int rev=0;
                    int number=n;
                    while (n>0){
                        
                        int rem=n%10;
                        rev=rev*10+rem;
                        n=n/10;

                    }
                    if(number==rev){
                        return true;
                    }
                    
                        return false;
                    

                }
                public static void main(String[]args){
                    Scanner sc=new Scanner (System.in);
                     
                    int n=sc.nextInt();
                    if (palindrome(n)){
                        System.out.println("yes it is palindrome");
                    }
                    else{
                        System.out.println("no");
                    }
                    sc.close();

                }
    
}
