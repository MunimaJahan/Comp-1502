package Polymorphism;

public class Employee extends Person{
	private double salary;
	public Employee(String n, double s) {
		name=n;
		salary=s;
	}
	public void showRole() {
		System.out.println(name+" is an employee"+ " salary: 3000");
	}
}
