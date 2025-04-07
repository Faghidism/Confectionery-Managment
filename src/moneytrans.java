import java.util.*;

//class tarakonesh
//trans id va takhfif va amount ro dare

public class moneytrans {

    private String transid;
    private int customerid;
    private int rial;
    private int off;


    public moneytrans(String transid, int customerid, int rial, int off) {
        transid = transid;
        customerid = customerid;
        rial = rial;
        off = off;
    }

    public String getTransid() {
        return transid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getRial() {
        return rial;
    }

    public int getOff() {
        return off;
    }

    public void show(){
        System.out.print(customerid);
        System.out.print(" ");
        System.out.print(rial);
        System.out.print(" ");
        System.out.print(transid);
        System.out.print(" ");
        System.out.println(off);
    }

    public void setTransid(String transid) {
        transid = transid;
    }

    public void setCustomerid(int customerid) {
        customerid = customerid;
    }

    public void setRial(int rial) {
        rial = rial;
    }

    public void setOff(int off) {
        off = off;
    }
}
