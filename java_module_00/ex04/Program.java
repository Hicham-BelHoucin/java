package java_module_00.ex04;

public class Program {
    private static String input = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42";
    private static String[] count = new String[127]; // Array to store characters as strings

    private static void printHistogram(int[] topCounts, String[] topChars) {
        int maxCount = topCounts[0]; // Determine the maximum count

        // Printing histogram rows
        for (int row = 10; row >= 0; row--) {
            for (int col = 0; col < 10; col++) {
                // Print count if it fits within the current row
                if (topCounts[col] * 10 / maxCount == row && topCounts[col] > 0) {
                    int count = topCounts[col];
                    if (count < 10) {
                        System.out.print("  " + count + " ");
                    } else {
                        System.out.print(" " + count + " ");
                    }
                } else if (topCounts[col] * 10 / maxCount > row) {
                    System.out.print("  # ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        // Printing character labels
        for (String character : topChars) {
            if (character != null) {
                System.out.print("  " + character + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Initialize the count array
        for (int i = 0; i < count.length; i++) {
            count[i] = ""; // Initialize each element as an empty string
        }

        // Convert the input string to a char array
        char[] gfg = input.toCharArray();

        // Iterate over each character in the input string and count them
        for (int i = 0; i < input.length(); i++) {
            char ch = gfg[i];
            count[ch] += ch; // Append the character to the corresponding index in the count array
        }

        // Array to keep the top 10 characters and their counts
        String[] topChars = new String[10];
        int[] topCounts = new int[10];

        // Find the top 10 characters
        for (int i = 0; i < count.length; i++) {
            int currentCount = count[i].length();
            if (currentCount > 0) {
                for (int j = 0; j < 10; j++) {
                    if (currentCount > topCounts[j]) {
                        // Shift the lower counts down
                        for (int k = 9; k > j; k--) {
                            topCounts[k] = topCounts[k - 1];
                            topChars[k] = topChars[k - 1];
                        }
                        // Insert the current character and count
                        topCounts[j] = currentCount;
                        topChars[j] = (char) i + "";
                        break;
                    }
                }
            }
        }

        printHistogram(topCounts, topChars);
    }
}