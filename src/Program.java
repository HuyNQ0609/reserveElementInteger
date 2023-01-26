import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    Scanner input = new Scanner(System.in);
    public void reserveElementInteger() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int n = stack.size();
        for (Integer integer : stack) {
            System.out.print(integer);
        }
        System.out.println("\n------");
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }

    public void reserveElementString() {
        Stack<String> wStack = new Stack<>();
        System.out.println("Enter a string: ");
        String mWord = input.nextLine();
        int n = mWord.length();
        for (int i = 0; i < n; i++) {
            wStack.push(mWord.charAt(i) + "");
            System.out.print(wStack.get(i));
        }
        System.out.println("\n-----------");
        for (int i = 0; i < n; i++) {
            System.out.print(wStack.pop());
        }
    }
}
