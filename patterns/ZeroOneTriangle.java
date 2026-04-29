public class ZeroOneTriangle {

    // Function to print 0-1 triangle pattern
    public static void zeroOneTrianglePattern(int n) {

        // Loop for rows
        for (int i = 0; i < n; i++) {

            // Loop for columns (print i+1 elements in each row)
            for (int j = 0; j <= i; j++) {

                // If sum of indices is even → print 1
                // If odd → print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            // Move to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;

        // Call function
        zeroOneTrianglePattern(n);
    }
}