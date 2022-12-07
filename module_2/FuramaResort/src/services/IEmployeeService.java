package services;

import models.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    void displayListEmployee(List<Employee> employee);
    void addNewEmployee(List<Employee> employees);
    void deleteEmployee(List<Employee> employeeList);
    void editEmployee(List<Employee> employeeList);
    void returnMainMenu(List<Employee> employeeList);
}
