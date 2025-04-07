import java.util.*;

/*

class storage ya anbar
har anbar yek noo material metone zakhire kone ba amount on material
har anbar ba esm materiali ke zakhire mikonan shenakhte mishan..

to in kelas constractor storage ,,,
hamrah esm storage ( ya esm materiali ke tosh zakhire shode) ++ meghdar
on material dar storage hast
getter va setter name va amount storage to in kelas neveshte shode

*/
public class storage {

    private String Name;
    private int Amount;


    public storage(String name,  int amount){
        Name = name;
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public int getAmount() {
        return Amount;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAmount(int amount) {
        Amount = amount;

    }

    public void increase (int x){
        Amount += x;
    }

    public void decrease (int x){
        Amount -= x;
    }


}



