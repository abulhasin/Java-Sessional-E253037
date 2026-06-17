class BankAccount {
    int accountNumber;
    String name;
    double balance;

    static String bankName = "Sonali Bank";

    BankAccount(int a, String n, double b) {
        accountNumber = a;
        name = n;
        balance = b;
    }

    void show() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    static void showBank() {
        System.out.println("Bank Name: " + bankName);
    }
}
public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount(1001, "Rahim", 5000);
        BankAccount obj2 = new BankAccount(1002, "Karim", 8000);

        BankAccount.showBank();

        obj1.show();
        System.out.println();
        obj2.show();
    }
}