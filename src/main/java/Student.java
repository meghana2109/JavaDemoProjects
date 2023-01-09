public class Student {
    String name;
    int age;
    String sex;

    public void setDetails(String sname,int sage, String ssex){
        name = sname;
        age=sage;
        sex= ssex;
    }

    public String getType(Student s){
        if(s.age > 65){
            return "Senior";
        }
        else if(s.age >20 && s.age < 65){
            return "Regular";
        }
        else{
            return "Junior";
        }
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.setDetails("Meghana",29,"female");
        String student_type = s1.getType(s1);
        System.out.println("Student "+s1.name+" is "+student_type);

    }
}
