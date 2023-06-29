import java.util.*;
public class reverse_array {
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter total no of elements");
    int n=sc.nextInt();
    System.out.println("enter elements");
    int numbers[]=new int[n];
    for(int i=0;i<n;i++){
         numbers[i]=sc.nextInt();
    }
    int first=0;
    int last=n-1;
    int temp;
    while(first<last){
        temp=numbers[first];
        numbers[first]=numbers[last];
        numbers[last]=temp;
        first++;
        last--;


    }
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");

        
    }
    System.out.println();
}
    
}
