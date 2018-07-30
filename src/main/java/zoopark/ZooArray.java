package zoopark;

public class ZooArray {
    public static void main(String[] args) {

        GroupOfWolfs groupOfWolfs = new GroupOfWolfs(3);

        groupOfWolfs.add(new Wolf("WolfRed"));
        groupOfWolfs.add(new Wolf("WolfGrey"));
        groupOfWolfs.add(new Wolf("WolfBlack"));
    }
}
