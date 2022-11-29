package bai_tap.QuanLySanPhamBinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static String inputCode() {
        System.out.println("Enter code of product ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String inputName() {
        System.out.println("Enter name of product ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static String inputMaker() {
        System.out.println("Enter maker of product ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int inputPrice() {
        Scanner input = null;
        try {
            System.out.println("Enter price of product ");
            input = new Scanner(System.in);

        } catch (NumberFormatException e) {
            System.out.println("Price is not number");

        }
        return Integer.parseInt(input.nextLine());
    }


    public static String inputNote() {
        System.out.println("Enter more description of product ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
//        static List<Product> products = new ArrayList<>();

    public static void showAllProduct(List<Product> products) {
        System.out.println("Show all products ");
        for (Product pr : products
        ) {
            System.out.println(pr);
        }
    }

    public static void searchProduct(List<Product> products) {
        System.out.println("Enter code of product to search ");
        String code = inputCode();
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCode().equals(code)) {
                System.out.println("The product with code = " + code);
                System.out.println(products.get(i));
            } else {
                count++;
            }
            if (count == products.size()) {
                System.out.println("Not found");
            }

        }
    }

    public static void writeProductToFile(String path, List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static List<Product> readProductFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception ex) {
            System.out.println("Product is empty, please add product !");
        }
        return products;
    }
}

