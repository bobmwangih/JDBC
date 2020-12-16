package model;

public class Student {
	private int admno;
	private String name;
	private String email;
	private String gender;
	
	public Student() {
		
	}
	
	
	public Student( String name, String gender,String email) {
		super();
		this.admno = 0;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}


	public int getAdmno() {
		return admno;
	}
	public void setAdmno(int admno) {
		this.admno = admno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
