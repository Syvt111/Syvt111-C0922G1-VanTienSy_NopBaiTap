package services;

import models.Employee;

import java.util.List;

public interface IEmployeeService {
    void displayListEmployee();
    void addNewEmployee(List<Employee> employees);
    void deleteEmployee();
    void editEmployee();
    void returnMainMenu();
}
