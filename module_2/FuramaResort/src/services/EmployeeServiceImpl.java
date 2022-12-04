package services;

import controllers.FuramaController;
import models.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    static Scanner input = new Scanner(System.in);

    @Override
    public void displayListEmployee(List<Employee> employees) {
        for (Employee emp : employees){
            System.out.println(emp);
        }
    }
    @Override
    public void addNewEmployee(List<Employee> employees) {
        System.out.println("Enter employee of numbers ");
       int  number = Integer.parseInt(input.nextLine());
       for (int i = 1 ; i <= number; i ++){
           System.out.println("Employee "+ i);
           System.out.println("Input id :");
           int id = Integer.parseInt(input.nextLine());
           System.out.println("Input name :");
           String name = input.nextLine();
           System.out.println("Input birthday  :");
           String birthday  = input.nextLine();
           System.out.println("Input phone number  :");
           String phoneNumber  = input.nextLine();
           System.out.println("Input email :");
           String email  = input.nextLine();
           System.out.println("Input level :");
           String level  = input.nextLine();
           System.out.println("Input position :");
           String position  = input.nextLine();
           System.out.println("Input salary");
           int salary = Integer.parseInt(input.nextLine());
           Employee employee = new Employee(id,name,birthday,phoneNumber,email,level,position,salary);
           employees.add(employee);
       }
    }
    @Override
    public void deleteEmployee(List<Employee> employeeList) {
        System.out.println("Input id");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0 ; i < employeeList.size(); i ++){
            if (id == employeeList.get(i).getId()){
                employeeList.remove(i);
            }
        }
    }
    @Override
    public void editEmployee(List<Employee> employeeList) {
        System.out.println("Input id");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < employeeList.size(); i ++){
            if (id == employeeList.get(i).getId()){
                System.out.println("Enter new name ");
                employeeList.get(i).setName(input.nextLine());
                System.out.println("Enter new birthday ");
                employeeList.get(i).setBirthDate(input.nextLine());
                System.out.println("Enter new phone number ");
                employeeList.get(i).setPhoneNumber(input.nextLine());
                System.out.println("Enter new email ");
                employeeList.get(i).setEmail(input.nextLine());
                System.out.println("Enter new level ");
                employeeList.get(i).setLevel(input.nextLine());
                System.out.println("Enter new position ");
                employeeList.get(i).setPosition(input.nextLine());
                System.out.println("Enter new salary ");
                employeeList.get(i).setSalary(Integer.parseInt(input.nextLine()));
            }
        }

    }

    @Override
    public void returnMainMenu(List<Employee> employeeList) {
        FuramaController.displayMaiMenu();

    }
}
