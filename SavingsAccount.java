public class SavingsAccount extends BankAccount {
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber; 

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = getBalance() * (rate / 12);
        deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount original, double amount) {
        super(original, amount);
        this.savingsNumber = original.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}
