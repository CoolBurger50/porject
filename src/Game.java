import java.util.Scanner;

public class Game {
    private String name;
    private int totalBasilisk = 1;
    private int totalSerpent = 3;
    private int totalPanther = 6;
    private int totalAmphithere = 8;
    private boolean tutorial = true;
    private boolean fight = true;
    private boolean condition = true;
    private boolean potion = true;
    private boolean village = true;


    private boolean quit = true;
    private Scanner scanner;


    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to the Ashenshire Village");
        System.out.print("What is your name? : ");
        name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("--------------------------------------------");
        System.out.println("Hello," + name + " there is a shop here in the town that allows you to buy potions");
        System.out.println("Ever since the Basilisk arrived the creatures became really aggressive");
        System.out.println("If you defeat the basilisk the other monster may become passive again");
        checkHero();
        System.out.println("--------------------------------------------");
        while (totalBasilisk!=0 || quit==false) {
            playRound();
        }
        System.out.println("You did it and saved the Ashenshire Village");
        System.out.println("Thanks, " + name);
        System.out.println("This will be the end of this story and may you have a time.");
    }

    public void playRound() {
        Scanner scanner = new Scanner(System.in);
        if (tutorial) {
            doTutorial();
        }
        System.out.println("What would you want to do?");
        System.out.println("1. Attack monster");
        System.out.println("2. Check condition");
        System.out.println("3. Use potions");
        System.out.println("4. Return to village");
        System.out.println("5. Run away and leave");
        System.out.println("Enter option: ");
        int option = scanner.nextInt();
        System.out.println("--------------------------------------------");
        if (option==1) {

        } else if (option==2) {

        } else if (option==3) {

        } else if (option==4) {

        } else if (option==5) {

        } else {
            System.out.print("Bad input would you like the tutorial again? (y/n)");
            String response = scanner.nextLine();
            if (response.equals("y")) {
                doTutorial();
                quit=false;
            } else if (response.equals("n")){
                System.out.println("OK! Dont make the same mistake");
            } else {
                System.out.println("Input \"y\" or \"n\"");
            }
        }
        System.out.println("--------------------------------------------");
    }


    public void checkRadar() {
        System.out.println("Total Amphithere: " + totalAmphithere);
        System.out.println("Total Panther: " + totalPanther);
        System.out.println("Total Serpent: " + totalSerpent);
        System.out.println("Total Basilisk: " + totalBasilisk);
    }

    public void encouter() {
        System.out.println("Here is the amount of monsters left in the forest");
        checkRadar();
        System.out.println("--------------------------------------------");
        System.out.println("1. Amphithere");
        System.out.println("2. Panther");
        System.out.println("3. Serpent");
        System.out.println("4. Basilisk");
        System.out.print("Which monster do you want to fight: ");
        int option = scanner.nextInt();
        System.out.println("--------------------------------------------");
        if (option==1) {

        } else if (option==2) {

        } else if (option==3) {

        } else if (option==4) {

        } else if (option==5) {

        } else {
        }
    }

    public void doTutorial() {
        System.out.println("Option 1: Attack a monster nearby");
        System.out.println("Option 2: See you health and energy levels");
        System.out.println("Option 3: Use potions you got in the village");
        System.out.println("Option 4: You return to village to buy potions or rest");
        System.out.println("Option 5: You run away like a coward");
        System.out.println();
        System.out.print("Press any key to continue ");
        scanner.nextLine();
        System.out.println("--------------------------------------------");
    }

    public void checkHero() {
        Scanner scanner = new Scanner(System.in);
        while (quit==true) {
            if (tutorial) {
                System.out.print("So are you down to help this town? (y/n): ");
            } else {
                System.out.print("Are you sure you want to quit? (y/n): ");
            }
            String response = scanner.nextLine();
            if (response.equals("y")) {
                System.out.println("Thank you so much hero ...");
                quit=false;
            } else if (response.equals("n")){
                System.out.println("Are you sure, we need a hero ...");
            } else {
                System.out.println("Input \"y\" or \"n\"");
            }
        }
    }
}
