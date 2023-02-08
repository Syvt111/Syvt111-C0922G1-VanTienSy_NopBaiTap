package service;

import models.Car;

import java.util.List;

public interface ICarService<O> {
     List<Car> addCar() ;
     void delete(List<Car> carList);

     void edit(List<Car> carList);


     void write(List<Car> carList);

     List<Car>read();

}
