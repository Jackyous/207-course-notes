abstract class Account {
    protected double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public abstract boolean withdraw(double amount);
}

interface InterestBearing{
    void addInterest();
}

class ChequingAccount extends Account{
    private double overdraftLimit;
    public ChequingAccount(double balance){
        super(balance);
    }
    public boolean withdraw(double amount){
        return true;
    }
}
class SavingsAccount extends Account implements InterestBearing{
    private double rate;
    public SavingsAccount(double balance){
        super(balance);
    }
    public boolean withdraw(double amount){
        return true;
    }
    public void addInterest(){
        //
    }
}