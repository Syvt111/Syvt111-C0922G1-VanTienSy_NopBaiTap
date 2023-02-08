package bai_tap.luyen_tap_arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager implements Comparator<Product> {
    public static int inputId() {
        System.out.println("Enter id :");
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }

    public static String inputName() {
        System.out.println("Enter name :");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int inputPrice() {
        System.out.println("Enter price :");
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }

    static ArrayList<Product> arrayList = new ArrayList<>();

    public static void addProduct(Product product) {

        arrayList.add(product);
    }

    public static void editProduct() {
        System.out.println("Enter id of product to edit ");
        int id = inputId();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.get(i).setId(inputId());
                arrayList.get(i).setName(inputName());
                arrayList.get(i).setPrice(inputPrice());
            } else {
                System.out.println("The product is not");
            }
        }
    }

    public static void deleteProduct() {
        System.out.println("Enter id of product to delete ");
        int id = inputId();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(i);
            } else {
                System.out.println("The product is not");
            }
        }
    }
    public static void searchProduct() {
        int count = 0 ;
        System.out.println("Enter the name to search product :");
        String name = inputName();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                System.out.println(arrayList.get(i));
            } else {
                count ++ ;
            }
            if (count ==arrayList.size()){
                System.out.println("Product ís not");
            }
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice() - o2.getPrice(), 0);
    }
}
