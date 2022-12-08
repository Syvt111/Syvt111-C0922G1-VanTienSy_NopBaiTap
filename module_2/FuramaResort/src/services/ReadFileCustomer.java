package services;

import models.Customer;
import models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileCustomer implements IRead<Customer> {
    @Override
    public LinkedList<Customer> read() {
        BufferedReader bufferedReader = null ;
        LinkedList<Customer> customerList = new LinkedList<>();
        try{
            FileReader fileReader = new FileReader("D:\\Codegym\\C0922G1-VanTienSy\\module_2\\FuramaResort\\src\\data\\customer.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine())!=null){
                String[] splitData = line.split(",");
               Customer customer = new Customer(Integer.parseInt(splitData[0]),splitData[1],splitData[3],splitData[4],splitData[5],splitData[6],splitData[7],splitData[8],splitData[9]);
               customerList.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return customerList ;
    }

}
