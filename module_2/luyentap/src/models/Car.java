package models;

public class Car extends Products{
    private short price ;

    public Car(short price) {
        this.price = price;
    }

    public Car(String id, String version, String color, short price) {
        super(id, version, color);
        this.price = price;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +"id="+ super.getId() +"version="+super.getVersion()+"color="+super.getColor()+
                "price=" + price +
                '}';
    }
    public String csvFormat(){
       return super.getId()+","+super.getVersion()+","+super.getColor()+","+price;
    }
}
