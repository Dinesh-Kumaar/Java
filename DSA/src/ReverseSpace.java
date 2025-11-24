public class ReverseSpace {
    static String reverseSpace(String s) {
        String reversedWord = "", notSpace = s.replaceAll(" ", "");
        int i = 0, j = notSpace.length() - 1;
        
        while (j >= 0) {
            if (s.charAt(i) == ' ') {
                reversedWord += ' ';
                reversedWord += notSpace.charAt(j);
                i++;
            } else {
                reversedWord += notSpace.charAt(j);
            }
            j--;
            i++;
        }
        return reversedWord;
    }

    public static void main(String[] args) {
        String s = "xg kn u ff vr j";
        System.out.println(reverseSpace(s));
    }
}