package kata.fighters;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    Fighter(String name, int health, int damagePerAttack) {
        this.name = setName(name);
        this.health = setHealth(health);
        this.damagePerAttack = setDamagePerAttack(damagePerAttack);
    }


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1, b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
        }
    }


    int getHealth() {
        return health;
    }

    int setHealth(int health) {
        if (health >= 1) {
            return this.health = health;
        } else {
            return this.health = 1;
        }
    }

    int getDamagePerAttack() {
        return damagePerAttack;
    }

    int setDamagePerAttack(int damagePerAttack) {
        if (damagePerAttack >= 1) {
            return this.damagePerAttack = damagePerAttack;
        } else {
            return this.damagePerAttack = 1;
        }
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

}
