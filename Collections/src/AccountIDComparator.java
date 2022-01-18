import java.util.Comparator;

public class AccountIDComparator implements Comparator<SavingsAccount>{

	@Override
	public int compare(SavingsAccount o1, SavingsAccount o2) {
		Integer acc_id1 = o1.getAcc_id();
		Integer acc_id2 = o2.getAcc_id();
		
		return acc_id1.compareTo(acc_id2);
	}

}
