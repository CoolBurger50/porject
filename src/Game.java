import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    private Player player;
    private Inventory inventory = new Inventory();
    private boolean running = true;

    public void play() {

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        player = new Player(name);

        System.out.println("Welcome to Ashenshire Village, " + name + "!");

        while (running) {
            showMenu();
        }

        System.out.println("Thanks for playing!");
    }

    public void showMenu() {

        System.out.println("\nWhat would you want to do?");
        System.out.println("1. Attack monster");
        System.out.println("2. Check condition");
        System.out.println("3. Use potions");
        System.out.println("4. Return to village");
        System.out.println("5. Run away and leave");
        System.out.print("Enter option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            fight();
        } else if (choice == 2) {
            checkCondition();
        } else if (choice == 3) {
            usePotions();
        } else if (choice == 4) {
            village();
        } else if (choice == 5) {
            running = false;
        } else {
            System.out.println("Invalid option.");
        }
    }

    public void fight() {

        System.out.println("Choose monster:");
        System.out.println("1. Amphithere");
        System.out.println("2. Panther");
        System.out.println("3. Serpent");
        System.out.println("4. Basilisk");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Enemy enemy = new Enemy(choice);
        System.out.println("You encountered a " + enemy.getType());
        System.out.println("Press Enter to start the fight...");
        scanner.nextLine();

        while (!enemy.isDead() && player.getHealth() > 0) {

            player.attack(enemy);
            scanner.nextLine();

            if (!enemy.isDead()) {
                enemy.attack(player);
            }

            System.out.println("Your health: " + player.getHealth());
            System.out.println(enemy.getType() + " health: " + enemy.getHealth());
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }

        if (player.getHealth() <= 0) {
            System.out.println("You died...");
            running = false;
        } else {
            System.out.println("You defeated the " + enemy.getType());
            player.addMoney(enemy.getReward());
        }
    }

    public void checkCondition() {
        System.out.println("Health: " + player.getHealth());
        System.out.println("Energy: " + player.getEnergy());
        System.out.println("Money: " + player.getMoney());
        System.out.println("Healing potions: " + inventory.getHealingPotions());
        System.out.println("Energy potions: " + inventory.getEnergyPotions());
    }

    public void usePotions() {

        System.out.println("1. Healing potion");
        System.out.println("2. Energy potion");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            inventory.useHealingPotion(player);
        } else if (choice == 2) {
            inventory.useEnergyPotion(player);
        }
    }

    public void village() {

        System.out.println("\nYou returned to the village.");
        System.out.println("1. Rest");
        System.out.println("2. Buy healing potion (10 gold)");
        System.out.println("3. Buy energy potion (10 gold)");
        System.out.println("4. Leave village");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            player.rest();
            System.out.println("You rested and feel refreshed.");
        } else if (choice == 2) {
            if (player.getMoney() >= 10) {
                player.addMoney(-10);
                inventory.buyHealingPotion();
            } else {
                System.out.println("Not enough gold.");
            }
        } else if (choice == 3) {
            if (player.getMoney() >= 10) {
                player.addMoney(-10);
                inventory.buyEnergyPotion();
            } else {
                System.out.println("Not enough gold.");
            }
        }
    }
}
