//WAP to find sum of ten numbers
//Take an array of integers of length 10
//add them over one by one

import java.util.Arrays;

public class SumOfTen {

    public static void main(String[] args) {
        //declaring and defining array of integers
        int[] array = { 10,20,30,40,50,60,70,80,90,100};
        //declaring and defining sum as 0 at the beginning
        int sum = 0;
        //parse through array and add each element to sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //printing array
        System.out.println(Arrays.toString(array));
        //printing sum
        System.out.println("Sum of ten numbers is "+ sum);
    }
}
