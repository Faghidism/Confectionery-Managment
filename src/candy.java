import java.util.*;

/*

class candy yab shirini
har candy ke save shode to confectionery yek esm va yek gheymat dare
mitone az yek ya chand material ke to storage hamon zakhire shode estefadd kone

to in kelas
constractor esm va gheymat shiriny(name va price)
++ getter va setter esm va gheymat neveshe shode

*/
public class candy {

    private String Name;
    private int Price;
    private HashMap<String, Integer> consistentMaterial = new HashMap<>();
    public candy(String name, int price) {
        Price = price;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }
    public void addMaterial(String ss, int amount){
        consistentMaterial.put(ss, amount);
    }

    public void setPrice(int price) {
        Price = price;
    }
}
