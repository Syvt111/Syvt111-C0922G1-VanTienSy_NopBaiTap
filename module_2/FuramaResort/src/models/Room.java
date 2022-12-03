package models;

public class Room extends Facility{
    private String freeServiceInclude ;

    public Room(String serviceName, int useArea, int price, int maxPeople, String rentType) {
        super(serviceName, useArea, price, maxPeople, rentType);
    }

    public Room(String serviceName, int useArea, int price, int maxPeople, String rentType, String freeServiceInclude) {
        super(serviceName, useArea, price, maxPeople, rentType);
        this.freeServiceInclude = freeServiceInclude;
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                "freeServiceInclude='" + freeServiceInclude + '\'' +
                '}';
    }
}
