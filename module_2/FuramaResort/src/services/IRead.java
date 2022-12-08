package services;

import models.Customer;
import models.Employee;

import java.util.List;

public interface IRead<O>{
    List<Customer> read() ;

}
