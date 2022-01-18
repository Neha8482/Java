package Service;

import com.beans.*;
import java.util.*;

public class ExpenseService {

	public static Expense createExpense(ExpenseType expenseType,double amount,User paidBy,List<Split> splits) {
		switch(expenseType) {
		case EXACT:
			return new ExactExpense(amount, paidBy, splits);
		case EQUAL:
			int n = splits.size();
			for(Split split : splits) {
				EqualSplit e  = (EqualSplit)split;
				split.setAmount(amount/n);
			}
			return new EqualExpense(amount/n, paidBy, splits);
			
		case PERCENT:
			for(Split split : splits) {
				PercentSplit p = (PercentSplit)split;
				split.setAmount(amount * p.getPercent()/100);
			}
			return new PercentExpense(amount, paidBy, splits);
		default:
			return null;
		}
	}
}
