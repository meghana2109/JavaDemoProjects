//WAP to find multiples of six within range 1 to 100
public class MultiplesOfSix {

    public static void main(String[] args) {
        //parsing integers btw 1 to 100 to find multiples of six
        for(int i=1;i<100;i++){
            //checking if i is divisible by 6
            if(i%6 == 0){
                //if yes then print i
                System.out.println(i);
           }
        }
    }
}
