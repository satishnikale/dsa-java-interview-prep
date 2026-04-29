class BinaryToDecimal {

    // Function to convert a binary number (given as integer) into decimal
    public static void binaryToDecimal(int binNum) {

        int currentNumber = binNum;
        // Copy of original binary number because we will modify it during calculation

        int decicalNumber = 0;
        // This will store the final decimal value

        int power = 0;
        // Represents the position (power of 2), starting from rightmost digit (2^0)

        // Loop runs until all digits of binary number are processed
        while (currentNumber > 0) {

            int lastDigit = currentNumber % 10;
            // Extract last digit (either 0 or 1 in binary)

            // Convert binary digit to decimal using formula:
            // digit * (2^position)
            // Example: 1 * 2^0, 0 * 2^1, 1 * 2^2 ...
            decicalNumber = decicalNumber + (lastDigit * (int) Math.pow(2, power));

            power++;
            // Move to next power (2^1, 2^2, 2^3...)

            currentNumber /= 10;
            // Remove last digit (shift right in binary representation)
        }

        // Print the final decimal number
        System.out.println(decicalNumber);
    }

    public static void main(String[] args) {

        // Input binary number (in integer form)
        // Example: 11100 (binary)
        binaryToDecimal(11100);

        // Output: 28 (decimal equivalent)
    }
}