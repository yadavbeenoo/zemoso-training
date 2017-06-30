package SyncDoc;
import java.util.Date;
import java.util.HashMap;
public interface Doctor {
	public  HashMap<String,Date> getAppointmentList();	
	public int getID();
	public void makeAppointment(String name,Date time);
	public void showAppointment(String name);
	public void showAppointments();
}
