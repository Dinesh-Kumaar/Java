import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting {
    static ArrayList<Integer> alterSort(int[] arr) {
        ArrayList<Integer> alteredList = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            alteredList.add(arr[j--]);
            alteredList.add(arr[i++]);

        }
        if (arr.length % 2 != 0) {
            alteredList.add(arr[i]);
        }
        return alteredList;
    }
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6};
        System.out.println(alterSort(arr));
    }
}
