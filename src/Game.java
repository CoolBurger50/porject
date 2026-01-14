import java.util.Scanner;

public class Game {
    private String name;
    private int totalBasilisk = 1;
    private int totalSerpent = 3;
    private int totalPanther = 6;
    private int totalAmphithere = 8;
    private int round = 0;
    private boolean tutorial = true;
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
        while (isWin()==false || quit==false) {
            return;
        }
    }

    public void playRound() {
        System.out.println("You enter the forest and see: ");
        System.out.println("You have encountered a "  );
    }


    public void checkRadar() {
        System.out.println("Total Amphithere: " + totalAmphithere);
        System.out.println("Total Panther: " + totalPanther);
        System.out.println("Total Serpent: " + totalSerpent);
        System.out.println("Total Basilisk: " + totalBasilisk);
    }

    public void encouter() {
        System.out.println("");
    }

    public boolean isWin() {
        return totalBasilisk==0;
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
