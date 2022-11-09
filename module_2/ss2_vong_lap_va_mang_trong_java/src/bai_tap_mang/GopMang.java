package bai_tap_mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] numbers1;
        int[] numbers2;
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of numbers1 :");
        int size1 = input.nextInt();
        numbers1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter a element of " + (i + 1));
            numbers1[i] = input.nextInt();
        }

        System.out.println("Enter a size of numbers2 :");
        int size2 = input.nextInt();
        numbers2 = new int[size2];
        for (int j = 0; j < size2; j++) {
            System.out.println("Enter a element of " + (j + 1));
            numbers2[j] = input.nextInt();
        }

        int size = size1 + size2;
        numbers = new int[size];
        for (int a = 0; a < numbers1.length; a++) {
            numbers[a] = numbers1[a];
        }
        for (int b = 0; b < numbers2.length; b++) {
            numbers[numbers1.length+b] = numbers2[b];
        }
        System.out.println("Array number is :");
        for (int element : numbers
        ) {
            System.out.println(element);

        }

    }
}
