package bai_tap.QuanLySanPhamBinaryFile;

import java.io.Serializable;

public class Product implements Serializable {
    private String code ;
    private String name ;
    private String maker ;
    private int price;
    private String note ;

    public Product(String code, String name, String maker, int price, String note) {
        this.code = code;
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.note = note;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public String getNote() {
        return note;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
