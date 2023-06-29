import java.util.*;
public class evenodd_function {
    
                public static boolean iseven(int n){
                    if(n%2==0){
                        return true;

                    }
                    return false;

                }
                public static void main(String[]args){
                    Scanner sc=new Scanner (System.in);
                    int n=sc.nextInt();
                    
                    if(iseven(n)){
                        System.out.println("even");
                    }
                    else{

                    System.out.println("odd" );
                    }
                    sc.close();
                }
}
