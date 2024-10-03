public class TestPrime {
    public static void main(String[] args) {
        // int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            boolean ans = PrimeService.isPrime(Integer.parseInt(args[i]));
            if (ans) {
                // sum += Integer.parseInt(args[i]);
                System.out.println("Prime number at position is " + i + " ----> " + args[i]);
            }
        }
    }

}
