
public class Project1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setManufacturerName("TATA");
        c1.setModelName("Tiago");
        c1.setYearOfManufacturing(2022);

        System.out.println("Car Model name : "+c1.getModelName());
        System.out.println("Car Manufacturer name : "+c1.getManufacturerName());
        System.out.println("Car Manufacturing year : "+c1.getYearOfManufacturing());
    }
}
