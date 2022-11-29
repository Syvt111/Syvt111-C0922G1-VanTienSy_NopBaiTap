package bai_tap.QuanLySanPhamBinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteAndReadProductFile {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choise = -1;
        while (true) {
            while (choise != 0) {
                String path = "D:\\Codegym\\C0922G1-VanTienSy\\module_2\\ss17_binaryFile_serialization\\" +
                        "src\\bai_tap\\QuanLySanPhamBinaryFile\\Products.txt";
                List<Product> products = ProductManager.readProductFromFile(path);
                System.out.println("0. Exit  1. Add product   2. Show all products   3. Search product by code");
                System.out.println("Please press number : ");
                choise = Integer.parseInt(scanner.nextLine());
                switch (choise) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        System.out.println("Enter product of quantity");
                        Scanner sc = new Scanner(System.in);
                        int number = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < number; i++) {
                            Product product = new Product(ProductManager.inputCode(), ProductManager.inputName(),
                                    ProductManager.inputMaker(), ProductManager.inputPrice(), ProductManager.inputNote());
                            products.add(product);
                        }
                        ProductManager.writeProductToFile(path,products);
                        break;
                    case 2:

                        ProductManager.showAllProduct(products);
                        break;
                    case 3:
                        ProductManager.searchProduct(products);
                        break;
                    default:
                        System.out.println("No choise");
                }
            }
            return;
        }

    }

}
