package services;

import models.Room;
import models.Villa;

import java.util.LinkedHashMap;

public interface IFacilityService extends IService {
    void displayListFacility(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    void addNewFacility(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    void displayListFacilityMaintenance(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);

    void returnMainMenu(LinkedHashMap<Villa,Integer> vilaList,LinkedHashMap<Room,Integer> roomList);
}
