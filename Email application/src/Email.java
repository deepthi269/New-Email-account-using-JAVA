import java.util.Scanner;

// You are an IT specialist and you need to create a new email id for the worker

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String emailid;
	private int defaultPassword = 8;
	private int mailboxcapacity = 500;
	private String alternateEmail;
	private String companysuffix = "abc.com";

	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created :" +this.firstName + "  " + this.lastName);
		
		// call a method asking for the department and return the dept
		this.department = setDepartment();
		System.out.println("Department is " +this.department);
		
		// call a method that returns a random password
		this.password = randompassword(defaultPassword);
		System.out.println(this.password);
		
		// combine elements to generate email 
		emailid = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"." + companysuffix;
		System.out.println("ypir Email id is " +emailid);
		
		
		
	}
	//Ask for department
	private String setDepartment() {
		System.out.println("Enter the department from one of the following options :\n 1.Sale\n 2.Development\n 3.Accounting\n 0.None\nEnter the dept code");
		Scanner in = new Scanner(System.in);
		int deptchoice = in.nextInt();
		if(deptchoice == 1) { return  "Sales"; }
		else if (deptchoice == 2) { return  "Dev";}
		else if (deptchoice == 3){ return  "Acct";}
		else if(deptchoice == 0) { return " ";}
		return department;			
		
	}
	
	//Generate a random password
	private String randompassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);
				
		}
		
		return new String(password);
		
		
	}
	
	
	// set the mailbox capacity 
	//ENCAPSULATION DEFINED HERE
	public void setmailboxcapacity(int capacity) {
		this.mailboxcapacity = capacity;
		
	}
	
	
	// Set the alternate email
	public void setalternateemail(String altemail) {
		this.alternateEmail = altemail;
		
	}
	// Change the password
	public void changepassword(String changepassword) {
		this.password = changepassword;
		
	}
	// Data Binding using GET methods
	public int getmailboxcapacity() {return mailboxcapacity;}
	public String getalternatemail() {return alternateEmail;}
	public String getpassowrd() {return  password;}
	
	public String displayinfo() {
		return "DISPLAY NAME  " + firstName +" " +lastName +
				"\nCOMPANY EMAIL  " + emailid +
				"\nMAIL BOX CAPACITY  " + mailboxcapacity + " MB";
	}
	
}
