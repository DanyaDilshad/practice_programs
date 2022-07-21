package source;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {
	public static ArrayList<Hr> hrs;
	public static ArrayList<SoftwareEngineer> softwareEngineers;
	public static ArrayList<Manager> managers;
	
	public static void main(String[] args) {
		intialhrs();
		intialSoftwareEngineers();
		intialManagers();
		
		try (Scanner in = new Scanner(System.in)) {
			int choice = 0;
			
			do {
			System.out.println("Choose from below list: \n 1. HR\n 2. Software Engineer\n 3. Manager\n Enter 0 to exit. ");
			choice = in.nextInt();
			switch(choice) {
			
			case 1: printHrs();
			break;
			case 2: printEngineers();
			break;
			case 3: printManagers();
			break;
			case 0: System.out.println("Program exit...\n");
			break;
			
			default: if(choice !=0)System.out.println("Enter Valid input");
			}
			System.out.println("\n\n");
			}while(choice!=0);
		}
}
	
	
	public static void printHrs() {
		for(Hr hr: hrs) {
			System.out.println("Name:" + hr.getEmployee_name() );
			System.out.println("Employee ID:" + hr.getEmployee_id());
			System.out.println("Phone Number:" + hr.getEmployee_phone());
			System.out.println("Email ID:" + hr.getEmployee_mail());
			System.out.println("Department ID:" + hr.getDepartment_id() + "\n");
		}
		
	}
	
	public static void printEngineers() {
		for(SoftwareEngineer e: softwareEngineers) {
			System.out.println("Name:" + e.getEmployee_name() );
			System.out.println("Employee ID:" + e.getEmployee_id());
			System.out.println("Phone Number:" + e.getEmployee_phone());
			System.out.println("Email ID:" + e.getEmployee_mail());
			System.out.println("Team ID:" + e.getTeam_id());
			System.out.println("Grade:" + e.getGrade() + "\n");
		}
		
	}
	
	public static void printManagers() {
		for(Manager m: managers) {
			System.out.println("Name:" + m.getEmployee_name() );
			System.out.println("Employee ID:" + m.getEmployee_id());
			System.out.println("Phone Number:" + m.getEmployee_phone());
			System.out.println("Email ID:" + m.getEmployee_mail());
			System.out.println("Manager ID:" + m.getManager_id());
			System.out.println("Team Count:"  + m.getScrumTeamCount()+ "\n");
		}
		
	}
	
	public static void intialhrs() {
		hrs = new ArrayList<>();
		
		hrs.add(new Hr("Maha", "121", "87534567", "maha@gap.com", 20));
		hrs.add(new Hr("Devi", "122", "56827929", "devi@gap.com", 7));
		hrs.add(new Hr("Akhil", "123", "56701017", "akhil@gap.com", 12));
	
	}
	
	
	public static void intialSoftwareEngineers() {
		softwareEngineers = new ArrayList<>();
		
		softwareEngineers.add(new SoftwareEngineer("Sai", "100", "35678911", "sai@gap.com", 2 , 5));
		softwareEngineers.add(new SoftwareEngineer("Sumanth", "102", "873284982", "sumanth@gap.com", 7, 3));
		softwareEngineers.add(new SoftwareEngineer("Abhi", "103", "2892689", "abhi@gap.com", 25, 8));
	
	}
	
	
	public static void intialManagers() {
		managers = new ArrayList<>();
		
		managers.add(new Manager("akash", "200", "799300183", "akash@gap.com", 2 , 3));
		managers.add(new Manager("kiran", "292", "3899284922", "kiran@gap.com", 5, 1));
		managers.add(new Manager("Mili", "239", "73292010101", "mili@gap.com", 7, 2));
	
	}
	
	
	

}
