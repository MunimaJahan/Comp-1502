package inheritance;

public class TestPolymorphism {
	
	   public static void main(String args[]) 
	   { 
	      Shape s = new Shape(); 
	      Rectangle r = new Rectangle(2.0, 3.0); 
	      Circle c = new Circle(4.0);  
	      Circle c2=new Circle("Circle2",3.0);

	      r.computeArea(); 
	      r.computePerimeter(); 
	      c.computeArea(); 
	      c.computePerimeter(); 
	      r.display(); 
	      c.display(); 
	      s.display(); 
	      //c=s;
	      s=c2;
	      s.display();
	      //Cannot access childs method
	      //s.computePerimeter();
	      
	   } 
	
}
