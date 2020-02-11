package Polymorphism;

public class Person {
protected String name="Name not set";
private int age;

public Person() {
	name="noName";
	age=30;
}
public void showRole() {
	System.out.println(name+ " is a person");
}
public int getAge() {
	return age;
}
public void displayRole(Person p) {
	p.showRole();
}
}
