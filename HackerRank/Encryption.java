package HackerRank;

public class Encryption {
    public static String encrypt(String s) {
        s = s.replaceAll("\\s", ""); // Step 1: remove spaces
        int L = s.length();

        // Step 2: determine rows and columns
        int rows = (int) Math.floor(Math.sqrt(L));
        int cols = (int) Math.ceil(Math.sqrt(L));
        if (rows * cols < L) {
            rows++;  // adjust if product < L
        }

        // Step 3: construct result column-wise
        StringBuilder encrypted = new StringBuilder();

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row * cols + col < L; row++) {
                encrypted.append(s.charAt(row * cols + col));
            }
            encrypted.append(' ');
        }

        return encrypted.toString().trim(); // remove trailing space
    }

    public static void main(String[] args) {
        String input = "feed the dog";
        System.out.println(encrypt(input));  // Output: "fto ehg ee dd"
    }
}

