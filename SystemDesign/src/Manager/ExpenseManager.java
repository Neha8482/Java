package Manager;
import com.beans.*;

import Service.ExpenseService;

import java.util.*;

public class ExpenseManager {
	
	List<Expense> expenses;
	Map<String,User> userDb;
	Map<String, Map<String,Double>> balanceSheet;
	public ExpenseManager() {
		super();
		expenses = new ArrayList<>();
		userDb = new HashMap<>();
		balanceSheet = new HashMap<String, Map<String,Double>>();
	}
	
	public void addUser(User user) {
		userDb.put(user.getId(), user);
		balanceSheet.put(user.getId(), new HashMap<String,Double>());
	}
	
	public void addExpense(ExpenseType expenseType, double amount,String paidBy,List<Split> splits) {
		Expense expense = ExpenseService.createExpense(expenseType, amount, userDb.get(paidBy), splits);
	    expenses.add(expense);
	    for(Split split : expense.getSplits()) {
	    	String paidTo = split.getUser().getId();
	    	Map<String,Double> balances = balanceSheet.get(paidBy);
	    if(!balances.containsKey(paidTo)) {
	    	balances.put(paidTo,0.0);
	    }
	    balances.put(paidTo, balances.get(paidTo) + split.getAmount());
	    
	    balances = balanceSheet.get(paidTo);
	    if(!balances.containsKey(paidBy)) {
	    	balances.put(paidBy,0.0);
	    }
	    balances.put(paidBy, balances.get(paidBy) + split.getAmount());
	    }
	}
	
	public void showBalance(String userId) {
		boolean isEmpty = true;
		for(Map.Entry<String, Double> userBalance : balanceSheet.get(userId).entrySet()) {
			if(userBalance.getValue() != 0) {
				isEmpty = false;
				printBalance(userId, userBalance.getKey(),userBalance.getValue());
			}
		}
		if(isEmpty) {
			System.out.println("No balances");
		}
	}

	public void showBalances() {
		for(Map.Entry<String, Map<String,Double>> mp : balanceSheet.entrySet()) {
			for(Map.Entry<String, Double> mp1 : mp.getValue().entrySet()) {
				System.out.println(mp.getKey()+" owes "+mp1.getKey()+mp1.getValue());
			}
		}
	}
	private void printBalance(String user1,String user2,double amount) {
		String user1Name = userDb.get(user1).getName();
		String user2Name = userDb.get(user2).getName();
		if(amount < 0) {
			System.out.println(user1Name +"owes "+user2Name);
		}else if(amount > 0) {
			System.out.println(user2Name +"owes"+user1Name);
		}
	}
}
