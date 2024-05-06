package PerScholas;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Product> products = new ArrayList<>();

    public void initProducts() {
        Product smallCoffee = new Product();
        smallCoffee.setName("Small Coffee");
        smallCoffee.setPrice(6.50);
        smallCoffee.setIsBeverage(true);
        products.add(smallCoffee);

        Product largeCoffee = new Product();
        largeCoffee.setPrice(9.46);
        largeCoffee.setName("Large Coffee");
        largeCoffee.setIsBeverage(true);
        products.add(largeCoffee);

        Product cakePop = new Product();
        cakePop.setPrice(4.89);
        cakePop.setName("Cake Pop");
        cakePop.setIsBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product();
        eggSandwich.setPrice(7.89);
        eggSandwich.setName("Egg Sandwich");
        eggSandwich.setIsBeverage(false);
        products.add(eggSandwich);
    }

    public List<Product> getProducts() {
        return products;
    }
}
