package source;

public class Manager extends Employee {

	private int manager_id;
	private int scrumTeamCount;
	
	
	public Manager(String employee_name, String employee_id, String employee_phone, String employee_mail, int manager_id, int scrumTeamCount) {
		super(employee_name, employee_id, employee_phone, employee_mail);
		this.manager_id = manager_id;
		this.scrumTeamCount = scrumTeamCount;
		
	}

	@Override
	public void work() {
		System.out.println("Guiding the team...");
		
	}

	@Override
	public void leave() {
		System.out.println("Manager is on leave...");
	}

	@Override
	public void travel() {
		System.out.println("Manager is travelling...");
		
	}

	public void meeting() {
		System.out.println("Manager is in the meeting...");
	}
	
	
	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getScrumTeamCount() {
		return scrumTeamCount;
	}

	public void setScrumTeamCount(int scrumTeamCount) {
		this.scrumTeamCount = scrumTeamCount;
	}
	

}
