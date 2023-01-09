//WAP to insert an element into array

import java.util.Arrays;


public class InsertElement {
    public static void main(String[] args) {
        //creating an integer array
        int[] array = {1,2,3,4,5};
        //printing the array
        System.out.println("Initial Array : "+ Arrays.toString(array));
        //declaring new element to be inserted
        int newValue = 6;
        //creating a new array with 1 extra space to add new element
        int[] newArray = new int[array.length+1];
        //parsing the array and copying it to new array through iterations
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        //assigning new element to end of new array
        newArray[array.length] = newValue;
        //printing new array with inserted element
        System.out.println("Array after adding new Element in the end : "+ Arrays.toString(newArray));
        //calling a method to insert new element at given position
        addElementInIndex(array,2,7);
    }

    /**
     * This method adds an element to given array at given position
     * @param arr - Array of integers
     * @param index - index at which new element needs to be inserted
     * @param value - value of new element which needs to be inserted
     */

    private static void addElementInIndex(int[] arr, int index, int value) {
        //declaring new array with one extra space to insert new element
        int[] newArray = new int[arr.length+1];
        //counter declared and defined as 0 for parsing new array
        int j =0;
        //parsing the array and copying the existing elements
        for (int i = 0; i < newArray.length ; i++) {
            //checking if i is same as index where new element needs to be inserted
            if(i == index){
                //if yes the insert new element value at i
                newArray[i] = value;
            }else {
                //else just copy the existing element from old array
                newArray[i] = arr[j];
                //and increase the counter as we need to move to next element
                j++;
            }
        }
        //printing new array after inserting
        System.out.println("New Array : "+Arrays.toString(newArray));

    }
}
