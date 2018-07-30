package zoopark;

 class Animal {

    private String name;
    Gender gender;

     Animal(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

     String getName(){
        return this.name;
    }
}
