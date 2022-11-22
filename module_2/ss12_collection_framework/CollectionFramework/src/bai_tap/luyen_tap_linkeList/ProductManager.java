package bai_tap.luyen_tap_arrayList_LinkeList;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
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

    static LinkedList<Product> linkedList = new LinkedList<>();

    public static void addProduct(Product product) {
        linkedList.add(product);
    }

    public static void editProduct() {
        System.out.println("Enter id of product to edit ");
        int id = inputId();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId() == id) {
                linkedList.get(i).setId(inputId());
                linkedList.get(i).setName(inputName());
                linkedList.get(i).setPrice(inputPrice());
            } else {
                System.out.println("The product is not");
            }
        }
    }

    public static void deleteProduct() {
        System.out.println("Enter id of product to delete ");
        int id = inputId();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId() == id) {
                linkedList.remove(i);
            } else {
                System.out.println("The product is not");
            }
        }
    }
    public static void searchProduct() {
        int count = 0 ;
        System.out.println("Enter the name to search product :");
        String name = inputName();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getName().equals(name)) {
                System.out.println(linkedList.get(i));
            } else {
                count ++ ;
            }
            if (count == linkedList.size()){
                System.out.println("Product ís not");
            }
        }
    }
}
