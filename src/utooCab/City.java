package utooCab;

import java.util.Map;

public abstract class City {
	private String nameOfCity;
	private Map<String,Integer> SDpairPrice;//contains a list of source destination pair and their travel cost

	public City(String nameOfCity,Map<String,Integer> sDpairPrice){
		this.setNameOfCity(nameOfCity);
		this.setSDpairPrice(sDpairPrice);
	}
	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}
	//get price for a source destination pair
	public int getPriceOfSDpair(String sDPair) {
		return SDpairPrice.get(sDPair);
	}

	public void setSDpairPrice(Map<String,Integer> sDpairPrice) {
		SDpairPrice = sDpairPrice;
	}
	//shows a list of all Source destination in city
	public void showSDpairPrice(){
		System.out.println(this.getSDpairPrice());
	}

	public Map<String,Integer> getSDpairPrice() {
		return SDpairPrice;
	}
	//validate source and destination pair
	public boolean validateSDPair(String sDPair){
		if(this.getSDpairPrice().containsKey(sDPair))
			return true;
		else
			return false;
	}
}
