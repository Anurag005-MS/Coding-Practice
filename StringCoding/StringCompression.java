package StringCoding;

public class StringCompression {
    public static String compressString(String s) {
        if (s == null || s.length() == 0) return s;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            // Check if current char equals previous
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Append previous char and count
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1;  // reset count
            }
        }

        // Return compressed if shorter, else original
        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa")); // Output: a2b1c5a3
        System.out.println(compressString("abc"));         // Output: abc (no compression benefit)
        System.out.println(compressString("aabb"));        // Output: aabb (no compression benefit)
    }
}

