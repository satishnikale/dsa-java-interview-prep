class CountSum {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

     public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int totalSum = addNumbers(a, b);
        System.out.println("Total is : " + totalSum);
    }
}