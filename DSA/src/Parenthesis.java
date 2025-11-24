public class Parenthesis {
    static int checkParenthesis(String word) {
        int open = 0, close = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '(') {
                open++;
            } else if (word.charAt(i) == ')') {
                close++;
            }
        }
        if (open == close) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        // String word = "(9*(7-2)*(1*5)";
        // String word = "HELLO AND (WELCOME(TO THE) TCEA (CONTEST)TODAY)IS (SATURDAY())";
        String word = "a(b)c(z)";
        System.out.println(checkParenthesis(word));
    }
}
