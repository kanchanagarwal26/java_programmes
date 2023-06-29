import java.util.Scanner;
import java.util.*;

public class largest_array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements u want to store");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("enter elements");
        
        for(int  i=0;i<n;i++){
             numbers[i]=sc.nextInt();}
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<n;i++){
          if(largest<numbers[i]);{
          largest=numbers[i];}

        }
        System.out.println("largest no is : " +largest);
        sc.close();
    }
    
}
