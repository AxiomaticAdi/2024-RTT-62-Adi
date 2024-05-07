package PerScholas;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static int getMiddleIndex(int[] array) {
        return (array.length / 2);
    }

    public static void main(String[] args) {
        // Task 1: Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] intArray = {1, 2, 3};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Task 2: Write a program that returns the middle element in an array. Give the following
        // values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int[] secondArray = {13, 5, 7, 68, 2};
        int resultIndex = getMiddleIndex(secondArray);
        System.out.println(secondArray[resultIndex]);

        // Task 3: Write a program that creates an array of String type and initializes it with the
        // strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
        // using the clone( ) method. Use the Arrays.toString( ) method on the new array to
        // verify that the original array was copied.
        System.out.println();
        String[] stringArray = {"red", "green", "blue", "yellow"};
        System.out.println("String array length: " + stringArray.length);
        String[] clone = stringArray.clone();
        System.out.println("Clone array length: " + clone.length);

        System.out.println();
        String stringArrayToString = stringArray.toString();
        String cloneArrayToString = stringArrayToString.toString();
        System.out.println("String array toString: " + stringArrayToString);
        System.out.println("Clone array toString: " + cloneArrayToString);

        if (stringArray.toString().equals(clone.toString())) {
            System.out.println("The string are matching!");
        } else {
            System.out.println("The strings are not matching!");
        }




    }
}