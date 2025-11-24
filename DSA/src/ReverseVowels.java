import java.util.ArrayList;

public class ReverseVowels {
    static String modify(String s) {
        ArrayList <Character> myMap = new ArrayList<>();
        String removedWord = "";
        

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                myMap.add(s.charAt(i));
            }
        }
        int index = 0, j = myMap.size() - 1;

        while (index < s.length()) {
            if (s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o' || s.charAt(index) == 'u') {
                removedWord += s.charAt(index);
                j--;

            } else {
                removedWord += s.charAt(index);
            }
            index++;
        }
        return removedWord;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(modify(s));
    }
}