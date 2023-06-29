import java.util.Scanner;

public class linear_search {
   /*  public static void main(String[]args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements u want to store");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("enter elements");
        
        for( i=0;i<n;i++)
             numbers[i]=sc.nextInt();

        
        System.out.println("enter the no u want to search");
        int search_number=sc.nextInt();

        for( i=0;i<n;i++){
            if(numbers[i]==search_number){
                System.out.println("found and position is :"+(i+1));
                break;
            }
            

        }
        
        
        sc.close();
    }*/
//by the help of functions
    public static int linear(int n,int numbers[],int search){
                
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==search){
                return i;
            }
        }
        return -1;
    }
    
        public static void main(String[]args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements u want to store");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("enter elements");
        
        for( i=0;i<n;i++)
             numbers[i]=sc.nextInt();

        
        System.out.println("enter the no u want to search");
        int search=sc.nextInt();
        int index=linear(n,numbers,search);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found and position is :"+(index+1));
        }
        sc.close();
    }
}
