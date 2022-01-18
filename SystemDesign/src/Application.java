import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Split;
import com.beans.User;

import Manager.ExpenseManager;


public class Application {

	public static void main(String[] args) {
		ExpenseManager expenseManager = new ExpenseManager();
		expenseManager.addUser(new User("56","user1","abcd@gmail.com","3842042"));
		 expenseManager.addUser(new User("u1", "User1", "gaurav@workat.tech", "9876543210"));
	     expenseManager.addUser(new User("u2", "User2", "sagar@workat.tech", "9876543210"));
	     expenseManager.addUser(new User("u3", "User3", "hi@workat.tech", "9876543210"));
	     expenseManager.addUser(new User("u4", "User4", "mock-interviews@workat.tech", "9876543210"));
	     
	     Scanner sc = new Scanner(System.in);
	     while(true) {
	    	 String command = sc.nextLine();
	    	 String[] commands= command.split(" ");
	    	 String commandType = commands[0];
	    	 
	    	 switch(commandType) {
	    	 case "SHOW":
	    		 if(commands.length == 1) {
	    			 expenseManager.showBalances();
	    		 }
	    	 case "EXPENSE":
	    		 String paidBy = commands[1];
	    		 Double amount = Double.parseDouble(commands[2]);
	    		 int noOfUsers = Integer.parseInt(commands[3]);
	    		 String expenseType = commands[4];
	    		 List<Split> split = new ArrayList<>();
	    		 switch(expenseType) {
	    		 case "EQUAL":
	    			 
	    		 }
	    	 case "EXACT":
	    		 
	    	 case "PERCENT":
	    	 }
	     }

		
	}
}