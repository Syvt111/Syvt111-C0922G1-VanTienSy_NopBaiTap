package thuc_hanh.readAndWirteByBinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestWriteAndReadToObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        final String path = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss17_binaryFile_serialization\\src" +
                "\\thuc_hanh\\readAndWirteByBinaryFile\\StudentList.txt";
        writeToObject(path, students);
        List<Student> studentDataOfFile = readDataFromFile("D:\\Codegym\\C0922G1-VanTienSy\\module_2" +
                "\\ss17_binaryFile_serialization\\src\\thuc_hanh\\readAndWirteByBinaryFile\\StudentList.txt");
        for (Student st : studentDataOfFile
        ) {
            System.out.println(st);

        }
    }

    public static void writeToObject(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
