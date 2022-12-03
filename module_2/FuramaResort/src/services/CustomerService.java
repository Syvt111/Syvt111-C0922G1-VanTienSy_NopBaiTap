package services;

import models.Customer;

import java.util.LinkedList;
import java.util.List;

public interface CustomerService extends Service{
    void displayListCustomers(LinkedList<Customer> customers);
    void addNewCustomers(LinkedList<Customer> customers);
    void editCustomers(LinkedList<Customer> customers);
    void returnMainMenu(LinkedList<Customer> customers);
}
