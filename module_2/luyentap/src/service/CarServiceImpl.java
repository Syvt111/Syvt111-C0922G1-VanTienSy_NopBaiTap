package service;

import models.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarServiceImpl implements ICarService<Car> {
    Scanner input = new Scanner(System.in);

    @Override
    public List<Car> addCar() {
        List<Car> carList = new ArrayList<>();
        System.out.println("Input id, version, color,price");
        String id = input.nextLine();
        String version = input.nextLine();
        String color = input.nextLine();
        short price = (short) Integer.parseInt(input.nextLine());
        Car car = new Car(id,version,color,price);
        carList.add(car);
        return carList;
    }

    @Override
    public void delete(List<Car> carList) {
        System.out.println("Input id ");
        String id = input.nextLine();
        for (Car cr: carList
             ) {
            if (id.equals(cr.getId())){
                carList.remove(cr);
                break;
            }
        }

    }


    @Override
    public void edit(List<Car> carList) {
        System.out.println("Input id ");
        String id = input.nextLine();
        for (Car cr: carList
        ) {
            if (id.equals(cr.getId())){
                 cr.setVersion(input.nextLine());
                 cr.setColor(input.nextLine());
                 cr.setPrice((short) Integer.parseInt(input.nextLine()));
                 break;
            }
        }

    }

    @Override
    public void write(List<Car> carList) {
       final String PATH_FILE =  "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\luyentap\\src\\data\\carList.csv";
        FileWriter fileWriter;
        BufferedWriter bufferedWriter ;
        try{
            fileWriter = new FileWriter(PATH_FILE);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Car car:carList
                 ) {bufferedWriter.write(car.csvFormat());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Car> read() {
        final String PATH_FILE =  "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\luyentap\\src\\data\\carList.csv";
        List<Car> carList = new ArrayList<>();
        FileReader fileReader ;
        BufferedReader bufferedReader = null;
        try {
            String line  ;
            fileReader = new FileReader(PATH_FILE);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] element = line.split(",");
                Car car = new Car(element[0], element[1], element[2], (short) Integer.parseInt(element[3]));
                carList.add(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return carList;
    }
}
