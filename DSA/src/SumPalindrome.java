public class SumPalindrome {
    static int reverseNum(int originalNumber) {
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10; 
            reversedNumber = reversedNumber * 10 + remainder; 
            originalNumber /= 10; 
        }
        return reversedNumber;
    }
    static int isSumPalindrome(int n) {
        if (n == reverseNum(n)) {
            return n;
        } else {
            for (int i = 0; i < 5; i++) {
                int reversedNum = reverseNum(n);
                int count = reversedNum + n;
                if (reverseNum(count) == count) {
                    return count;
                }
                n = count;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 101;
        System.out.println(isSumPalindrome(n));
    }
}
