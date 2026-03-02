public class Vehicle {
    protected String brand = "Ford";
    protected int year = 2026;

    public void sound() {
        System.out.println("Brummm Brummm");
    }

    public static void main(String[] args) {
        Car myObj = new Car();

        myObj.sound();
        System.out.println(myObj.brand + " " + myObj.year + " " + myObj.name);
    }
}

class Car extends Vehicle {
    String name = "BMW";
}