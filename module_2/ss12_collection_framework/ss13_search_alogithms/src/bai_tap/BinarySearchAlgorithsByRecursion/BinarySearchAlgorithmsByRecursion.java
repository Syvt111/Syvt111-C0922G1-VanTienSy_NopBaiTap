package bai_tap.AlgorithmComplexityTest;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BinarySearchAlgorithmsByRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of arrayNumber : ");
        int size = Integer.parseInt(input.nextLine());
        int[] numbers = new int [size];
        for (int i = 0 ; i < size; i ++){
            System.out.println("Enter element of arrayNumber at index = " + i );
           int  number = input.nextInt();
            numbers[i] = number ;
        }
        Set<Integer> setNumbers = new TreeSet<>();
        for (int j = 0; j < numbers.length; j ++){
            setNumbers.add(numbers[j]) ;
        }
        System.out.println(setNumbers);

    }
}
