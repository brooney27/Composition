//Person.java
public class Person {
	//composition has-a relationship
	private Job job;
	private Education edu = new Education();
	public Person(){
		this.job=new Job();
		job.setSalary(1000L);
	}
	public long getSalary() {
		return job.getSalary();
	}
	public Job getJob(){
		return job;
	}
	public Education getEdu(){
		return edu;
	}
}
