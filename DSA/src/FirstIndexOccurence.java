public class FirstIndexOccurence {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        int i = 0, j = 0, index = -1;
 
        while (i < haystack.length() && j < needle.length()) {
            if ( j < needle.length() && haystack.charAt(i) == needle.charAt(j) && index == -1 ) {
                index = i;
                j++;
            }
            else if ( j < needle.length() && haystack.charAt(i) == needle.charAt(j) ) {
                j++;
            }
            else if (haystack.charAt(i) != needle.charAt(j) && j > 0) {
                System.out.println(-1);
                break;
            }
            i++;
        }
        System.out.println(index);
    }
}
// 0ms
