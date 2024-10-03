public class SumPrime 
{   
    public static boolean isPrime(int n) {
          for(int i=2; i<n; i++) {
               if(i%n==0)
               { 
                  return false; 
               }
          }
       return true;
    }
    public static void main(String[] args) {
         int s=0;
         for(int i=0; i<args.length; i++) {
                int n = Integer.parseInt(args[i]);
                boolean ans = isPrime(Integer.parseInt(args[i]));
                if(ans) {
                     s = s+Integer.parseInt(args[i]); 
               }
            
         }
         System.out.println("Sum is" +s);
    }
}