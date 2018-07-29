package abstract_restaurant;

class Client {

    private String name;

    Client(String name) {
        this.name = name;
    }

    void eat(Dish dish, Dish grass) {
        System.out.println("Client " + name + " eaten a (" + dish.getClass().getName() + ") dish with (" + grass.getClass().getName()+")");
    }

}
