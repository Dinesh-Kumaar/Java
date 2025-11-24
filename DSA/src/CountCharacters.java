import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    static int getCount(String word, int n) {
        Map <Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
                if (count == n) {
                    break;
                }
            }
            if (!myMap.containsKey(word.charAt(i))) {
                myMap.put(word.charAt(i), count);
            }
        }
        return myMap.size();
    }
    public static void main(String[] args) {
        String word = "geeksforgeeks";
        int n = 2;

        System.out.println(getCount(word, n));
    }
}
