public class DecimalToBinary {

    // Function to convert a decimal number into binary
    public static void decimalToBinary(int decimalNumber) {

        int currentNumber = decimalNumber;
        // Copy of original number (we will keep dividing it)

        int power = 0;
        // Represents position in binary (10^0, 10^1, 10^2...)

        int binaryNumber = 0;
        // Stores final binary result (in integer form)

        // Loop runs until decimal number becomes 0
        while (currentNumber > 0) {

            int remender = currentNumber % 2;
            // Get remainder when divided by 2
            // This gives binary digit (0 or 1)

            // Add remainder at correct position in binary number
            // Example: remainder * 10^power
            // We use 10^power because we are building number like 1010 (not base 2, but
            // integer form)
            binaryNumber = binaryNumber + (remender * (int) Math.pow(10, power));

            power++;
            // Move to next position

            currentNumber /= 2;
            // Divide number by 2 to process next bit
        }

        // Print final binary number
        System.out.println(binaryNumber);
    }

    public static void main(String[] args) {

        // Example: decimal 2 → binary 10
        decimalToBinary(2);
    }
}