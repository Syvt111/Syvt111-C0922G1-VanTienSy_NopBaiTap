import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalinderom {
    public static void main(String[] args) {
        System.out.println("Enter the string to check");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] charts = str.toUpperCase().split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String chart : charts) {
            stack.add(chart);
            queue.add(chart);
        }
        String[] stackArray = new String[charts.length];
        String[] queueArray = new String[charts.length];
        int count = 0;
        for (int i = 0; i < charts.length; i++) {
            stackArray[i] = stack.pop();
            queueArray[i] = queue.poll();
        }
        for (int i = 0; i < charts.length; i++) {
            if (stackArray[i].equals(queueArray[i])) {
                count++;
            } else {
                count = 0;
                break;
            }
        }
        if (count == charts.length) {
            System.out.println("The string is palindrome");
        } else if (count == 0) {
            System.out.println("The string is not palindrome");
        }
    }
}
