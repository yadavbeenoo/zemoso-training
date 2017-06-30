package SyncDoc;

import java.util.ArrayList;
import java.util.Date;

public class MakeAppointment {
		private ArrayList<Doctor> listOfDoctors=new ArrayList<Doctor>();
		
		WelcomeToHospital welcome;
		
		public MakeAppointment(){
			int i;
			for(i=0;i<10;i++)
			{
				listOfDoctors.add(new SimpleDoctor(i+1));
			}
			welcome=new WelcomeToHospital();
		}
		
		public void seeAppointment(String name,int id){
			if(welcome.validateID(id)&& welcome.validate(name)){
				listOfDoctors.get(id-1).showAppointment(name);
			}else
				System.out.println("Please enter correct name and id\n");
		}
		
		public void appointment(String name, int id){
				System.out.println("hii,"+name+".\nWe will make ur Appointment if possible");
				if(welcome.validate(name)){
					System.out.println("We are placing your appointment in doctor's list");
					if(welcome.validateID(id)){
						Date temp=new Date();
						listOfDoctors.get(id-1).makeAppointment(name, temp);
						listOfDoctors.get(id-1).showAppointment(name);
					}else{
						System.out.println("Please enter correct id\n");
					}
				}else{
					System.out.println("Please enter correct name\n");
				}
				
		}

		public void showAllAppointment(int id) {
			if(welcome.validateID(id)){
				listOfDoctors.get(id-1).showAppointments();
			}else
				System.out.println("Please enter correct id\n");
		}
}
