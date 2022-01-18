package com.beans;

import java.util.List;

public class ExactExpense extends Expense {

	public ExactExpense(double amount, User paidBy, List<Split> splits) {
		super(amount, paidBy, splits);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validate() {
		for(Split split : getSplits()) {
			if(!(split instanceof ExactSplit))
				return false;
		}
		double totalAmpunt = getAmount();
		double sumAmount=0;
		for(Split splits : getSplits()) {
			ExactSplit ex = (ExactSplit)splits;
			sumAmount = sumAmount+ ex.getAmount();
		}
		if(totalAmpunt != sumAmount)
			return false;
		return true;
	}

}