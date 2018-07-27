package composition;

public class MassIndex {
    private int height;
    private int weight;
    private int age;

    MassIndex(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public String toString() {
        return String.format("Height: %s%nWeight: %s%nAge: %s%n", height, weight, age);
    }

    void indexOfMass(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        String goodBody = "You have a good body form";
        if (height >= 150 && height <= 160 && weight >= 50 && weight <= 60 && age >= 18 && age <= 55) {
            System.out.println(goodBody);
        } else if (height >= 161 && height <= 170 && weight >= 61 && weight <= 70 && age >= 18 && age <= 55) {
            System.out.println(goodBody);
        } else if (height >= 171 && height <= 180 && weight >= 71 && weight <= 80 && age >= 18 && age <= 55) {
            System.out.println(goodBody);
        } else if (height >= 181 && weight >= 100) {
            System.out.println("You are very tall and heavy");
        } else if (height >= 181 && weight <= 81) {
            System.out.println("You are very tall and thin");
        } else if (height <= 149 && weight >= 55) {
            System.out.println("You are very low and heavy");
        } else if (height <= 149 && weight <= 40) {
            System.out.println("You are very low and thin");
        } else {
            System.out.println("You have a strange body form");
        }
    }
}
