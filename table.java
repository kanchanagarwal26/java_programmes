import java.util.Scanner;

public class table {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int  i=0;
        
        for(i=1;i<=10;i++){
            System.out.println(n*i);
        }
    
        sc.close();
        }
    
    }
