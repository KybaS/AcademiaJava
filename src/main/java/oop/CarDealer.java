package oop;

public class CarDealer {
    public static void main(String[] args) {
        //to be continued ...
        Car car = new Car();
        car.setManufacturer("123456789 123456789 123456789 (this text should not printed)");
        car.setYearOfProduction(2020);

        System.out.println(car.getManufacturer() + " " + car.getYearOfProduction());

    }
}
