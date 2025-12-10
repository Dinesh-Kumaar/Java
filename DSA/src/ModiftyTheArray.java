import java.util.ArrayList;

public class ModiftyTheArray {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }

        return result;   
    }
    public static void main(String[] args) {
        // int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        // System.out.println(modifyAndRearrangeArr(arr));
        int arr1[] = {2, 2, 0, 4, 0, 8};
        System.out.println(modifyAndRearrangeArr(arr1));
    }
}
