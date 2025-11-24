public class LeftSmallRightGreat {
    static int findElement(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = -1;
        right[n-1] = -1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            left[i] = max;
        }
        int min = arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            right[i] = min;
        }
        for (int i = 1; i < n-1; i++){
            if (left[i] == right[i]) return left[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {82, 71, 39, 58, 65, 52, 53, 53, 98, 86};
        System.out.println(findElement(arr));
    }
}
