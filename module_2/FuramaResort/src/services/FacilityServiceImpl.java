package services;

import models.Room;
import models.Villa;

import javax.sound.sampled.Line;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    Scanner input = new Scanner(System.in);
    @Override
    public void displayListFacility(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList) {
        System.out.println("Villa Facility");
        System.out.println(vilaList);
        System.out.println("Room Facility");
        System.out.println(roomList);
    }

    @Override
    public void addNewFacility(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList) {
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New Villa");
            System.out.println("3. Back to menu");
            System.out.println("Enter option ");
            int option = Integer.parseInt(input.nextLine());
            switch (option){
                case 1 :
                    
            }
        }while (true);

    }

    @Override
    public void displayListFacilityMaintenance(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList) {

    }

    @Override
    public void returnMainMenu(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList) {

    }
}
