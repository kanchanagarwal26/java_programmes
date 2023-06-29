public class binary_to_decimal_function {
    public static void bintodec(int n){
           int binary=n;
            int pow=0;
            int dec=0;
            while(n>0){
               int  lastdigit=n%10;
                dec=dec+lastdigit*(int)Math.pow(2,pow);
                pow++;
                n=n/10;

            }
            System.out.println("decimal of "+ binary+" is : "+dec );
        }
        public static void main(String[]args){
            bintodec(101);
        }
}
