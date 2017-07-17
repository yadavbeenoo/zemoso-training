package utooCab;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ChennaiCabFactory extends CityCabFactory {
	public ChennaiCabFactory() {
		Map<String,Integer> sdpair=new HashMap<String,Integer>(){{
			put("station-IIT",120);
			put("IIT-station",90);
			put("airport-IIT",80);
			put("IIT-airport",70);
		}};
		City city=new MetroCity("Chennai",sdpair);
		this.setCity(city);
		this.addCabsToCity();
	}

	@Override
	public void showCabsCount() {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("Micro",0);
		map.put("Mini",0);
		map.put("Sedan",0);
		
		for(Entry<Integer, Entry<Cab, Boolean>> cab:getCabs().entrySet()){
			if(cab.getValue().getValue()==false)
				map.merge(cab.getValue().getKey().getName(), 1, Integer::sum);

		}
		
		System.out.println("type\tavailabilty\tprice");
		for(Entry<String,Integer> type:map.entrySet()){
			System.out.println(type.getKey()+"\t"+type.getValue()+"\t\t"+getCabTypePricepair().get(type.getKey()));
		}
	}

	@Override
	public void addCabsToCity() {
		Map<Integer,Entry<Cab,Boolean> > cabs=new HashMap<Integer,Entry<Cab,Boolean> >();
		Map<Cab,Boolean> cabForm=new HashMap<Cab,Boolean>(){{
			put(createMicro(),false);
			put(createMicro(),false);
			put(createMini(),false);
			put(createMini(),false);
			put(createSedan(),false);
			put(createSedan(),false);
		}};
		for(Entry<Cab, Boolean> type:cabForm.entrySet()){
			cabs.put(++cabNumber,type);
		}
		
		setCabs(cabs);
	}
}
