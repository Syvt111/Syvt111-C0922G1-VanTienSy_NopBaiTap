package services;

import models.Employee;

import java.util.List;

public interface IWrite<O> {
    void write(List<O> o);
}
