public class MiddlePattern {
    static void printPattern(String s) {
        int half = s.length() / 2;
        String value = "";
        for (int i = 0; i < s.length(); i++) {
            if (half == s.length() ) {
                half = 0;
            }
            value += s.charAt(half);
            System.out.print(value + "$ ");
            half++;
        }
    }
    public static void main(String[] args) {
        String s = "PROGRAM";
        printPattern(s);
    }
}
