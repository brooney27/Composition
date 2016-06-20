
public class Education {
	String[] schools = {"Kimball Hill", "Central Road", "Carl Sandburg","RMHS", "Illinois"};
	
	public String toString(){
		String output = "";
		for(int i = 0; i < schools.length;i++){
			output = output + " " + schools[i];
		}
		return output;
	}
}
