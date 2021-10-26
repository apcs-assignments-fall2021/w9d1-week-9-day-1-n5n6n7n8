public class BankAccount {
    // Instance variables
    private int balance=50;
    private int accountNumber;
    private String preferredName;

    public BankAccount(int a, String p) {
        accountNumber = a;
        preferredName = p;
    }

    public Boolean withdrawl(int amount) //changes amount of money in bank, returns false if amount cannot be withdrawn
    {
        this.balance -= amount;
        return this.balance >= 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getPreferredName() {
        return this.preferredName;
    }
    public void setPreferredName(String s){
        this.preferredName=s;
    }
    @Override
    public String toString() {
        return this.accountNumber + " is your account number. $" + this.balance + " is your current balance.";
    }
}