import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int number = scanner.nextInt();
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
