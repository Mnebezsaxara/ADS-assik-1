import java.util.Scanner;
// Complexity: O(log N)
public class problem6 {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * power(a, n-1);
        } else {
            return 1 / power(a, -n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        double result = power(a, n);
        System.out.println(result);
    }
}