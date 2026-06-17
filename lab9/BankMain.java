package lap9;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}

public class BankMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountHolder("Karim");
        b.setAccountNumber("123456789");
        b.setBalance(50000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }

}