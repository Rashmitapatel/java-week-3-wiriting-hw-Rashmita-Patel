package homework;

import java.util.Arrays;

/**
        * Write a Java program to sort a numeric array and a string array.
        */

public class Progrrame_17_SortArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray = {1789,2035,1899,2040,1950,2255,7897,1455,787};
        // string Array Declaration
        String[] strarray = { "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
                System.out.println("Actual Numerical array was:" + Arrays.toString(numArray));
        //Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is :"+Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String array was:"+ Arrays.toString(strarray));
 // sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted string array is :"+ Arrays.toString(strarray));

    }

}

