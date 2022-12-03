public class VeHinhThoiBangSo {
    public static void main(String[] args) {
        System.out.println("     11");
        System.out.println("    2   2");
        System.out.println("   3     3");
        System.out.println("  4       4");
        System.out.println(" 5         5");
        System.out.println("  4       4");
        System.out.println("   3     3");
        System.out.println("     2  2");
        System.out.println("      11");
        System.out.println("Hình thoi bằng số từ 1 -5 ");
        veHinhThoi();
    }

    public static void veHinhThoi() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + 1);
            for (int e = 0; e <= 2 * i + 1; e++) {
                System.out.print(" ");
            }
            System.out.print(i + 1);
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int e = i; e > 0; e--) {
                System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}


