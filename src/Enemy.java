public class Enemy {
    private String type;
    private int health;
    private int damage;
    private String[] types = {"Dragon", "Demon", "Orge", "Goblin"};

    public Enemy(int selec) {
        type = types[selec];
        if (selec==1){
            health = 250;
            damage = 50;
        } else if (selec==2) {
            health = 125;
            damage = 35;
        } else if (selec==3) {
            health = 150;
            damage = 20;
        } else if (selec==4){
            health=100;
            damage = 15;
        }
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return health<=0;
    }

    public void attack(Player player) {
        int playerHealth = player.getHealth();
        player.setHealth(playerHealth - damage);

    }
}
