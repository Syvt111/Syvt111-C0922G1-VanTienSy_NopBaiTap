package thuc_hanh.tinh_tong_cac_so_trong_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void reaFileText(String filePath){

        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new BufferedReader(new FileReader(file)));
            String line = "";
            int sum = 0 ;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi !");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường link file ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.reaFileText(path);
    }
}
