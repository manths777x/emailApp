package emailApp;

import java.util.Scanner;

public class email {

	private String fName;
	private String lName;
	private String dept;
	private String email;
	private String companySuffix = "spigenpvt.com";
	private String password;
	private int mailCapacity = 700;
	private int passlength = 8;
	private String altMail;

	// Constructor name info

	public email(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		// method of asking deptment
		this.dept = setDept();
		
		// call method for random password
		this.password = radomPassword(passlength);
		
		// Generation of Email
		email = fName.toLowerCase() + "." + lName.toLowerCase() + "@" + dept + "." + companySuffix;

	}

	// Dept. info
	private String setDept() {
		System.out.println("New Worker Deptment Code: \n 1- IT\n 2- Sale\n 3- Account\n 4 Finance\n 5 other ");

		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();

		if (deptChoice == 1) {
			return "it";
		} else if (deptChoice == 2) {
			return "sales";
		} else if (deptChoice == 3) {
			return "acc";
		} else if (deptChoice == 4) {
			return "fin";
		} else if (deptChoice == 5) {
			return "oth";
		} else {
			return "oth";
		}

	}

	// Generate random password
	private String radomPassword(int length) {

		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&";
		char[] password = new char[length];

		for (int i = 0; i < length; i++) {

			int rand1 = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand1);

		}

		return new String(password);
	}

	// Setting mailbox capacity

	public void setMailCapacity(int capacity) {
		this.mailCapacity = capacity;
	}

	// Alternate email

	public void setalternateEmail(String altmail) {

		this.altMail = altmail;
	}

	// Change Password
	public void setpassword(String Passwordnew) {
		this.password = Passwordnew;
	}

	public int getMailCapacity() {
		return mailCapacity;
	}

	public String getalternateEmail() {
		return altMail;
	}

	public String getpassword() {
		return password;
	}

	
	public String showInfo() {
		return " Employee Name : " + fName + " " + lName + 
				"\n Department : " + dept +
				"\n Official Email : " + email + 
				"\n Password : " + password + 
				"\n Mail box Capacity : " + mailCapacity + " MB" + 
				"\n alternate Email : " + altMail;
	}
}
