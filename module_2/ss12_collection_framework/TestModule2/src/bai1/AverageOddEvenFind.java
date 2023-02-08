package bai1;

public class AverageOddEvenFind {
    public static void main(String[] args) {
        int[] arrayNumbers = {9, 3, 5, 2, 8, 4, 15};
        System.out.println(averageOddEven(arrayNumbers));
    }

    public static int averageOddEven(int[] arr) {
        int sumOdd = 0;
        int sumEven = 0;
        int countOdd = 0;
        int countEven = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sumOdd += j;
                countOdd++;
            } else {
                sumEven += j;
                countEven++;
            }
        }
        int averageOddDouble = sumOdd / countOdd;
        int averageEvenDouble = sumEven / countEven;
        int averageOdd = Math.round(averageOddDouble);
        int averageEven = Math.round(averageEvenDouble);
        return averageOdd - averageEven;
    }
}
