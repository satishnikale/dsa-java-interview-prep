import java.util.Scanner;

public class CountDigits {

    // Function to count number of digits in a number
    public static int countDigit(int n) {

        // Handle negative numbers
        // Example: -123 → 123
        n = Math.abs(n);

        // Special case:
        // If number is 0, it has exactly 1 digit
        if (n == 0) {
            return 1;
        }

        int count = 0; // stores number of digits

        // Loop runs until n becomes 0
        while (n != 0) {

            count++; // increment digit count

            n = n / 10; // remove last digit
            // Example:
            // 1234 → 123 → 12 → 1 → 0
        }

        // Return total digits
        return count;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter Number to count digits : ");

        // Read integer input
        int num = sc.nextInt();

        // Call function
        int count = countDigit(num);

        // Display result
        System.out.println("Number of digits : " + count);

        // Close scanner (best practice)
        sc.close();
    }
}