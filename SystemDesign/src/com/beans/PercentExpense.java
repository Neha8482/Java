package com.beans;

import java.util.List;

public class PercentExpense extends Expense{

	public PercentExpense(double amount, User paidBy, List<Split> splits) {
		super(amount, paidBy, splits);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validate() {
		for(Split splits : getSplits()) {
			if(!(splits instanceof PercentSplit))
				return false;
		}
		
		double totalAmount = getAmount();
		double sumAmount = 0;
		for(Split splits : getSplits()) {
			PercentSplit ps = (PercentSplit)splits;
			sumAmount += totalAmount * ps.getPercent()/100;
		}
		if(sumAmount != totalAmount)
			return false;
		return true;
	}

}
