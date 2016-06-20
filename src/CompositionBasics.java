//CompositionBasics.java
public class CompositionBasics {
	public static void main(String[] args) {
		Person bobby = new Person();
		System.out.println(bobby.getJob().toString());
		System.out.println(bobby.getEdu().toString());
	}
}
