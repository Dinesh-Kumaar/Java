import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ThirdLargest {
    static void smallFunc (char letter, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(letter);
        }
    }
    static void thirdLargest(String word) {
        Map<Character, Integer> myMap = new HashMap<>();
        word = word.concat("--");
        char[] charArr = word.toCharArray();
        
        for (int i = 0; i < charArr.length-2; i++) {
            if (Character.isLetter(charArr[i])) {
                if (Character.isDigit(charArr[i + 1]) && Character.isDigit(charArr[i + 2])) {
                    myMap.put(charArr[i], ((charArr[i+1] - '0') * 10) + (charArr[i+2] - '0'));
                } else {
                    myMap.put(charArr[i], (charArr[i+1] - '0'));
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            smallFunc(entry.getKey(), entry.getValue());
        }
    }
    public static void main(String[] args) {
        String word = "a11c12d13";
        thirdLargest(word);
    }
}
