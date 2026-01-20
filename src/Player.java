public class Player {

    private String name;
    private int health;
    private int energy;
    private int damage;
    private int money;

    public Player(String name) {
        this.name = name;
        health = 100;
        energy = 100;
        damage = 15;
        money = 50;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMoney() {
        return money;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        if (this.energy < 0) {
            this.energy = 0;
        }
    }

    public void addMoney(int amount) {
        money = money + amount;
    }

    public void heal() {
        health = health + 30;
        if (health > 100) {
            health = 100;
        }
    }

    public void energize() {
        energy = energy + 30;
        if (energy > 100) {
            energy = 100;
        }
    }

    public void rest() {
        health = 100;
        energy = 100;
    }

    public void attack(Enemy enemy) {
        if (energy >= 10) {
            enemy.setHealth(enemy.getHealth() - damage);
            energy = energy - 10;
            System.out.println("You attack and deal " + damage + " damage.");
        } else {
            System.out.println("You are too tired to attack.");
        }
    }
}
