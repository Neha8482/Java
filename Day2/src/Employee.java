
public class Employee {
	private int Empid;
	private String EmpName;
	private String EmpAddress;
	private String Empemail;
	private String Empdesignation;
	
	
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	public String getEmpemail() {
		return Empemail;
	}
	public void setEmpemail(String empemail) {
		Empemail = empemail;
	}
	public String getEmpdesignation() {
		return Empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		Empdesignation = empdesignation;
	}
	
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", EmpAddress=" + EmpAddress + ", Empemail="
				+ Empemail + ", Empdesignation=" + Empdesignation + "]";
	}
	public void add(int Empid,String EmpName,String EmpAddress,String Empemail,String Empdesignation) {
		this.Empid=Empid;
		this.EmpName=EmpName;
		this.EmpAddress=EmpAddress;
		if(Empemail!=null) {
		this.Empemail=Empemail;}
		if(Empdesignation != null) {
		this.Empdesignation=Empdesignation;}
		else {
			this.Empdesignation=Empdesignation;
		}
	}
	public void modify(String EmpAddress,String Empemail,String Empdesignation) {
		this.EmpAddress=EmpAddress;
		this.Empemail=Empemail;
		this.Empdesignation=Empdesignation;
	}
}
