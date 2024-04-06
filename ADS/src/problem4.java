import java.util.Scanner;
// Complexity: O(N)
public class problem4 {
    public static int factori(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factori(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fact_n = factori(n);
        System.out.println(fact_n);
        scanner.close();
    }
}