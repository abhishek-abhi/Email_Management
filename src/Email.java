import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int emailCapacity;
	private String alternateEmail;
	private String companyName= "companyname";
	
	//This is the constructor
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email registered: "+this.firstName+" "+this.lastName);
	     
		String dept = setDepartment();
		System.out.println("Your department is : "+dept);
	    this.password=randomPassword(10);
	    System.out.println("Your Password is: "+this.password); 
	    this.email=createEmail(this.firstName, this.lastName, this.companyName);
	}
	
	//This method is used to set the Email capacity
	
	public void setEmailCapacity(int capacity) {
		this.emailCapacity=capacity;
	}
	
	// This method is used to get the Email capacity
	public int getEmailCapacity() {
		return this.emailCapacity;
	}
	
	// This method is used to set alternative email
	public void setAltEmail(String emails) {
		this.alternateEmail=emails;
	}
	
	// This method is used to get the alternative email
	public String getAltEmail() {
		return this.alternateEmail;
	}
	
	// This method is used to print the details of the person
	public void showInfo(String firstName, String lastName) {
		new Email(firstName, lastName);
	}
	
	// This method is used to set the department of the person
	private String setDepartment() {
		System.out.println("Enter the suitable option :\n 1>> Marketing"
				+ "\n 2>> Sales \n 3>> Product Development \n 4>> Designing Strategy");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
			return "Marketing";
		else if(choice == 2)
			return "Sales";
		else if(choice == 3)
			return "Product Development";
		else if (choice == 4)
			return "Designing planning";
		else
			return null;
	}
	
	//This method is used to generate a random password of desired length
	private String randomPassword(int ln) {
		String passwordrange = "QWERTYUIOPLKJHGFDSAZXCVBNM!@##$%^&&*+-";
		char []password = new char[ln];
		for(int i=0;i<ln;i++) {
			int in = (int)(Math.random()*passwordrange.length());
			password[i]=passwordrange.charAt(in);
		}
		return new String(password);
	}
	
	// This method is used to create an email
	private String createEmail(String firstName, String lastName, String companyName) {
		String an="";
		an+=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companyName +".com";
	    return an;
	}
}
