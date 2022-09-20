package demo.CgJavaBook.InheritanceNDpolymorphsim.ex1;

public class Account {
    private long accountNumber;
    private double balance;
    private Person accountHolder;
    private final double minBalance = 500;

    public void deposit(double depAmount) {
        balance = balance + depAmount;
    }

    public void withdraw(double withdrawAmt) {
        if (withdrawAmt <= balance) {
            if (balance - withdrawAmt > minBalance) {
                balance = balance - withdrawAmt;
            } else {
                System.out.println("Min of 500 should be in act");

            }
        } else if (withdrawAmt > balance) {
            System.out.println("insuffient funds");
        }
    }


    public  double getBalance(){
  return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }
public  Account(){

}
    public Account( long accountNumber, double balance, Person accountHolder) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public  String toString(){
        return accountHolder.getName()+accountHolder.getAge()+
               getAccountNumber()+ accountNumber+getBalance();
    }
}
