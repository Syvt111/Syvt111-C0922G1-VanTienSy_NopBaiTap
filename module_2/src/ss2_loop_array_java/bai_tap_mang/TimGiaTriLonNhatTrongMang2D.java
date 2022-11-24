package ss2_loop_array_java.bai_tap_mang;

public class TimGiaTriLonNhatTrongMang2D {
    public static void main(String[] args) {
        int[][] array2D = {{1,2,3,4,5},{3,4,5,6,7,8}};
        int max = array2D[0][0];
        for (int i = 0; i < array2D.length;i++){
            for (int j = 0; j < array2D[i].length;j++){
                if (array2D[i][j]>max){
                    max = array2D[i][j];
                }
            }
        }
        System.out.println("Max is " + max);
    }
}
