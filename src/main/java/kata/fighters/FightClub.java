package kata.fighters;

public class FightClub {
    public static void main(String[] args) {
        Fighter john = new Fighter("John", 7, 13);
        Fighter max = new Fighter("Max", 23, 2);

        System.out.println(Fighter.declareWinner(john, max, "John"));

    }
}
