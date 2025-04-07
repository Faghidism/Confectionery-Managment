public class Discount {

    private int ID;
    private int amount;
    public Discount(int ID, int amount) {
        this.ID = ID;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public int getAmount() {
        return amount;
    }
}