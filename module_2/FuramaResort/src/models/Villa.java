package models;

public class Villa extends Facility {
    private String roomStandard;
    private int poolArea ;
    private int numberFloors;

    public Villa(String codeService,String serviceName, int useArea, int price, int maxPeople, String rentType) {
        super(codeService,serviceName, useArea, price, maxPeople, rentType);
    }

    public Villa(String codeService, String serviceName, int useArea, int price, int maxPeople, String rentType, String roomStandar, int poolArea, int numberFloors) {
        super(codeService,serviceName, useArea, price, maxPeople, rentType);
        this.roomStandard = roomStandar;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +"codeSevice="+ codeService +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                "roomStandar='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
