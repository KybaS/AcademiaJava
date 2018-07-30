package zoopark;

public class ZooArray {
    public static void main(String[] args) {

        GroupOfAnimals wolfs = new GroupOfAnimals(3);
        wolfs.add(new Wolf("WolfRed"));
        wolfs.add(new Wolf("WolfGrey"));
        wolfs.add(new Wolf("WolfBlack"));

        GroupOfAnimals foxes = new GroupOfAnimals(2);
        foxes.add(new Fox("FoxRed"));
    }
}
