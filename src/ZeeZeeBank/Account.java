package ZeeZeeBank;

public class Account {
private int accNumber;
private double
 initialBalance,
 amountDeposit,
availableBalance,
amountWithdraw;

public int getAccNumber() {
	return accNumber;
}

public void setAccNumber(int accNumber) {
	this.accNumber = accNumber;
}

public double getInitialBalance() {
	return initialBalance;
}

public void setInitialBalance(double initialBalance) {
	this.initialBalance = initialBalance;
}

public double getAmountDeposit() {
	if(amountDeposit<0)
		System.out.println("Invalid Deposit of "+amountDeposit+" Cash, Try again.....");
	return amountDeposit;
}

public void setAmountDeposit(double amountDeposit) {
	this.amountDeposit = amountDeposit;
}

public double getAvailableBalance() {
	if(amountDeposit>0)
		availableBalance=initialBalance+amountDeposit;
	if(amountDeposit<0)
		availableBalance=initialBalance;
	 if(amountWithdraw>0 && amountWithdraw<availableBalance)
		availableBalance=availableBalance-amountWithdraw;
	 else
			System.out.println("Insufficient Funds in the account");

		return availableBalance;
}


public double getAmountWithdraw() {
	availableBalance=availableBalance-amountWithdraw;
	return availableBalance;
}

public void setAmountWithdraw(double amountWithdraw) {
	this.amountWithdraw = amountWithdraw;
}
}