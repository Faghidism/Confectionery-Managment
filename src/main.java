import java.util.Scanner;

/*

all rights reserved by faghid afrakhte
developed in delkash's shitee
you dumb lunatic ,don't copy this shit

class main ,,function haye menu
menu va class vorodoi

*/

public class main {
    static confectionery confectionery;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        String line;
        boolean exit = true;
        while (exit) {
            System.out.println
                    ("""                                
                            1.Creat confectionery 
                            2.Add customer 
                            3.Add candy
                            4.Add storage
                            5.Add discount
                            6.Add discount customer
                            7.Increase balance                    
                            8.Increase candy         
                            9.Accept transaction
                            10.Print transaction
                            11.Print income
                            12.Exit
                            """);
            System.out.println("input menu num");
            int inputmenu = scanner.nextInt();

            switch (inputmenu) {
                case 1:
                    creatconfectionary();
                    break;
                case 2:
                    addcustomer();
                    break;
                case 3:
                    addcandy();
                    break;
                case 4:
                    addstorage();
                    break;
                case 5:
                    adddiscount();
                    break;
                case 6:
                    adddiscountcustomer();
                    break;
                case 7:
                    increasebalance();
                    break;
                case 8:
                    increasecandy();
                    break;
                case 9:
                    accepttrans();
                    break;
                case 10:
                    printttrans();
                    break;
                case 11:
                    System.out.println(confectionery.getWallet());
                    break;
                case 12:
                    exit = false;
                    break;
                default:
                    System.out.println("invalid command");
            }
        }

    }

    public static void creatconfectionary() {
        System.out.println("confectionery wallet =");
        int confecwallet = scanner.nextInt();
        confectionery = new confectionery(confecwallet);
    }

    public static void addcustomer() {
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter Id");
        int Id = scanner.nextInt();
        customer c = new customer(name, Id);
        confectionery.allcustomer.add(c);
    }

    static void addcandy() {
        System.out.println("Enter candy's Name = ");
        String name = scanner.next();
        System.out.println("Enter candy's Price");
        int price = scanner.nextInt();
        candy k = new candy(name, price);
        confectionery.allcandy.add(k);
    }

    static void addstorage() {
        System.out.println("enter material= ");
        String name = scanner.next();
        System.out.print("Enter material amount=");
        int amount = scanner.nextInt();
        storage p = new storage(name, amount);
        confectionery.Storages.add(p);

    }

    static void adddiscount() {
        System.out.println("Enter discount ID =");
        int id = scanner.nextInt();
        System.out.println("add discount amount");
        int amount = scanner.nextInt();
        Discount discount = new Discount(id, amount);
        confectionery.discounts.add(discount);
    }

    static void adddiscountcustomer() {
        System.out.println("Enter discount code=");
        int code = scanner.nextInt();
        System.out.println("Enter customer ID=");
        int id = scanner.nextInt();
    }

    static void increasebalance() {
        System.out.println("Enter increase amount=");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
    }

    static void increasecandy() {
        System.out.println("Enter increase amount = ");
        int x = scanner.nextInt();

    }

    static void printttrans() {
        for (moneytrans ms : confectionery.moneytrans) {
            ms.show();
        }
    }

    static void accepttrans() {
    }


}


