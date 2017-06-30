package SyncDoc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

public class SimpleDoctor implements Doctor {
	private HashMap<String, Date> appList;
	final private int ID;
	static DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss a");
	public SimpleDoctor(int id){
		appList = new HashMap<String, Date>();
		ID=id;
	}
	
	@Override
	public HashMap<String, Date> getAppointmentList() {
		return appList;
	}
	
	public void makeAppointment(String name,Date time){
		
		Calendar c = Calendar.getInstance();
        c.setTime(time);
        
        c.add(Calendar.DATE,1);
        time=c.getTime();
        appList.put(name, time);
	}
	
	public void showAppointment(String name){
		try{
			System.out.println("Your appointment is on:"+dateFormat.format(appList.get(name)));
		}catch(Exception e)
		{
			System.out.println("you don't have any appointment\n");
		}
	}
	public void showAppointments(){
		System.out.println("showing Appointment list for Doctor having ID: "+ID);
		for (Entry<String, Date> pair : appList.entrySet()) {
			try{
				System.out.println(pair.getKey()+"    "+dateFormat.format(pair.getValue()));
			}catch(Exception e){}
		}
	}
	public int getID() {
		return ID;
	}
	
}
