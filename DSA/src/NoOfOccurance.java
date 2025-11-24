public class NoOfOccurance {
    static int countFreq(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 4;
        System.out.println(countFreq(arr, target));
    }
}
