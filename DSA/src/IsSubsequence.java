public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acx", t = "ahbgdc";
        int i = 0, j = 0,count = 0;
        while (i < s.length()) {
            if (j >= t.length()) {
                break;
            }
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                count++;
            } 
            j++;
        }
        boolean result = count == s.length() ? true : false;
        System.out.println(result);
    }
}
// 2ms