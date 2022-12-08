package services;

import controllers.FuramaController;
import models.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner input = new Scanner(System.in);
    WriteFileCustomer writeFileCustomer = new WriteFileCustomer();
    ReadFileCustomer readFileCustomer = new ReadFileCustomer();

    @Override
    public void displayListCustomers() {
        System.out.println(readFileCustomer.read());
    }
    @Override
    public void addNewCustomers(LinkedList<Customer> customers) {
        System.out.println("Enter customer of numbers ");
        int  number = Integer.parseInt(input.nextLine());
        for (int i = 1 ; i <= number; i ++){
            System.out.println("Customer "+ i);
            System.out.println("Input id :");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Input name :");
            String name = input.nextLine();
            System.out.println("Input birthday  :");
            String birthday  = input.nextLine();
            System.out.println("Input gender  :");
            String gender  = input.nextLine();
            System.out.println("Input số cmnd :");
            String cmnd  = input.nextLine();
            System.out.println("Input phone number  :");
            String phoneNumber  = input.nextLine();
            System.out.println("Input email :");
            String email  = input.nextLine();
            System.out.println("Input ty of customer :");
            String customerType  = input.nextLine();
            System.out.println("Input address :");
            String address  = input.nextLine();
            Customer customer = new Customer(id,name,birthday,gender,cmnd,phoneNumber,email,customerType,address);
            customers.add(customer);
            writeFileCustomer.write(customers);
        }
    }
    @Override
    public void editCustomers() {
        LinkedList<Customer> customers = readFileCustomer.read();
        System.out.println("Enter id of customer ");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= customers.size(); i ++){
            if (id == customers.get(i).getId()){
                System.out.println("Input new name :");
                customers.get(i).setName(input.nextLine());
                System.out.println("Input new birthday  :");
                customers.get(i).setBirthDate(input.nextLine());
                System.out.println("Input new gender  :");
                customers.get(i).setGender(input.nextLine());
                System.out.println("Input new cmnd :");
                customers.get(i).setCmndNumber(input.nextLine());
                System.out.println("Input new phone number  :");
                customers.get(i).setCmndNumber(input.nextLine());
                System.out.println("Input email :");
                customers.get(i).setEmail(input.nextLine());
                System.out.println("Input new type of customer :");
                customers.get(i).setCustomerType(input.nextLine());
                System.out.println("Input new address :");
                customers.get(i).setAddress(input.nextLine());
                break;
            }
        }
        writeFileCustomer.write(customers);
    }
    @Override
    public void returnMainMenu() {
        FuramaController.displayMaiMenu();
    }
}
