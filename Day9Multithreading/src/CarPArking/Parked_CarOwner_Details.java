package CarPArking;

public class Parked_CarOwner_Details {

	private String ownerName;
	private String carModel;
	private String carNo;
	private long ownerMobileNo;
	private String Address;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Parked_CarOwner_Details(String ownerName, String carModel, String carNo, long ownerMobileNo,
			String address) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.Address = address;
	}
	@Override
	public String toString() {
		return "ownerName = " + ownerName + ", carModel = " + carModel + ", carNo = " + carNo
				+ ", ownerMobileNo = " + ownerMobileNo + ", Address = " + Address + "\n";
	}
	
	
	
}
