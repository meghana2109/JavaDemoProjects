//WAP to find prime numbers between 1 to 100

public class PrimeNumber {

        public static void main(String[] args)
        {
            //declaring integers i and j for parsing through 1 to 100 and check for checking if its prime
            int i, j, check;
            //printing statement "prime numbers from 1 to 100
            System.out.println("---Prime Numbers from 1 to 100---");
            //parsing the numbers from 2 to 100 (not from 0 as 0and 1 are not prime)
            for(i=2; i<=100; i++)
            {
                //initialize check to 0
                check = 0;
                //parse from 2 till i
                for(j=2; j<i; j++)
                {
                    //check if i is divisible by j
                    if(i%j==0)
                    {
                        //if yes then increment counter check
                        check++;
                        //break from this loop after incrementing to move onto next integer
                        break;
                    }
                }
                //if check is 0 then it means that number is not divisible by any number other than self and 1. so printing only prime numbers.
                if(check==0)
                    System.out.print(i + " ");
            }
        }
}
