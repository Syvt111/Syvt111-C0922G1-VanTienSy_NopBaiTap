import java.util.Scanner;
import java.util.Stack;

public class DoiThapPhanSangNhiPhan {
    public static void main(String[] args) {
        System.out.println("Nhập số thập phân :");
        Scanner input = new Scanner(System.in);
        int soThapPhan = input.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (soThapPhan!=0){
            int soDu = soThapPhan%2 ;
            stack.add(soDu);
            soThapPhan/=2 ;
        }
        System.out.print("Dãy số nhị phân là : ");
        while ((stack.isEmpty())==false){
            System.out.print(stack.pop());
        }
    }
}
