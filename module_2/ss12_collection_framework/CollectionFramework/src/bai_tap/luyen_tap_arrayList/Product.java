package bai_tap.luyen_tap_arrayList;

public class Product {
    private  String  name ;
    private int id;
    private int price ;

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id ) {
        this.id = id ;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

    }
