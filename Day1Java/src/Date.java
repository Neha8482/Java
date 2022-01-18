
public class Date {
	private String day;
	private int month;
	private int year;
	
	Date(){
		this.day="Sunday";
		this.month=11;
		this.year=2011;
	}
	
	Date(String day,int month,int year){
		if(year < 2021) {
			if(month > 0 && month < 31) {
				this.day=day;
				this.month=month;
				this.year=year;
			}
		}
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
