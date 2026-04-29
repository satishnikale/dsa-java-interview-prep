public class HolloRectangle {

    // Function to print hollow rectangle
    public static void hollowRectangle(int rows, int cols) {

        // Loop for rows
        for (int i = 0; i < rows; i++) {

            // Loop for columns
            for (int j = 0; j < cols; j++) {

                // Condition for boundary:
                // 1. First row (i == 0)
                // 2. Last row (i == rows - 1)
                // 3. First column (j == 0)
                // 4. Last column (j == cols - 1)
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    // Inside space
                    System.out.print("  "); // double space for proper alignment
                }
            }

            // Move to next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int totalRows = 4;
        int totalCols = 5;

        // Call function
        hollowRectangle(totalRows, totalCols);
    }
}