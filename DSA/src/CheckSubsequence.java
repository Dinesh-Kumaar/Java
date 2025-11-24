public class CheckSubsequence {
    static boolean isSubSequence(String A, String B) {
        int i = 0, j = 0,count = 0;
        
        while (j < B.length() && i < A.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
                count++;
            }
            j++;
        }
        if (count == A.length()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "AXY";
        String b = "YADXCP";
        System.out.println(isSubSequence(a, b));
    }
}
