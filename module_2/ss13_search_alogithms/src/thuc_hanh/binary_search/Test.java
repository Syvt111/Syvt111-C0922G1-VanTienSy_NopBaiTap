package thuc_hanh.binary_search;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter a number to find");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,number));
    }
}

