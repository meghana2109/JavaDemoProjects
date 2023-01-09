import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        String myName = "Meghana";
        int myAge = 29;
        printDetails(myName,myAge);
        myName = getName();
        System.out.println("My name is "+myName);
        myAge = getAge();
        System.out.println("my Age is "+myAge);

        Student s = new Student();
        s.setDetails("Tanu",25,"Female");
        String type = s.getType(s);
        System.out.println("Student "+s.name+" is "+type);

        for (int i = 0; i < 5; i++) {
            System.out.println("Line number "+i+" is printing...");

        }
    }

public static String getName(){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    return name;
}
    public static int getAge() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }

    public static void printDetails(String name, int age){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
