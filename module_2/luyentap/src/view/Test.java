package view;

import models.Car;
import service.CarServiceImpl;

import java.util.List;

public class Test {
    static CarServiceImpl carService = new CarServiceImpl();
    public static void test(){
        List<Car> carList ;
       carList = carService.addCar();
        carService.write(carList);
        for (Car car:carService.read()
             ) {
            System.out.println(car);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
