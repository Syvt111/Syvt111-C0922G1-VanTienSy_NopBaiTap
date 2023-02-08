package services;
import models.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee implements IRead<Employee> {
    @Override
    public List<Employee> read() {
        BufferedReader bufferedReader = null;
        List<Employee> employeeList = new ArrayList<>();
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("D:\\Codegym\\C0922G1-VanTienSy\\module_2\\FuramaResort\\src\\data\\employee.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                Employee employee = new Employee(Integer.parseInt(splitData[0]),splitData[1],splitData[2],splitData[3],
                        splitData[4],splitData[5],splitData[6],splitData[7],splitData[8],Integer.parseInt(splitData[9]));
                employeeList.add(employee);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

}
