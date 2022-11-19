import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String string = " Sy Van CodeGym";
        invertArrayOfNumberByStack(array);
        invertStringByStack(string);
    }

    public InvertElement() {
    }

    public static void invertArrayOfNumberByStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("The array was inverted : ");
        for (int element : array
        ) {
            System.out.println(element);
        }
    }

    public static void invertStringByStack(String string) {
        Stack<String> wStack = new Stack<>();
        String[] mWord = string.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
        }
        System.out.println("The String was inverted : ");
        String newString = "";
        for (int i = 0; i < mWord.length; i++) {
            newString = newString.concat(mWord[i] + " ");
        }
        System.out.println(newString);

    }


}
