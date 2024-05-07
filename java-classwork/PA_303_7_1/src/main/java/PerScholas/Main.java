package PerScholas;

import java.util.Arrays;
import java.util.Scanner;


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
        String stringArrayToString = Arrays.toString(stringArray);
        String cloneArrayToString = Arrays.toString(clone);
        System.out.println("String array toString: " + stringArrayToString);
        System.out.println("Clone array toString: " + cloneArrayToString);

        if (stringArrayToString.equals(cloneArrayToString)) {
            System.out.println("The string are matching!");
        } else {
            System.out.println("The strings are not matching!");
        }

        // Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
        // The numbers can be any integers.  Print out the value at the first index and the last index
        // using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length]).
        // Notice the type of exception which is produced. Now try to assign a value to the array index 5.
        // You should get the same type of exception.
        System.out.println();
        int[] elements = {1, 2, 3, 4, 5};
        System.out.println("First index: " + elements[0] + " Last index: " + elements[4]);
        // Intentional errors:
            // System.out.println(elements[elements.length]);
            // elements[5] = 6;

        // Task 5: Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable (e.g., i)
        // to the corresponding index in the array.
        int[] loopArray = new int[5];
        for (int i = 0; i < loopArray.length; i++) {
            loopArray[i] = i;
        }
        System.out.println("Loop array: " + Arrays.toString(loopArray));

        // Task 6: Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control variable
        // multiplied by 2 to the corresponding index in the array.
        int[] loopArray2 = new int[5];
        for (int i = 0; i < loopArray2.length; i++) {
            loopArray2[i] = i * 2;
        }
        System.out.println("Loop array 2: " + Arrays.toString(loopArray));

        // Task 7: Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element, except for the middle (index 2) element.
        int[] loopArray3 = new int[5];
        System.out.print("Loop array 3, skipping element 2: ");
        for (int i = 0; i < loopArray3.length; i++) {
            loopArray3[i] = (i +1) * 2;
            if (i != 2) {
                System.out.print(loopArray3[i] + ", ");
            }
        }

        // Task 8: Write a program that creates a String array of 5 elements and swaps the first element
        // with the middle element without creating a new array.
        System.out.println();
        System.out.println();
        int[] swapArray = {1, 2, 3, 4, 5};
        System.out.println("Swap array before swap: " + Arrays.toString(swapArray));
        int temp = swapArray[2];
        swapArray[2] = swapArray[0];
        swapArray[0] = temp;
        System.out.println("Swap array after swap: " + Arrays.toString(swapArray));

        // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        // Print the array in ascending order, and print the smallest and the largest element of the array.
        // The output will look like the following:
        // Array in ascending order: 0, 1, 2, 4, 9, 13
        // The smallest number is 0
        // The biggest number is 13
        int[] sortArray = {4, 2, 9, 13, 1, 0};
        System.out.println();
        System.out.println("Sort array before sort: " + Arrays.toString(sortArray));
        Arrays.sort(sortArray);
        System.out.println("Array in ascending order: " + Arrays.toString(sortArray));
        System.out.println("The smallest number is: " + sortArray[0]);
        System.out.println("The biggest number is: " + sortArray[sortArray.length - 1]);

        // Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
        Object[] mixedArray = new Object[5];
        mixedArray[0] = 5;
        mixedArray[1] = "Hello";
        mixedArray[2] = "World";
        mixedArray[3] = "Sup";
        mixedArray[4] = 7.25;
        System.out.println();
        System.out.println("Mixed array: " + Arrays.toString(mixedArray));

        // Task 11: Write some Java code that asks the user how many favorite things they
        // have. Based on their answer, you should create a String array of the correct size.
        // Then ask the user to enter the things and store them in the array you created. Finally,
        // print out the contents of the array.
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you want to store?");
        System.out.print("Pick an integer between 1 and 10: ");
        int favoritesCount = 0;
        while (favoritesCount < 1 || favoritesCount > 10) {
            favoritesCount = scan.nextInt();
            System.out.println();
        }
        String[] favoritesList = new String[favoritesCount];
        for (int i = 0; i < favoritesCount; i++) {
            System.out.print("Enter favorite thing: ");
            favoritesList[i] = scan.next();
        }
        System.out.println();
        System.out.println("Your favorite things are: " + Arrays.toString(favoritesList));
    }
}