package models;

public class Student{
    // creation of instance variable
    private String username;
    private String password;
    

    // creation of public getter and setter --> for student ID
	public String getusername() {
		return this.username;
	}

	public void setpassword(String username) {
		this.username = username;
	}

    // creation of public getter and setter --> for student Name
	public String getpassword() {
		return this.password;
	}

	

    // creation of public getter and setter --> for student Age
	

    // creation of public getter and setter --> for student Address
	


    // creation of public constructor
    public Student(String username, String password){
        this.username = username;
        this.password = password;
      
    }

   

}