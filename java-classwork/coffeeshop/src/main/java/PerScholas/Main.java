package PerScholas;

import java.util.List;
import java.util.Scanner;

public class Main {

    private CoffeeShop coffeeShop;
    Scanner scan = new Scanner(System.in);

    public void printMenu() {
        List<Product> products = coffeeShop.getProducts();
        for (Product product : products) {
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
    }

    public void runCoffeeShop() {
        coffeeShop = new CoffeeShop();
        coffeeShop.initProducts();
        int choice = 0;

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("1. Print the list of products");
        System.out.println("2. Order a new product");

        while (choice != 1 && choice != 2) {
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            if (choice == 1) {
                printMenu();
                break;
            }
            if (choice == 2) {
                System.out.print("Product ordering not yet functional!");
                break;
            }
            System.out.println("Invalid choice. Try again!");

        }



    }

    public static void main(String[] args) {
        Main main = new Main();
        main.runCoffeeShop();
    }
}