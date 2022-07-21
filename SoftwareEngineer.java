package source;

public class SoftwareEngineer extends Employee{
	
	private int grade;
	private int team_id;
	
	
	public SoftwareEngineer(String employee_name, String employee_id, String employee_phone, String employee_mail, int grade, int team_id) {
		super(employee_name, employee_id, employee_phone, employee_mail);
		this.grade = grade;
		this.team_id = team_id;
	}

	
	@Override
	public void work() {
		System.out.println("Working on developments....");
	}

	
	@Override
	public void leave() {
		System.out.println("Leaving coding...");	
	}

	
	@Override
	public void travel() {
		System.out.println("Software Engineer on tour...");	
	}
	
	
	public void debug() {
		System.out.println("Engineer working on bugs");
	}

	
	public int getGrade() {
		return grade;
	}

	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	public int getTeam_id() {
		return team_id;
	}

	
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	
}
