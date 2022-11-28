package bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        final String FILE_TARGET = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss16_Io_texfile\\src\\bai_tap\\copy_file_text\\target.csv";
        final String FILE_SOURCE = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss16_Io_texfile\\src\\bai_tap\\copy_file_text\\source.csv";
        String str = "bai tap copy file";
        writeFile(FILE_SOURCE, str);
        copyFile(FILE_TARGET, readFile(FILE_SOURCE));
    }

    public static void copyFile(String targetFile, List<String> list) {
        try {
            FileWriter fileWriter = new FileWriter(targetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(String sourceFile, String string) {
        try {
            FileWriter fileWriter = new FileWriter(sourceFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> readFile(String sourceFile) {
        List<String> listString = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                listString.add(string);
                System.out.println(string);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listString;
    }
}