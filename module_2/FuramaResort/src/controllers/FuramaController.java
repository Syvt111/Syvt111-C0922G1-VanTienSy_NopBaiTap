package controllers;

import models.Customer;
import models.Employee;
import models.Room;
import models.Villa;
import services.*;

import java.util.*;

public class FuramaController {
    static Scanner input = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static LinkedList<Customer> customerList = new LinkedList<>();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static LinkedHashMap<Villa, Integer> villaList = new LinkedHashMap<>();
    static LinkedHashMap<Room, Integer> roomList = new LinkedHashMap<>();

    public static void displayMaiMenu() {
        do {
            System.out.println("Main menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your option ");
            int option = Integer.parseInt(input.nextLine());
            switch (option) {

                case 1:
                    do {
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Delete employee");
                        System.out.println("4. Edit employee");
                        System.out.println("5. Return main menu");
                        System.out.println("Enter your option ");
                        int option1 = Integer.parseInt(input.nextLine());
                        switch (option1) {
                            case 1:
                                employeeService.displayListEmployee();
                                break;
                            case 2:
                                employeeService.addNewEmployee(employeeList);
                                break;
                            case 3:
                                employeeService.deleteEmployee();
                                break;
                            case 4:
                                employeeService.editEmployee();
                                break;
                            case 5:
                                employeeService.returnMainMenu();
                                break;
                        }
                    } while (true);

                case 2:
                    do {
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        System.out.println("Enter your option ");
                        int option2 = Integer.parseInt(input.nextLine());
                        switch (option2) {
                            case 1:
                                customerService.displayListCustomers();
                            case 2:
                                customerService.addNewCustomers(customerList);
                            case 3:
                                customerService.editCustomers();
                            case 4:
                                customerService.returnMainMenu();
                        }
                    } while (true);

                case 3:
                    do {
                        System.out.println( "1\tDisplay list facility\n" +
                                            "2\tAdd new facility\n" +
                                            "3\tDisplay list facility maintenance\n" +
                                            "4\tReturn main menu\n");
                        System.out.println("Enter your option ");
                        int option3 = Integer.parseInt(input.nextLine());
                        switch (option3) {
                            case 1:
                                facilityService.displayListFacility(villaList, roomList);
                            case 2:
                                facilityService.addNewFacility(villaList, roomList);
                            case 3:
                                facilityService.displayListFacilityMaintenance(villaList, roomList);
                            case 4:
                                facilityService.returnMainMenu(villaList, roomList);
                        }

                    } while (true);


                case 4:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int option4 = Integer.parseInt(input.nextLine());

                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int option5 = Integer.parseInt(input.nextLine());
                case 6:
                    System.exit(0);

            }

        } while (true);


    }

}
