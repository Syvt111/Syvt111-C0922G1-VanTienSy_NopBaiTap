package thuc_hanh.tim_gia_tri_lon_nha_ghi_ra_file;

import java.io.File;
import java.io.IOException;

public class CreaFileNumbersTxt {

        public static void main(String[] args) throws IOException {
            File file = null ;
            boolean isCreat = false ;
            try{
                file = new File("D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss16_Io_texfile\\src\\thuc_hanh\\tim_gia_tri_lon_nha_ghi_ra_file/result.txt");
                isCreat = file.createNewFile();
                if (isCreat){
                    System.out.println("Đã tạo file thành công");
                }else
                    System.out.println("Tạo file thất bại");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

