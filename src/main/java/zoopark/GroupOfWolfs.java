package zoopark;

public class GroupOfWolfs {

    private Wolf[] group;

    public GroupOfWolfs(int sum) {
        group = new Wolf[sum];
    }

    public void add(Wolf wolf) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = wolf;
                System.out.println("Wolf " + wolf.getName() + " was added to the group. It has id: " + (i + 1));
                break;
            }
        }
    }
}
