public class Inventory {
    int healing = 0;
    int energize = 0;

    public void buy(String potion) {
        if (potion.equals("heal")) {
            healing++;
        } else if (potion.equals("energy")) {
            energize++;
        }
    }
}
