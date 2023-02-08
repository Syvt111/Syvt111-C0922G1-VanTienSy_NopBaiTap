package bai4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    static final String PATH = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss12_collection_framework\\TestModule2\\src\\bai4\\danh_sach_hoc_vien.csv";
    public static void writeFileStudent(List<CodeGymStudent> studentList) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CodeGymStudent student : studentList
            ) {
                bufferedWriter.write(student.csvFormat());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<CodeGymStudent> readFileStudent() {
        List<CodeGymStudent> studentList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            String line;
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] element = line.split(",");
                CodeGymStudent student = new CodeGymStudent(element[0], element[1], element[2], element[3], element[4]);
                studentList.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader == null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }
}
