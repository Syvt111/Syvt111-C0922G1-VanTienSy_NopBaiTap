package bai_tap;

public class LuyenThuaToan {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 2,3,5,5,1,3,7} ;
        int x = 10 ;
        for (int i = 0 ; i < arr.length; i ++){
            for (int j = i + 1 ; j < arr.length -1; j ++ ){
                if (arr[i] + arr[j] == x){
                    System.out.println("{"+ arr[i]+ "," + arr[j]+  "}");
                }
            }
        }
    }
}
