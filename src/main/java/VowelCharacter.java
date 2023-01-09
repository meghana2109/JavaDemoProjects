// WAP to find if a character is vowel or not

import java.util.Scanner;

public class VowelCharacter {
    public static void main(String[] args) {
        //instantiating scanner object
        Scanner sc = new Scanner(System.in);
        //getting user input character
        System.out.println("Enter a Character to check vowel or not : ");
        //getting the first character only
        char ch = sc.next().charAt(0);
        //changing the entered character to lower case
        char c = Character.toLowerCase(ch);

        //checking if character enetered is equal to a,e,i,o,u
        if(c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u'){
            //if yes then print as Vowel
            System.out.println("Entered Character "+ch+" is Vowel");
        }
        else{
            //if not then print as Consonant or not vowel
            System.out.println("Entered Character "+ch+" is not Vowel");
        }
    }
}
