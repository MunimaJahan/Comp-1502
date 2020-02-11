package inheritance;

public class Rectangle extends Shape 
{  // fields 
   double length, width; 
   // constructors
   public Rectangle(String name)
   {
      super.name=name;
      length = width = 0;
   }
   public Rectangle(double _length, double _width) 
   { 
      name = "Rectangle"; 
      length = _length; 
      width = _width; 
   } 
   // method overloading
   public void setName(String n) {
	   name=n;
   }
   //method overridding
   public void computeArea() 
   { 
      area = length * width; 
   } 
   public void computePerimeter() 
   { 
      perimeter = 2*(length + width); 
   } 
}