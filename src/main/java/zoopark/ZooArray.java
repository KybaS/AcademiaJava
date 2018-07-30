package zoopark;

public class ZooArray {
    public static void main(String[] args) {

        GroupOfAnimals wolfs = new GroupOfAnimals(3);
        wolfs.add(new Wolf("WolfRed", Gender.MALE));
        wolfs.add(new Wolf("WolfGrey", Gender.MALE));
        wolfs.add(new Wolf("WolfBlack", Gender.MALE));

        GroupOfAnimals foxes = new GroupOfAnimals(2);
        foxes.add(new Fox("FoxRed", Gender.FEMALE));
    }
}
