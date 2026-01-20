public class Enemy {

    private String type;
    private int health;
    private int damage;
    private int reward;

    public Enemy(int choice) {

        if (choice == 1) {
            type = "Amphithere";
            health = 80;
            damage = 10;
            reward = 15;
        } else if (choice == 2) {
            type = "Panther";
            health = 100;
            damage = 15;
            reward = 25;
        } else if (choice == 3) {
            type = "Serpent";
            health = 120;
            damage = 20;
            reward = 35;
        } else {
            type = "Basilisk";
            health = 150;
            damage = 25;
            reward = 60;
        }
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getReward() {
        return reward;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void attack(Player player) {
        player.setHealth(player.getHealth() - damage);
        System.out.println(type + " attacks you for " + damage + " damage.");
    }
}
