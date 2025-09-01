public class ReverseString {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        String[] temp = new String[s.length];
        int left = 0, right = s.length - 1;
        while (left < s.length) {
            temp[left] = s[right];
            left++;
            right--;
        }
        for (int i = 0; i < temp.length; i++) {
            s[i] = temp[i];
            System.out.println(s[i]);
        }
    }
}

//1ms