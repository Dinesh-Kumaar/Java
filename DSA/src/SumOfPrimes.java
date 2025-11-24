public class SumOfPrimes {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check for factors up to the square root of num
        // If a number has a factor greater than its square root, it must also have a factor smaller than its square root.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true;
    }
    static int primeSum(int n) {
        int temp = n, count = 0;
        while (n != 0) {
            int rev = n % 10;
            if (isPrime(rev)) {
                count += rev;
            }
            n /= 10;
        }
        return count;

    }
    public static void main(String[] args) {
        int n = 686;
        System.out.println(primeSum(n));
    }
}
