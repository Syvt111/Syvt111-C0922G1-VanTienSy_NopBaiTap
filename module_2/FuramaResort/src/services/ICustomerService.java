package services;

import models.Customer;

import java.util.LinkedList;

public interface ICustomerService {
    void displayListCustomers(LinkedList<Customer> customers);
    void addNewCustomers(LinkedList<Customer> customers);
    void editCustomers(LinkedList<Customer> customers);
    void returnMainMenu(LinkedList<Customer> customers);
}
