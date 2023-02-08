package services;

import models.Customer;

import java.util.LinkedList;
import java.util.List;

public interface IRead<O>{
    List<O> read() ;

}
