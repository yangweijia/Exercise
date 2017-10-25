package school;

import java.io.Serializable;

public class SchoolBean implements Serializable{
	private String name;
	private String school;
	
	public void setName(String name) {
		this.name=name;		
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public String getName() {
		return this.name;
	}
	 public String getSchool() {
		 return this.school;
	 }
	

}
