public class TestMedicine{
	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[10];
		medicine[0] = new Tablet("tabldfef",new Address("pinfff","pune"),"tablet");
		medicine[0].displayName();
		medicine[1] = new Syrup("syroepfef",new Address("rjgepg","hyd"),"syrup");
		medicine[1].displayName();
		medicine[2]= new Ointment("tabldfef",new Address("pinfff","pune"),"ointment");
		medicine[2].displayName();
				
	}
	
}