
import java.util.Scanner;



public class HelloWorld {

    String name;
    int age;

    public static void main(String[] args){
//

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setDetails("Meghana",24,"Female");
        s2.setDetails("Tanmayee",45,"Female");
        s3.setDetails("Pawan",70,"Male");

        Student[] list  = {s1,s2,s3};

        for (int i = 0; i < list.length ; i++) {
            if(list[i].age > 65){
                System.out.println("Student "+list[i].name+" is a Senior");
            }else if(list[i].age <65 && list[i].age > 25){
                System.out.println("Student "+list[i].name+" is a Regular");
            }
            else {
                System.out.println("Student "+list[i].name+" is a Junior");
            }
        }
    }

    public static void printDetails(String name, int age){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }


}
