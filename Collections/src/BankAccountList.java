import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
public static void main(String[] args) {
	Set<SavingsAccount> account = new TreeSet<>(new AccountIDComparator());
	
	SavingsAccount acc1 = new SavingsAccount(35353,232,"Kiara",true);
	account.add(acc1);
	acc1.withdraw(3345);
	acc1.deposit(45464);
	
	SavingsAccount acc2 = new SavingsAccount(66766,343,"Preety",false);
	account.add(acc2);
	
	SavingsAccount acc3 = new SavingsAccount(78675,237,"Sheena",false);
	account.add(acc3);
	acc3.withdraw(6767);
	acc3.deposit(9797);
	
	SavingsAccount acc4 = new SavingsAccount(23242,238,"Paul",true);
	account.add(acc4);
	acc4.withdraw(56);
	acc4.deposit(9897);

/*	account.add(new SavingsAccount(66766,343,"Preety",false));
	account.add(new SavingsAccount(78675,237,"Sheena",false));
	account.add(new SavingsAccount(23242,238,"Paul",true));
	
	*/
	System.out.println(account);
}
}
