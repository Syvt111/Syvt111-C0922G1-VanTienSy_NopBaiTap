package fibonaci;

import java.util.Scanner;

public class FindFibonaci {
    public static void main(String[] args) {
        System.out.println(" NHập số nguyên n <= 20 ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 20 ){
            System.out.println("Nhập lại n ");
            number = input.nextInt();
        }
        System.out.print("Số fibonaci của của '" + number +"' :");
        System.out.println(findFibonaci(number));


    }
    public static int findFibonaci(int number) {
        int[] list = new  int[20];
        int sum = 0;
        for (int j = 0; j <= number; j++) {
            sum+= sum ;
        }
      return sum ;
    }

}
