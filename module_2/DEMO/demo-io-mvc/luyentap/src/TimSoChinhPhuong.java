import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimSoChinhPhuong {
    public static boolean validNumber(String regex) {
        String inputNumber = "\\d*(.0)";
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(inputNumber);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public List<Integer> timSoChinhPhuong() {
        List<Integer> soChinhPhuong = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            if (validNumber(String.valueOf(Math.sqrt(i)))) {
                soChinhPhuong.add(i);
            }
        }
        return soChinhPhuong;


//        for (int i = 1 ; i < 100 ; i ++ ){
//           if (Math.sqrt(i)%1==0){
//               System.out.print(i + " ");
//           }
//        }
        //        for (int i = 1 ; i < 100 ; i ++ ){
//           if (Math.sqrt(i)%1==0){
//               System.out.print(i + " ");
//           }

//        int soChinhPhuong = 1 ;
//        int i = 2 ;
//        while (soChinhPhuong < 100){
//            System.out.println(soChinhPhuong + "  ");
//            soChinhPhuong = i*i ;
//            i ++ ;
//        }
        //        for (int i = 1 ; i < 100 ; i ++ ){
//           if (Math.sqrt(i)%1==0){
//               System.out.print(i + " ");
//           }
    }

    public void write(String path, List<Integer> lists) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            for (Integer list : lists
            ) {
                fileWriter.write(String.valueOf(list)+"  ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public List<String> read(String path) {
        FileReader fileReader ;
        BufferedReader bufferedReader ;
        List<String> soChinhPhuong = new ArrayList<>();
        try {
            String line;
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                soChinhPhuong.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return soChinhPhuong;
    }

    public static void main(String[] args) {
        TimSoChinhPhuong timSoChinhPhuong = new TimSoChinhPhuong();
        System.out.println("Dãy số chính phương < 100");
        for (Integer ls : timSoChinhPhuong.timSoChinhPhuong()
        ) {
            System.out.print(ls + "  ");
        }
        final String PATH = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\DEMO" +
                "\\demo-io-mvc\\luyentap\\src\\sochinhphuong.csv";
        timSoChinhPhuong.write(PATH,timSoChinhPhuong.timSoChinhPhuong());
        System.out.println();
        for (String so:timSoChinhPhuong.read(PATH)
             ) {
            System.out.println(so+"   ");
        }
    }
}
