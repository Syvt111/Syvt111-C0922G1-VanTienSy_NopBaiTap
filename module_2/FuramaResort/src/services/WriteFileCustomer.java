package services;

import models.Customer;
import models.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomer implements IWrite<Customer> {
    @Override
    public void write(List<Customer> customerList) {
        File file = new File("D:\\Codegym\\C0922G1-VanTienSy\\module_2\\FuramaResort\\src\\data\\customer.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter ;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.formatCsvCustomer());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();

        } catch (IOException e) {
            System.out.println("File not found ");

        }
    }
}
