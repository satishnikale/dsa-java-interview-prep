import java.util.Scanner;

public class CountDigits {
    public static int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to count digits : ");
        int num = sc.nextInt();
        int count = countDigit(num);
        System.out.println("Number of digits : " + count);
    }
}
