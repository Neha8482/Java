package LCS;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Scanner;

class WrongInputException extends Exception{
	WrongInputException(){
		System.out.println("The input format is not correct");
	}
}

public class AngleBetween {
public static void main(String[] args) throws WrongInputException, java.text.ParseException {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	try {
		LocalTime time = LocalTime.parse(a);
		int h = time.getHour() ;
		int m = time.getMinute();
		if(h > 12)
			h=h-12;
		
		int hrangle = h * 30;  // hour * 60 * (1/2) -  angle made by hour hand in one minute * hour value given
		int minangle = m * 6;  //min * 6 - angle made by minute hand in one mins * min value given
		int angle = Math.abs(hrangle - minangle);
		System.out.println(Math.min(360-angle, angle));
	}
	catch(Exception e) {
		System.out.println("Please input time in correct format");
		System.exit(0);
	}
	
}
}
