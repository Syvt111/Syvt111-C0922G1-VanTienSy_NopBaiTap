package bai_tap.luyen_tap_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println("Product of list : ");
        Product product1 = new Product("moto", 1, 120000);
        Product product2 = new Product("car", 3, 20000000);
        ProductManager.addProduct(product2);
        ProductManager.addProduct(product1);
        System.out.println(ProductManager.arrayList);
        int choise = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            while (choise != 0) {
                System.out.println("Please press number to perform :");
                System.out.println("1 . Add more products ");
                System.out.println("2 . Show all products ");
                System.out.println("3 . Edit products by id ");
                System.out.println("4 . Delete products by id ");
                System.out.println("5 . Search products by name ");
                System.out.println("6 . Sort products by increase ");
                System.out.println("7 . Sort products by decrease ");
                System.out.println("0 . Exit ");
                System.out.println(" Your choise is : ");
                choise = Integer.parseInt(sc.nextLine());
                switch (choise) {
                    case 1:
                        System.out.println("Enter product of quantity ");
                        int number = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < number; i++) {
                            Product product = new Product(ProductManager.inputName(), ProductManager.inputId(), ProductManager.inputPrice());
                            ProductManager.addProduct(product);
                        }
                        break;
                    case 2:
                        System.out.println(ProductManager.arrayList);
                        break;
                    case 3:
                        ProductManager.editProduct();
                        break;
                    case 4:
                        ProductManager.deleteProduct();
                        break;
                    case 5:
                        ProductManager.searchProduct();
                        break;
                    case 6:
                        PriceIncreaseComparator priceIncreaseComparator = new PriceIncreaseComparator();
                        System.out.println("Increase to sort by price :");
                        Collections.sort(ProductManager.arrayList,priceIncreaseComparator);
                        for (Product pr : ProductManager.arrayList
                        ) {
                            System.out.println(pr);
                        }
                        break;
                    case 7:
                        PriceDecreaseComparator priceDecreaseComparator = new PriceDecreaseComparator();
                        System.out.println("Decrease to sort by price :");
                        Collections.sort(ProductManager.arrayList, priceDecreaseComparator);
                        for (Product pr : ProductManager.arrayList
                        ) {
                            System.out.println(pr);
                        }
                        break;
                    default:
                        System.out.println("No choise ");

                }
            }
            return;
        }

    }

}
