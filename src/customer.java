import java.util.*;

// class moshtari
// name va id moshtari dare ,,, getter va setter in dota

public class customer {

    private String Name;
    private int Id;
    private int account;


    public customer(String name, int id) {
        Name = name;
        Id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

}


