package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        int var1 = 10;
        int var2 = 40;
        int sum1 = var1 + var2;
        System.out.println(sum1);

        // Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        double var3 = 33.333;
        double var4 = 66.667;
        double sum2 = var3 + var4;
        System.out.println(sum2);

        // Write a program that declares an integer variable and a double variable, assigns numbers to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        // What variable type must the sum be?
        int var5 = 20;
        double var6 = 22.22;
        double sum3 = var5 + var6;
        System.out.println(sum3);

        // Write a program that declares two integer variables, assigns an integer to each,
        // and divides the larger number by the smaller number. Assign the result to a variable.
        // Print out the result. Now change the larger number to a decimal.
        // What happens? What corrections are needed?
        int var7 = 25;
        int var8 = 42;
        double result1 = var8 / var7;
        System.out.println("Dividing 42 / 25 as integers is " + result1);
        // Change to dividing doubles
        double var7changed = 25;
        double var8changed = 42;
        double result1changed = var8changed / var7changed;
        System.out.println("Dividing 42 / 25 as doubles is " + result1changed);

        // Write a program that declares two double variables, assigns a number to each,
        // and divides the larger by the smaller number. Assign the result to a variable. Print out the result.
        // Now, cast the result to an integer. Print out the result again.
        double var9 = 42.42;
        double var10 = 22.22;
        double result2 = var9 / var10;
        System.out.println(result2);
        int result3 = (int)result2;
        System.out.println(result3);

        // Write a program that declares two integer variables, x and y, and
        // assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again.
        int x = 5;
        int y = 6;
        double q = y/x;
        System.out.println(q);
        q = (double)y;
        System.out.println(q);

        // Write a program that declares a named constant and uses it in a calculation. Print the result.
        final int HOURS_PER_DAY = 24;
        final int MINUTES_PER_HOUR = 60;
        int minutes_per_day = HOURS_PER_DAY * MINUTES_PER_HOUR;
        System.out.println("minutes_per_day = " + minutes_per_day);

        // Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale and
        // complete an “order” for three items of the first product, four items of the second product, and
        // two items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.
        final double APPLE = 1.25;
        final double BANANA = 0.50;
        final double COFFEE = 3.00;
        final double SALES_TAX = 0.8;

        double subtotal = APPLE + BANANA + COFFEE;
        double total = subtotal * (1+ SALES_TAX);
        String formattedPrice = String.format("%.2f", total);
        System.out.println("Total price is: $" + formattedPrice);

    }
}