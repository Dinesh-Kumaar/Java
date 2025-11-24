import java.util.ArrayList;

public class ModiftyTheArray {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> modifiedArray = new ArrayList<>();
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i] && (arr[i] != 0 || arr[i - 1] != 0)) {
                modifiedArray.add(arr[i - 1] + arr[i]);
                arr[i] = 0;
            } else if (arr[i] != 0 && arr[i - 1] != 0) {
                modifiedArray.add(arr[i]);
            }
            
        }
        return modifiedArray;   
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        int arr1[] = {2, 2, 0, 4, 0, 8};
        System.out.println(modifyAndRearrangeArr(arr));
        // System.out.println(modifyAndRearrangeArr(arr1));
    }
}
