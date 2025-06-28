package StringCoding;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        k %= 26;  // Normalize the shift

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append((char) ('A' + (ch - 'A' + k) % 26));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ('a' + (ch - 'a' + k) % 26));
            } else {
                result.append(ch);  // Non-letter, keep as is
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));  // okffng-Qwvb
    }
}
