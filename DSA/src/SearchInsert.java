public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0, index = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == target || nums[i] > target) {
                index = i;
                break;
            }
            i++;
        }
        if (index == 0) {
            index = i;
        } 
        System.out.println(index);

    }
}
