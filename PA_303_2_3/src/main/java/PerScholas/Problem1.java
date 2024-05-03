package PerScholas;

public class Problem1 {
    public static void main(String[] args) {
        //Write a program that declares an integer a variable x, assigns the value 2 to it, and
        //prints out the binary string version of the number ( Integer.toBinaryString(x) ).
       int x = 2;
       System.out.println(Integer.toBinaryString(x));

        //Now use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing
        //the results, write a comment with the predicted decimal value and binary string. Now,
        //print out x in decimal form and in binary notation.
        x = x << 1;
        // Predicted decimal value after left shifting by 1: 4 (2 << 1 = 4)
        // Predicted binary string after left shifting by 1: "100"

        // Print out x in decimal form and in binary notation
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
    }

    }

