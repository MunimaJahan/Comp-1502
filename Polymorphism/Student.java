package Polymorphism;

public class Student extends Person {
	private int id;
public Student(String s, int a) {
	name=s;
	id=a;
}
public void showRole() {
	System.out.println(name+" is a student"+ " age is "+getAge());
}
}
