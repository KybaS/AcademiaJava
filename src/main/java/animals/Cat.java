package animals;

public class Cat extends Animal {

    @Override
    public void sayHello() {
        System.out.println("Cat say meow");
    }

    public void tail() {
        System.out.println("Tail is present in cats");
    }
}
