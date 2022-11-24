package ss2_loop_array_java.bai_tap_mang;

import java.util.Scanner;

public class TimGiaTriNhoNhat {

    public static void main(String[] args) {
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array ");
        int size = Integer.parseInt(input.next());
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a element of " + (i + 1));
            numbers[i] = input.nextInt();
        }

        int min = finVlueMin(numbers);
        System.out.println("The smallest in the array is : " + min);
    }

    public static int finVlueMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }

}
