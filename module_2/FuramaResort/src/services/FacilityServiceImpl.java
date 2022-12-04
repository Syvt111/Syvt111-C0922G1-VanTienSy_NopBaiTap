package services;

import controllers.FuramaController;
import models.Room;
import models.Villa;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner input = new Scanner(System.in);

    @Override
    public void displayListFacility(LinkedHashMap<Villa, Integer> vilaList, LinkedHashMap<Room, Integer> roomList) {
        System.out.println("Villa facility");
        for (Villa key : vilaList.keySet()) {
            System.out.println(key + " " + " Number of times used " + vilaList.get(key));
        }
        System.out.println("Room facility");
        for (Room key : roomList.keySet()) {
            System.out.println(key + " " + " Number of times used " + roomList.get(key));
        }
    }

    @Override
    public void addNewFacility(LinkedHashMap<Villa, Integer> villaList, LinkedHashMap<Room, Integer> roomList) {
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New Room");
            System.out.println("3. Back to main menu");
            System.out.println("Enter option ");
            int optionService = Integer.parseInt(input.nextLine());
            switch (optionService) {
                case 1:
                    System.out.println("Enter numbers of villa ");
                    int numberVilla = Integer.parseInt(input.nextLine());
                    for (int i = 1; i <= numberVilla; i++) {
                        System.out.println("Enter service name ");
                        String serviceName = input.nextLine();
                        System.out.println("Enter use area ");
                        int useArea = Integer.parseInt(input.nextLine());
                        System.out.println("Enter price ");
                        int price = Integer.parseInt(input.nextLine());
                        System.out.println("Enter the maximum number of people ");
                        int maxPeople = Integer.parseInt(input.nextLine());
                        System.out.println("Enter type of rent ");
                        String rentType = input.nextLine();
                        System.out.println("Enter room standard");
                        String roomStandard = input.nextLine();
                        System.out.println("Enter poof of area ");
                        int poolArea = Integer.parseInt(input.nextLine());
                        System.out.println("Enter numbers of floors ");
                        int numberFloors = Integer.parseInt(input.nextLine());
                        Villa villas = new Villa(serviceName, useArea, price, maxPeople, rentType, roomStandard, poolArea, numberFloors);
                        System.out.println("Enter number of times used");
                        int numberOfTimesOfVilla = Integer.parseInt(input.nextLine());
                        villaList.put(villas, numberOfTimesOfVilla);
                    }
                    break;
                case 2:
                    System.out.println("Enter numbers of room ");
                    int numberRoom = Integer.parseInt(input.next());
                    for (int j = 1; j <= numberRoom; j++) {
                        System.out.println("Enter service name ");
                        String serviceName = input.nextLine();
                        System.out.println("Enter use area ");
                        int useArea = Integer.parseInt(input.next());
                        System.out.println("Enter price ");
                        int price = Integer.parseInt(input.nextLine());
                        System.out.println("Enter the maximum number of people ");
                        int maxPeople = Integer.parseInt(input.nextLine());
                        System.out.println("Enter type of rent ");
                        String rentType = input.nextLine();
                        System.out.println("Enter free service include ");
                        String freeServiceInclude = input.nextLine();
                        Room rooms = new Room(serviceName, useArea, price, maxPeople, rentType, freeServiceInclude);
                        System.out.println("Enter number of times used");
                        int numberOfTimesOfRoom = Integer.parseInt(input.nextLine());
                        roomList.put(rooms, numberOfTimesOfRoom);
                    }
                    break;
                case 3:
                    do {
                        System.out.println( "1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n");
                        System.out.println("Enter your option ");
                        int option3 = Integer.parseInt(input.nextLine());
                        switch (option3) {
                            case 1:
                                displayListFacility(villaList, roomList);
                            case 2:
                               addNewFacility(villaList, roomList);
                            case 3:
                                displayListFacilityMaintenance(villaList, roomList);
                            case 4:
                                returnMainMenu(villaList, roomList);
                        }

                    }
                    while (true);
            }
        }

        while (true);
    }

    @Override
    public void displayListFacilityMaintenance(LinkedHashMap<Villa, Integer> vilaList, LinkedHashMap<Room, Integer> roomList) {
        System.out.println("Villa facility");
        for (Villa key : vilaList.keySet()) {
            System.out.println(key + " " + " Number of times used " + vilaList.get(key));
        }
        System.out.println("Room facility");
        for (Room key : roomList.keySet()) {
            System.out.println(key + " " + " Number of times used " + roomList.get(key));
        }
    }
    @Override
    public void returnMainMenu(LinkedHashMap<Villa, Integer> vilaList, LinkedHashMap<Room, Integer> roomList) {
        FuramaController.displayMaiMenu();
    }
}

