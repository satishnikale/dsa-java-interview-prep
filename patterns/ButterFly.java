public class ButterFly {

    // Function to print Butterfly Pattern
    public static void butterFlyPattern(int n) {

        // ----------- Upper Half -----------
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in between
            // Total spaces = 2 * (n - i)
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  "); // double space for alignment
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }

        // ----------- Lower Half -----------
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in between
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;

        // Call function
        butterFlyPattern(n);
    }
}