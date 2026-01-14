public class Player {
    private final String name;
    private int health = 100;
    private int energy = 100;
    private int damage = 15;
    private int money = 0;
    public Player(String name) {
        this.name=name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void heal() {
        health+=30;
    }

    public void energize() {
        energy+=15;
    }

    public void rest() {
        health+=15;
        energy+=15;
    }

    public void setHealth(int health) {
        this.health=health;
    }

    public void addMoney(int money) {
        this.money+=money;
    }

    public void attack(Enemy enemy) {
        if (energy>15) {
            int enemyHealth = enemy.getHealth();
            enemy.setHealth(enemyHealth - damage);
        }
    }
}
