import java.util.Scanner;
// Complexity: O(N)
public class problem8 {
    public static boolean Char_detector(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return Char_detector(s, index + 1);
    }

    public static void digit_checker(String s) {
        if (Char_detector(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String user_string = scanner.nextLine();
        digit_checker(user_string);
        scanner.close();
    }
}
