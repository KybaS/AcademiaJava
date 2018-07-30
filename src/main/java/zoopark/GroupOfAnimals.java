package zoopark;

 class GroupOfAnimals {

    private Animal[] group;

     GroupOfAnimals(int sum) {
        group = new Animal[sum];
    }

     void add(Animal animals) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = animals;
                System.out.println("Animal " + animals.getClass().getName() + " " + animals.getName() + " was added to the group. It has id: " + (i + 1));
                break;
            }
        }
    }
}
