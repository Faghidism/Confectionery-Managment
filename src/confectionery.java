import java.util.*;

// class modiriat shirnifroshi
//

public class confectionery {
    public ArrayList<customer> allcustomer = new ArrayList<>();
    public ArrayList<candy> allcandy = new ArrayList<>();
    public ArrayList<storage> Storages = new ArrayList<>();
    public ArrayList<moneytrans> moneytrans = new ArrayList<>();
    public ArrayList<Discount> discounts = new ArrayList<>();
    int wallet = 0;
    confectionery(int w){
        wallet=w;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
