package utooCab;

public class CabRecord {
	
	private Cab cab;
	private String sDPair;
	private String cust_Name;
	
	public CabRecord(Cab newCab,String newsDPair,String newCust_name)
	{
		this.setCab(newCab);
		this.setsDPair(newsDPair);
		this.setCust_Name(newCust_name);
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public String getsDPair() {
		return sDPair;
	}

	public void setsDPair(String sDPair) {
		this.sDPair = sDPair;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	
}
