//Job.java
public class Job {
	private String role = "Systems Engineer";
	private long salary;
	private int id = 1001;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString(){
		return "Role: " + role + " Salary: " + salary + " ID: " + id;
	}
}