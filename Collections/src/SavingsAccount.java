/*
 * 1)Create a Class SavingAccount with field’s 
 * acc_balance, acc_ID, accountHoldername, isSalaryAccount.
 *  Also add setter and getter methods with business method like withdraw and deposit.
a.	Create class BankAccountList which will maintain SavingAccount objects. 
Ensure that this class should not allow duplicates as well as data should be
 displayed in sorted order. (as per acc_ID)  

 */
public class SavingsAccount {
	private double acc_balance;
	private int acc_id;
	private String AccountHolderName;
	private boolean isSalaryAccount;
	
	public void withdraw(int amount) {
		this.acc_balance = this.acc_balance - amount;
	}
	
	public void deposit(int amount) {
		this.acc_balance = this.acc_balance + amount;
	}
	
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public SavingsAccount(double acc_balance, int acc_id, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		AccountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", AccountHolderName="
				+ AccountHolderName + ", isSalaryAccount=" + isSalaryAccount + "\n";
	}
	
}
