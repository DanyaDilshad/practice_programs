package source;

public class Hr extends Employee{

	private int department_id;
	
	public Hr(String employee_name, String employee_id, String employee_phone, String employee_mail, int department_id) {
		super(employee_name, employee_id, employee_phone, employee_mail);
		this.department_id = department_id;
	}



	@Override
	public void work() {
		System.out.println("Perfoming Human Resourses...");
		
	}
	

	@Override
	public void leave() {
		System.out.println("Leaving Human Resourses...");	
	}

	
	@Override
	public void travel() {	
		System.out.println("HR is travelling...");
	}



	public int getDepartment_id() {
		return department_id;
	}



	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	
}

