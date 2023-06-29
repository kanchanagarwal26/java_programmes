public class prime_in_a_range_function
 {
    public static boolean isprime(int n){
            for(int i=2;i<=n-1;i++){
                    if (n%i==0){
                        return false;
                        
                    }

                }
            return true;

        }
        public static void primeinrange(int n){
            for(int i=2;i<=n;i++){
                if(isprime(i)){
                    System.out.print(i+" ");
                }
            }
            
        }
        public static void main(String[]args){
            primeinrange(21);
        }
    
}
