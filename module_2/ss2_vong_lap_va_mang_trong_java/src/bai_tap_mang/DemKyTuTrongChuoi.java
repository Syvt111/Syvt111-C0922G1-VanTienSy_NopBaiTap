package bai_tap_mang;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "cooodegym@123";
        char chart = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chart == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("'" + chart + "'" + " appears " + count + " times");

    }
}
