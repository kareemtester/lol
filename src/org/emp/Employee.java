package org.emp;

public class Employee {
	private void EmployeeId() {
		System.out.println("Employee ID is : 3244");
	}
	
	private void EmployeeName() {
		System.out.println("Employee Name is kareem");
	}
	private void EmpDob() {
		System.out.println("Employee DOB is 24-02-1997");
	}
	private void EmpPhone() {
		System.out.println("Employee contact number is : 9566126981");
    }
	private void EmployeeEmail() {
		System.out.println("Employee Email is : kareemsheriff15@gmail.com");

	}
	private void EmployeeAddress() {
		System.out.println("Employee Address is : Perambur");
		System.out.println("code for branch A");
		System.out.println("to be merged with master");
		

	}
	
	public static void main(String[] args) {
		
		Employee a = new Employee();
		a.EmployeeName();
		a.EmployeeId();
		a.EmpDob();
		a.EmpPhone();
		a.EmployeeEmail();
		a.EmployeeAddress();
	}
	

}
