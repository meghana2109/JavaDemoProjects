import java.lang.reflect.Array;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] array = { 29,10,67,28,10,48,100,47,55,32};
        int avg = average(array);
        int max = maximum(array);
        int min = minimum(array);
//        int num = 100;
        System.out.println(Arrays.toString(array));

//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("Array is "+array);
//        System.out.println(num);
        System.out.println("Average of array is : "+avg);
        System.out.println("Maximum of array is : "+max);
        System.out.println("Minimum of array is : "+min);

    }

    public static int average(int[] numbers){
       int sum =0;
       for(int i=0;i<numbers.length;i++){
        sum = sum + numbers[i];
        }
       int avg = sum/10;
       return avg;
    }

    public static int maximum(int[] numbers){
        int max = 0;
        for(int i=0;i<10;i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }
//    public static int minimum(int[] numbers){
//        int min = 200;
//        for(int i=0;i<10;i++){
//            if(min > numbers[i]){
//                min = numbers[i];
//            }
//        }
//        return min;
//    }

    public static int minimum(int[] numbers){
        int min = numbers[0];
        for(int i=0;i<10;i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
}
