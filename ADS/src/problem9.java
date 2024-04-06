import java.util.Scanner;
// Complexity: O(N * K)
public class problem9 {
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the k: ");
        int k = sc.nextInt();
        int res = binomialCoeff(n, k);
        System.out.println(res);
        sc.close();
    }
}