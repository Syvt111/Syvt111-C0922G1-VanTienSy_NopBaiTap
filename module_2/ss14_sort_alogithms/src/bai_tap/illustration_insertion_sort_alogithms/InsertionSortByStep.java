package bai_tap.illustration_insertion_sort_alogithms;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size : ");
        int size = Integer.parseInt(input.next());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values :");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        insertionSortByStep(list);
        System.out.print("The list was sorted : ");
        for (int element : list
             ) {
            System.out.print(element + " ");
        }
    }
    public static void insertionSortByStep(int[] list) {
        int x ;
        int pos ;
        for (int i = 0; i < list.length; i ++){
            x = list[i];
            pos = i ;
            while (pos > 0 && x < list[pos -1 ]){
                list[pos] = list[pos -1] ;
                pos -- ;

            }

            list[pos] = x ;
            System.out.print("List after the  '" + i + "' sort: ");
            for (int e : list
                 ) {
                System.out.print(e + " ");
            }
            System.out.println();

        }
    }
}
