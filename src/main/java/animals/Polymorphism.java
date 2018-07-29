package animals;

public class Polymorphism {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Octopus();

        for (Animal animal: animals){
            animal.sayHello();
        }

        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal octopus = new Octopus();

        isPresentTail(animal);
        isPresentTail(cat);
        isPresentTail(octopus);
    }
    private static void isPresentTail(Animal animals){
        System.out.println("Displays animal: ");
        animals.tail();
    }
}
