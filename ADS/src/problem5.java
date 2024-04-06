import java.util.Scanner;
// Complexity: O(2^N)
public class problem5 {
    public static int Fib(int n){
        if (n <= 1){
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int Fib_num = Fib(n);
        System.out.println(Fib_num);
    }
}