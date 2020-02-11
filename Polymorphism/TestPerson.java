package Polymorphism;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Student s=new Student("MJ",20);
		Employee e=new Employee("Jahan",3000.00);
		p.showRole();
		//s.showRole();
		//p=s;
		//p.showRole();
		//p=e;
		//e.showRole();
		p.displayRole(p);
		p.displayRole(s);
		p.displayRole(e);

	}

}
