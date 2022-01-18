
public class BankAccount {

	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
	
	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	public void deposit(float amt) throws NegativeAmount {
		if(amt < 0)
			throw new NegativeAmount();
		else
		this.balance = this.balance + amt;
	}
	
	public void withdraw(float amt) throws InsufficientFunds, NegativeAmount {
		if(this.accType == "Savings") {
			if(this.balance < 1000) {
				throw new InsufficientFunds();
			}
			else {
				if(amt < 0)
					throw new NegativeAmount();
				else
					this.balance = this.balance - amt;
			}
		}
			else if(this.accType == "Current") {
			if(this.balance < 5000) {
				throw new InsufficientFunds();
			}
			else {
				if(amt < 0)
					throw new NegativeAmount();
				else
					this.balance = this.balance - amt;
			}
		}
		}
	
	public float getBalance() throws LowBalanceException, NegativeAmount {
		
		if(this.accType == "Savings") {
			if(this.balance < 1000) {
				throw new LowBalanceException();
			}
			else {
				if(this.balance < 0)
					throw new NegativeAmount();
			}
		}
			else if(this.accType == "Current") {
			if(this.balance < 5000) {
				throw new LowBalanceException();
			}
			else {
				if(this.balance < 0)
					throw new NegativeAmount();
			}
		}
		return this.balance;
	}
		
	
	public static void main(String[] args) {
		float accountBalance;
		BankAccount account = new BankAccount(232,"Lalit","Savings",1000);
		try {
			accountBalance =account.getBalance();
			account.deposit(1000);
		} catch (NegativeAmount | LowBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
