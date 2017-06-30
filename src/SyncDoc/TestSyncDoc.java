package SyncDoc;

import java.util.Scanner;

public class TestSyncDoc {
	
	public static void main(String[] args){
		
		MakeAppointment appo= new MakeAppointment();
		System.out.println("Choose What do want to do from list:");
		Scanner sc=new Scanner(System.in);
  Loop: while(true){
		System.out.println("\n1:Book a Appointment\n2:See your Appointment time\n3:See all Appointments of a doctor\n4:Exit the portal");
		int num=sc.nextInt();
		String name;
		int id;
		switch(num){
		case 1:
			System.out.println("Please enter your name and doctors Id:\n");
			name= sc.next();
			id=sc.nextInt();
			appo.appointment(name, id);
				break;
		case 2:
			System.out.println("please enter your name and doctors Id:\n");
			name= sc.next();
			id=sc.nextInt();
			appo.seeAppointment(name, id);
				break;
		case 3:
			System.out.println("please enter doctors Id:\n");
			id=sc.nextInt();
			appo.showAllAppointment(id);
				break;
		case 4:
			sc.close();
			System.out.println("we exiting the portal");
				break Loop;
		}
		}
	}
}
