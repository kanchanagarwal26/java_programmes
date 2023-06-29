import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        // single line comment
        /*
         * multi
         * line
         * comment
         */
//normal pattern
        /*  System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");*/

//star pattern
         /*for(int i=1;i<=4;i++){                                   
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }*/

//inverted star pattern
          /*for(int i =1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
         }*/

//half pyramid pattern
            /*for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }*/

//character pattern
           /* char ch= 'A';
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }*/

//hollow rectangle pattern
           /*  Scanner sc= new Scanner(System.in);
            int row=sc.nextInt();
            int col=sc.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                    if (i==1||i==row||j==1||j==col){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                
                }
                System.out.println();
            
                
            }
            sc.close();*/

//inverted half pyramid

           /*Scanner sc= new Scanner(System.in);
            int row=sc.nextInt();
            
            for(int i=1;i<=row;i++){
                for( int j=1;j<=row-i;j++){
                    System.out.print(' ');
                }
                for(int j=1;j<=i;j++){
                    System.out.print('*');
                }
            System.out.println();
            }
            sc.close();*/

//inverted half pyramid pattern with numbers

           /*  Scanner sc= new Scanner(System.in);
            int row=sc.nextInt();
            
            for(int i=1;i<=row;i++){
                for (int j=1;j==row-j;j++){
                    System.out.print(' ');
                }

                for(int j=1;j<=row-i;j++){
                    System.out.print(j);
                }
                
            System.out.println();
            }
            sc.close();*/

 //floyd's triangle
           /*  Scanner sc= new Scanner(System.in);
            int row=sc.nextInt();
            int counter=1;
            
            for(int i=1;i<=row;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(counter+" ");
                    counter++;
                }
            System.out.println();
            }
            sc.close();*/

//0-1 pattern

             /* Scanner sc= new Scanner(System.in);
            int row=sc.nextInt();
            
            
            for(int i=1;i<=row;i++){
                
                for(int j=1;j<=i;j++){
                 int a=i-j;
                 if(a%2==0 || i==j){
                    System.out.print('1');
                 }
                 else{
                    System.out.print('0');
                 }
                }
                 for( int j=1;j<=row-i;j++){
                    System.out.print(' ');
                
                }
                System.out.println();
            }
            sc.close();*/

//butterfly pattern
           /*  Scanner sc =new Scanner(System.in);
            int n =sc.nextInt();
            //1 half
            for(int i=1;i<=n;i++){
                //stars =i
                for(int j=1;j<=i;j++){
                    System.out.print('*');
                }
                //space =2*(n-i)
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(' ');
                }
                //stars=i
                 for(int j=1;j<=i;j++){
                    System.out.print('*');
                }
                System.out.println();
            }
            //2 half
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print('*');
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(' ');
                }
                 for(int j=1;j<=i;j++){
                    System.out.print('*');
                }
                System.out.println();
                
            }
            sc.close();*/

//rhombus pattern
           /*  Scanner sc =new Scanner(System.in);
           int row=sc.nextInt();
           for(int i=1;i<=row;i++){
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            for(int j =1;j<=row-i;j++){
                System.out.print(" ");
            }
            System.out.println();

            }
            sc.close();*/



//hollow rhombus
            /*Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            int col=sc.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i;j++){
                    System.out.print(' ');
                }
               for( int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                for(int j=1;j<=row-i;j++){
                    System.out.print(' ');
                }
                System.out.println();
           
            }
            sc.close();*/

//diamond pattern
            Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            //1 half
            for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                //2x-1 if odd
                for(int j=1; j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                System.out.println();
                
            }
            // 2 half
            for(int i=row;i>=1;i--){
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            sc.close();
           
           }


    }

