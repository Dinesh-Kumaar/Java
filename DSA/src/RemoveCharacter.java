public class RemoveCharacter {
    static String removeChars(String str1, String str2) {
        int i = 0, j = 0;
        int n = str1.length();

        while (j < str2.length()) {

            if (n == 0) {
                break;
            }

            if (i == n) {
                j++;
                i = 0;
                continue;
            }

            if (i >= n) {
                j++;
                i = 0;
                continue;
            }

            if (str1.charAt(i) == str2.charAt(j)) {
                str1 = str1.replace("" + str1.charAt(i), "");
                n = str1.length(); 
                i = 0;
                continue;
            }

            i++;
        }

        return str1;

    }

    public static void main(String[] args) {
        String str1 = "jznpcsojzozgpc", str2 = "toaewnevyxlir";
        System.out.println(removeChars(str1, str2));
    }
}
