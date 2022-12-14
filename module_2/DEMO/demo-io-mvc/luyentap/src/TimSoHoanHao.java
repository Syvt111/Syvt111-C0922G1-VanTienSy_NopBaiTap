public class TimSoChinhPhuong {
    public static void timSoChinhPhuong(){
        System.out.println("Dãy số hoàn hảo < 1000 ");
        int sum = 0;
        for (int i = 2 ; i < 1000 ; i ++) {

            for (int j = 1 ; j < i ; j++){
                if (i % j == 0){
                    sum = sum  + j ;
                }
            }
            if (sum == i){
                System.out.print(i + "  ");
            }
        }
    }

    public static void main(String[] args) {
        timSoChinhPhuong();
    }
}
