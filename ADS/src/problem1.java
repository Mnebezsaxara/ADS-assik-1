import java.util.Scanner;
// complexity O(n)
public class problem1 {
    public static int minRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int Before_min = minRecursive(arr, n - 1);
        if (Before_min < arr[n - 1]) {
            return Before_min;
        } else {
            return arr[n - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int minEl = minRecursive(array, n);
        System.out.println(minEl);

        scanner.close();
    }
}