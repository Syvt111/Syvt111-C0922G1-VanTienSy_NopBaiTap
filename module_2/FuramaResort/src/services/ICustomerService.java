package services;

import models.Customer;

import java.util.LinkedList;

public interface ICustomerService {
    void displayListCustomers();
    void addNewCustomers(LinkedList<Customer> customers);
    void editCustomers();
    void returnMainMenu();
}
