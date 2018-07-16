package oop;

public class Car {

    private String manufacturer;
    private String model;
    private String color;
    private int yearOfProduction;
    private int volumeOfTank;
    private int fuelConsumptionPer100km;
    private int weight;
    private double price;
    private boolean foldingRoof;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer.length() > 30) {
            this.manufacturer = manufacturer.substring(0, 30);
        } else {
            this.manufacturer = manufacturer;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        if (yearOfProduction > getCurrentYear()){
            this.yearOfProduction = getCurrentYear();
        }else {
            this.yearOfProduction = yearOfProduction;
        }
    }

    public int getVolumeOfTank() {
        return volumeOfTank;
    }

    public void setVolumeOfTank(int volumeOfTank) {
        this.volumeOfTank = volumeOfTank;
    }

    public int getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public void setFuelConsumptionPer100km(int fuelConsumptionPer100km) {
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFoldingRoof() {
        return foldingRoof;
    }

    public void setFoldingRoof(boolean foldingRoof) {
        this.foldingRoof = foldingRoof;
    }

    private static int getCurrentYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
}
