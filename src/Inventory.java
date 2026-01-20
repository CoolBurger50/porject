public class Inventory {

    private int healingPotions;
    private int energyPotions;

    public Inventory() {
        healingPotions = 1;
        energyPotions = 1;
    }

    public int getHealingPotions() {
        return healingPotions;
    }

    public int getEnergyPotions() {
        return energyPotions;
    }

    public void buyHealingPotion() {
        healingPotions++;
        System.out.println("You bought a healing potion.");
    }

    public void buyEnergyPotion() {
        energyPotions++;
        System.out.println("You bought an energy potion.");
    }

    public void useHealingPotion(Player player) {
        if (healingPotions > 0) {
            player.heal();
            healingPotions--;
            System.out.println("You used a healing potion.");
        } else {
            System.out.println("You have no healing potions.");
        }
    }

    public void useEnergyPotion(Player player) {
        if (energyPotions > 0) {
            player.energize();
            energyPotions--;
            System.out.println("You used an energy potion.");
        } else {
            System.out.println("You have no energy potions.");
        }
    }
}
