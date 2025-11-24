public class IndexOfExtraElement {
    static int findExtra(int[] a, int[]b) {
        for (int i = 0; i < b.length; i++) {
        if (a[i] != b[i]) {
            return i;
        }
    }
    return a.length - 1;
    }
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9,10,12};
        int[] b = {2,4,6,8,10,12};
        System.out.println(findExtra(a,b));
    }
}
