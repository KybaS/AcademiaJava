package survey;

class DataSurvey {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Anna")) {
            this.name = "Anna is the most beautiful name in the world";
        } else if (name.equals("Serhii") | name.equals("Sergiy") | name.equals("Sergey")) {
            this.name = "You are just Serg";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
