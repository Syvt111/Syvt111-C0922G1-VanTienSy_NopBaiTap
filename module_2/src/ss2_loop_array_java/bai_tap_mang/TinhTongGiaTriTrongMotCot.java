package ss2_loop_array_java.bai_tap_mang;

import java.util.Scanner;

public class TinhTongGiaTriTrongMotCot {
    public static void main(String[] args) {
        double [][]  number2D = {{1,2,3,4,5},{6,7,8,9,10}};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a colum :");
        int colum = Integer.parseInt(input.next());
        double sum = 0 ;
        for (double[] doubles : number2D) {
            sum += doubles[colum];
        }
        System.out.println("The sum of colum is :" + sum);
    }

}
