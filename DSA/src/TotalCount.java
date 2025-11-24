public class TotalCount {
    static int totalCount(int[] arr, int k) {
        int quo = 0, rem = 0,count = 0;
        for (int num : arr) {
            quo = num / k;
            rem = num % k;
            if (rem == 0) {
                count += quo;
            } else {
                count += quo + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,7};
        int k = 4;
        System.out.println(totalCount(arr, k));
    }
}
