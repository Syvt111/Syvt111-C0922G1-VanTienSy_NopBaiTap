package bai_tap.BinarySearchAlgorithsByRecursion;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearchAlgorithmsByRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of arrayNumber : ");
        int size = Integer.parseInt(input.nextLine());
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element of arrayNumber at index = " + i);
            int number = input.nextInt();
            numbers[i] = number;
        }

        Set<Integer> setNumbers = new TreeSet<>();
        for (int j = 0; j < numbers.length; j++) {
            setNumbers.add(numbers[j]);
        }
        System.out.println(setNumbers);

        Iterator<Integer> element = setNumbers.iterator();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = element.next();
        }

        System.out.println("Enter a value to search ! ");
        int value = input.nextInt();
        System.out.print("The value '" + value + "' found at index : " );
        System.out.println(binarySearch(numbers, 0, numbers.length - 1, value));
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

}
