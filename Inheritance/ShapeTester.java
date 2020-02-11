package inheritance;

public class ShapeTester 
{ 
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
      r.setName("NewRectangle");
      r.display();
      c2.computeArea();
      c2.computePerimeter();
      c2.display();
      
      c2.setRadius(4.0);
      c2.computeArea();
      c2.computePerimeter();
      c2.display();
      s.setRadius(3.0);
   } 
}
