import java.util.ArrayList;

public class WithoutDuplicates {

    public static void main(String[] args) {
        int[] nums = {131,11,48};
        boolean[] loss =  new boolean[10];
        ArrayList<Integer> out = new ArrayList<Integer>();
        int lenth = 0,index = 0;
        for (int num : nums) {
            while (num != 0) {
                int rem = num % 10;
                if (loss[rem] == false) {
                    loss[rem] = true;
                    lenth++;
                }
                num /= 10;
            }
        }
        
        int[] value = new int[lenth];
        for (int i = 0; i < loss.length; i++) {
            if (loss[i]) {
                value[index] = i;
                index++;
            }
        }
        for (int num : value) {
            System.out.println(num);
        }
    }
}