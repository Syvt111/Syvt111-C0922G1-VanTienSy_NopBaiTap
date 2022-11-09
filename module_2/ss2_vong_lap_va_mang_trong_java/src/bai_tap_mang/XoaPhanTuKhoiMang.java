package bai_tap_mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        System.out.println("Enter the a size of array :");
        int[] numbers;
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter element " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number to move ");
        int number = sc.nextInt();
        int index ;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == number) {
                index = i;
                for ( int j = index; j < size-1; j ++ ){
                    numbers[j]=numbers[j +1];
                }
                System.out.println("The new Array is :" );
            }
        }
        for (int element :numbers
             ) {
            System.out.println(element);
        }
    }

}
