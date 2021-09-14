//package W01.191220107;

public class Creature extends Being {
    int health;
    int attack;
    int defence;

    public boolean isDead() {
        if (health <= 0) {
            System.out.println(name + " is DEAD.");
            return true;
        } else
            return false;
    }

    public void getHurt(int damage) {
        health -= damage - defence;
        System.out.println(name + " get hurt by " + (damage - defence) + " point.");
        System.out.println("Now the HP of " + name + " is " + health);
    }

    public void attack(Creature target) {
        System.out.println(name + " attack " + target + " by " + attack + " points.");
        target.getHurt(attack);
    }

    public void cleanObstruction(Item target, boolean op) {
        System.out.println(name + (op ? " do " : " undo ") + target.operation + " on item " + target);
    }

    public void speakTo(String words, Creature target) {
        System.out.println(name + " says to " + target + ": " + words);
    }

    public void speak(String words, Creature target) {
        System.out.println(name + " says " + target + ": " + words);
    }

    public void move() {
        System.out.println(name + " moved.");
    }
}
