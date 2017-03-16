package myapp.model;

public class Contact {
	
	String employeeID,employeeName,employeeNo,homeNo,officeNo,email;
	
	public Contact(){
		
	}
	
	public Contact(String employeeID, String employeeName, String employeeNo, String homeNo, String officeNo,
			String email) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeNo = employeeNo;
		this.homeNo = homeNo;
		this.officeNo = officeNo;
		this.email = email;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
