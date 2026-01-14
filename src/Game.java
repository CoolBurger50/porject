import java.util.Scanner;

public class Game {
    private String name;
    private int totalGoblins = 8;
    private int totalOrges = 6;
    private int totalDemons = 3;
    private int totalDragons = 1;
    private int round = 0;
    private Scanner scan;


    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to the Ashenshire Village");
        System.out.print("What is your name?: ");
        name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("--------------------------------------------");
        System.out.println("Hello, there are monsters at");
    }

    public void playRound() {
        System.out.println("You s");
        System.out.println("You have encountered a "  );
    }

    public int totalEnemies() {
        return totalDragons+totalDemons+totalOrges+totalGoblins;
    }

    public void checkRadar() {
        System.out.println("Total Dragons: " + totalDragons);
        System.out.println("Total Demons: " + totalDemons);
        System.out.println("Total Orges: " + totalOrges);
        System.out.println("Total Goblins: " + totalGoblins);
    }

    public void findPath() {
        int total = totalEnemies();

    }

    public boolean isWin() {
        return totalDragons==0;
    }
}
