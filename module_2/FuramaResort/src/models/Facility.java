package models;

public abstract class Facility {
public String serviceName ;
public int useArea ;
public int price ;
public int maxPeople ;
public String rentType ;

    public Facility(String serviceName, int useArea, int price, int maxPeople, String rentType) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getUseArea() {
        return useArea;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", useArea=" + useArea +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
