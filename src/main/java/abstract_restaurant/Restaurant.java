package abstract_restaurant;

public class Restaurant {
    public static void main(String[] args) {

        Client client = new Client("John");
        Dish chicken = new Chicken(MethodOfCooking.BOILED);
        Dish grass = new Salad(Grass.PARSLEY);
        client.eat(chicken, grass);
    }
}
