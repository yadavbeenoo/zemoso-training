package utooCab;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class CityCabFactory {
	private City city;
	private Map<String,Integer> cabTypePricepair=new HashMap<String,Integer>()
												{{put("Micro",10);put("Mini",20);put("Sedan",300);put("SUV",40);}};
	private Map<Integer,Entry<Cab,Boolean>> cabs;//contains list cabs in city
	private Map<Integer, CabRecord> bookedCabRecord=new HashMap<Integer,CabRecord>();//list of booked cabs in city
	//integer is cabNumber 
	int cabNumber=0;
	
	abstract public void showCabsCount();
	abstract public void addCabsToCity();
	
	public Cab createMicro(){
		return new Micro("Micro",cabTypePricepair.get("Micro"));
	}
	public Cab createMini(){
		return new Mini("Mini",cabTypePricepair.get("Mini")); 
	}
	public Cab createSedan(){
		return new Sedan("Sedan",cabTypePricepair.get("Sedan"));
	}
	public Cab createSUV(){
		return new SUV("SUV",cabTypePricepair.get("SUV"));
	}
	public Map<Integer, Entry<Cab, Boolean>> getCabs() {
		return cabs;
	}
	public void setCabs(Map<Integer, Entry<Cab, Boolean>> cabs) {
		this.cabs = cabs;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	//booking a cab of a type for a Source destination pair
	public int bookCabOfType(String cabType,String sDPair,String cust_name){
		for(Entry<Integer, Entry<Cab, Boolean>> cabOfcity:getCabs().entrySet()){
			if(cabOfcity.getValue().getValue()==false && cabOfcity.getValue().getKey().getName().equals(cabType)){
				cabOfcity.getValue().setValue(true);
				CabRecord cabRecord=new CabRecord(cabOfcity.getValue().getKey(),sDPair,cust_name);
				this.bookedCabRecord.put(cabOfcity.getKey(), cabRecord);
				return cabOfcity.getKey();
			}
		}
		return 0;
	}

	public Map<Integer, CabRecord> getBookedCabRecord() {
		return bookedCabRecord;
	}

	public void setBookedCabRecord(Map<Integer, CabRecord> bookedCabRecord) {
		this.bookedCabRecord = bookedCabRecord;
	}

	public int getCabNumber() {
		return cabNumber;
	}

	public int setCabNumber(int cabNumber) {
		this.cabNumber = cabNumber;
		return cabNumber;
	}
	public Map<String,Integer> getCabTypePricepair() {
		return cabTypePricepair;
	}
	public void setCabTypePricepair(Map<String,Integer> cabTypePricepair) {
		this.cabTypePricepair = cabTypePricepair;
	}
}
