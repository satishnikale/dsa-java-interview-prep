class CharacterPattern {
    public static void charPattern(int n) {
        char ch = 'A'; // 'A' has Unicode value 65

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");

                // ch++ increases the Unicode value of character
                // Example:
                // 'A' (65) -> 'B' (66) -> 'C' (67)
                // Internally: ch = (char)(ch + 1)
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello World.");
        charPattern(5);
    }
}