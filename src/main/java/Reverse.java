//WAP to reverse an array
//WAP to reverse a string
//WAP to reverse a number
/* Array reversal
take an array { 2,3,4,5,6}
*pick the last element and place it in the beginning of new array
* and repeat till I reach first element*/

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        //declaring and defining a string name
        String name = "Megna";
        //declaring and defining an integer
        int number = 359501;
        //declaring and defining an integer array
        int[] array = {2, 3, 4, 5, 6};

        //calling method to reverse a string
        reverseString(name);
        //calling a method to reverse a number
        reverseNumber(number);
        //calling a method to reverse an array
        reverseArray(array);
        //calling an alternative method to reverse string
        stringReverse(name);

    }

    /**
     * this method reverses the given string and prints it
     * @param name - string to be reversed
     */

    private static void reverseString(String name) {
        //declaring an empty String for reverseName
        String reverseName = "";
        //declaring a char
        char ch;

        //parsing the string character by character
        for (int i = 0; i < name.length(); i++) {
            //reading character at i position
            ch = name.charAt(i);
            //appending the character to reverseName
            reverseName = ch + reverseName;
        }
        //printing reversed string
        System.out.println("Reversed String is : " + reverseName);
    }

    /**
     * this method reverses a given number
     * @param numberToBeReversed - number to be reversed
     */
    private static void reverseNumber(int numberToBeReversed) {
        //declaring and defining reverse number
        int reverseNumber = 0;
        //decalring an integer for remainder
        int remainder;
        //parsing through the whole number character by character ad running the loop till number becomes 0.
        while (numberToBeReversed != 0) {
            //assiging remainder when the given number is divided by 10
            remainder = numberToBeReversed % 10;
            //assiging the value reverseNumber multiplied by 10 plus the remainder
            reverseNumber = reverseNumber * 10 + remainder;
            //dividing the number to move to next digit
            numberToBeReversed = numberToBeReversed / 10;
        }
        //printing the reversed number
        System.out.println("Reversed Number is: " + reverseNumber);


    }

    /**
     * this method reverses the given array and prints it
     * @param arrayToBeReversed - array to be reversed
     */

    private static void reverseArray(int[] arrayToBeReversed) {
        //declaring a new array of same length as array to be reversed
        int[] reverseArr = new int[arrayToBeReversed.length];

        //printing old array
        System.out.println("Array : " + Arrays.toString(arrayToBeReversed));
        //intializing an integer i to 0 to keep track of new array
        int i = 0;
        //parsing through old array
        for (int j = arrayToBeReversed.length - 1; j >= 0; j--) {
            //assiging last element of old array to first element of new array
            reverseArr[i] = arrayToBeReversed[j];
            //incrementing counter of new array
            i++;
        }
        //printing reversed array
        System.out.println("Reversed Array : " + Arrays.toString(reverseArr));

    }

    /**
     * this method uses string builder to reverse a given string
     * @param stringToBeReversed- string to be reversed
     */

    private static void stringReverse(String stringToBeReversed){
        //instantiating a string builder object
        StringBuilder input = new StringBuilder();
        //appending the string to string builder object
        input.append(stringToBeReversed);
        // reversing the string in string builder object
        input.reverse();
        //printing the reversed string
        System.out.println("reversed String is "+input);
    }


}
