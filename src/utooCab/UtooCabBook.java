package utooCab;

import java.util.Scanner;
import java.util.Map.Entry;

public class UtooCabBook {
	CityCabFactory cabsOfCity;
	Scanner sc=new Scanner(System.in);
	String cityName,sDPair,cust_name,cabType;
	public void bookingPortal(){
		System.out.println("Welcome to utoo Cab Booking App");
		System.out.println("Please enter City in which this app is to be used:\nHyderabad\nBangluru\nChennai");
		
		cityName=sc.next();
		cabsOfCity=giveCityFactory(cityName);
		if(cabsOfCity==null){
			System.out.println("Currently No Service in this City\n");
			sc.close();
			return;
		}
		
outer: while(true){
			System.out.println("Please enter what you want to do:\n1.book cab\n2.see all booked cab record\n"
					+ "3.see booked cab record for perticular customer\n4.exit portal");
			int typeOfService=sc.nextInt();
			CabRecord cabRecord;
			switch(typeOfService){
				case 1:
					System.out.println("please enter your name");
					cust_name=sc.next();
					cabRecord=bookcab();
					if(cabRecord==null)
						System.out.println("cab cant be book");
					break;
				case 2:
					showBookedCabs();
					break;
				case 3:
					System.out.println("please enter your name");
					cust_name=sc.next();
					showCabBookedByme();
					break;
				case 4:
					System.out.println("thank you for using utoocab,visit again");
					break outer;
				default:
					System.out.println("enter write option");
					break;
					
			}
		}
	}
	
	private void showBookedCabs() {
		if(cabsOfCity.getBookedCabRecord().size()==0){
			System.out.println("currently no records available");
			return;
		}
		System.out.println("cabNumber type customer    travelling\ttotal price");
		for(Entry<Integer, CabRecord> cabrecord:cabsOfCity.getBookedCabRecord().entrySet()){
			System.out.println("    "+cabrecord.getKey()+"\t "+cabrecord.getValue().getCab().getName()+"\t"+cabrecord.getValue().getCust_Name()+
					"\t  "+cabrecord.getValue().getsDPair()+"\t"+(cabrecord.getValue().getCab().getPrice() + cabsOfCity.getCity().getPriceOfSDpair(cabrecord.getValue().getsDPair())));
		}
	}

	private void showCabBookedByme() {
		boolean isRecordAvailable=false;
		for(Entry<Integer, CabRecord> cabrecord:cabsOfCity.getBookedCabRecord().entrySet()){
			if(cust_name.equals(cabrecord.getValue().getCust_Name())){
				isRecordAvailable=true;
				System.out.println("cab number: "+cabrecord.getKey()+"typeOfcab: "+cabrecord.getValue().getCab().getName()+"\t travelling between: "
			            +cabrecord.getValue().getsDPair()+"\t total price: "+(cabrecord.getValue().getCab().getPrice() + cabsOfCity.getCity().getPriceOfSDpair(cabrecord.getValue().getsDPair())));
			}
		}
		if(isRecordAvailable==false){
			System.out.println("it seems you have not booked any cab");
		}
	}
	//returns type of city factory
	private CityCabFactory giveCityFactory(String cityName) {
		if(cityName.equals("Hyderabad")){
			return new HyderabadCabFactory();
		}
		else if(cityName.equals("Bangluru")){
			return new BangluruCabFactory();
		}else if(cityName.equals("Chennai")){
			return new ChennaiCabFactory();
		}else
			return null;
	}
	
	//books a cab and returns its record
	private CabRecord bookcab() {
		System.out.println("Please enter travel you want to do:");
		cabsOfCity.getCity().showSDpairPrice();
		sDPair=sc.next();
	
		if(!cabsOfCity.getCity().validateSDPair(sDPair)){
			System.out.println("Currently No Service in between this Locations\n");
			sc.close();
			return null;
		}
		
		System.out.println("Please enter type of cab you want from below list:");
		cabsOfCity.showCabsCount();
		
		cabType=sc.next();
		int cabNumber=cabsOfCity.bookCabOfType(cabType,sDPair,cust_name);
		
		if(cabNumber==0){
			System.out.println("Currently No Cab of this Type is available\n");
			return null;
		}
		
		System.out.println("your cab is booked having cab Number: "+cabNumber+
				" And Total Cost is "+(cabsOfCity.getBookedCabRecord().get(cabNumber).getCab().getPrice()
						+cabsOfCity.getCity().getPriceOfSDpair(sDPair)));
		
		//returning booked cab record
		return cabsOfCity.getBookedCabRecord().get(cabNumber);
	}
	
	public static void main(String [] args){
		UtooCabBook cabBookApp=new UtooCabBook();
		cabBookApp.bookingPortal();
	}
}