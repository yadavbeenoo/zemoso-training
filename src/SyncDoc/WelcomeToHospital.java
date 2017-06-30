package SyncDoc;

import java.util.Arrays;
import java.util.List;

public class WelcomeToHospital {
	private static List<String> clients = Arrays.asList("A","B","C","D");
	
	public WelcomeToHospital(){
		System.out.println("Welcome to appointment management system \n");
	}
	
	public boolean validate(String name){
		if(clients.contains(name))
			return true;
		return false;
	}

	public boolean validateID(int id) {
		if(id>0&& id<11) 
			return true;
		return false;
	}
	
}
