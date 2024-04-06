import java.util.Scanner;
// complexity O(√(N))
public class problem3 {
    public static boolean Prime_rec(int n, int dvoika) {
        if (n <= 1) {
            return false;
        }
        if (dvoika * dvoika > n) {
            return true;
        }
        if (n % dvoika == 0) {
            return false;
        }
        return Prime_rec(n, dvoika + 1);
    }

    public static void prime(int n) {
        if (Prime_rec(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        prime(n);
        scanner.close();
    }
}