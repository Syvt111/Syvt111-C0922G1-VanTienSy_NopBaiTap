package models;

public class Villa extends Facility {
    private String roomStandar ;
    private int poolArea ;
    private int numberFloors;

    public Villa(String serviceName, int useArea, int price, int maxPeople, String rentType) {
        super(serviceName, useArea, price, maxPeople, rentType);
    }

    public Villa(String serviceName, int useArea, int price, int maxPeople, String rentType, String roomStandar, int poolArea, int numberFloors) {
        super(serviceName, useArea, price, maxPeople, rentType);
        this.roomStandar = roomStandar;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                "roomStandar='" + roomStandar + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
