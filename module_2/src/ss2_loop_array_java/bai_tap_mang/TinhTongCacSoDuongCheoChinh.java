package ss2_loop_array_java.bai_tap_mang;

public class TinhTongCacSoDuongCheoChinh {
    public static void main(String[] args) {
        double[][] number2D = {{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        double sum = 0;
        for (int i = 0; i < number2D.length; i++) {
            sum += number2D[i][i];
        }
        System.out.println(sum);
    }
}
