package application;


import java.util.ArrayList;

public class Customer implements Comparable<Customer> {

	private String mobileNumber;
	private String ID;
	private String address;
	private String nameCustomer;
	private String plan;
	protected ArrayList<Media> interested=new ArrayList<>();
	protected ArrayList<Media> rented=new ArrayList<>() ;
	
	public Customer() {
		
	}
	

	public Customer(String ID,String mobileNumber,String nameCustomer,String address,String plan) {
		this.address = address;
		this.nameCustomer = nameCustomer;
		this.mobileNumber=mobileNumber;
		this.ID=ID;
		this.plan=plan;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public ArrayList<Media> getInterested() {
		return interested;
	}

	public void setInterested(ArrayList<Media> interested) {
		this.interested = interested;
	}

	public ArrayList<Media> getRented() {
		return rented;
	}

	public void setRented(ArrayList<Media> rented) {
		this.rented = rented;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	@Override
	public int compareTo(Customer o) {
      return this.nameCustomer.compareTo(o.nameCustomer);
		
	}

	@Override
	public String toString() {
		return "address=" + address + "\n nameCustomer=" + nameCustomer + "\n rented=" + rented+"\nMobile Number:"+mobileNumber+"\nID="+ID ;
	}	
	
	
}
 
