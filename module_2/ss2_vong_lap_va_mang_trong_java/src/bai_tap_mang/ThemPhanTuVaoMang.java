package bai_tap_mang;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int [] numbers ;
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size = Integer.parseInt(input.nextLine());
        numbers = new int [size];
        for (int i = 0; i < size; i ++){
            System.out.println("Enter the element of " + (i + 1));
            numbers[i]= input.nextInt();
        }

        System.out.println("Enter a number to add ");
        int number = input.nextInt();
        System.out.println("Enter a position of number to add ");
        int index = Integer.parseInt(input.next());
        if (index<0 || index >= size){
            System.out.println("Could not add the number to array");
        }
        else {
            for (int j = size-1 ; j > index; j--){
                numbers[j] = numbers[j-1];
            }
        }
        numbers[index]=number;
        for (int element:numbers
             ) {
            System.out.println(element);
        }
    }
}
