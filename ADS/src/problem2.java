import java.util.Scanner;
// complexity O(n)
public class problem2 {
    public static float average_rec(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            float sum = arr[n - 1] + average_rec(arr, n - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        float average = average_rec(array, n) / n;
        System.out.println(average);

        scanner.close();
    }
}