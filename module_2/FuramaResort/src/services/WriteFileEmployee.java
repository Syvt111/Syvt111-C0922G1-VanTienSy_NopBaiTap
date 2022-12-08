package services;

import models.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee implements IWrite<Employee> {
    @Override
    public void write(List<Employee> employeeList) {
        final String PATH = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\FuramaResort\\src\\data\\employee.csv";
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employees : employeeList) {
                bufferedWriter.write(employees.formatCsvEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            System.out.println("File not found ");
        }
        finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

