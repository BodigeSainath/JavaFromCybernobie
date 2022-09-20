package ZeeZeeBank;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Account account=new Account();
System.out.println("Enter the account number");
account.setAccNumber(sc.nextInt());

System.out.println("Enter the initial balance");
account.setInitialBalance(sc.nextDouble());

System.out.println("Enter amount for deposit");
account.setAmountDeposit(sc.nextDouble());

System.out.println("Available Balance is "+account.getAvailableBalance());

System.out.println("Enter amount to be withdrawn");
account.setAmountWithdraw(sc.nextDouble());

System.out.println("Available balance is "+account.getAvailableBalance());
}
}
