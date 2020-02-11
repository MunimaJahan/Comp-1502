package inheritance;

public class Shape
{ // fields 
   String name; 
    private double area, perimeter; 
   // constructor 
   public Shape() 
   { 
      name = "undetermined"; 
      area = perimeter = 0; 
   } 
   public Shape(String name) {
	   this.name=name;
   }
   // methods 
   public void setName() {
	   name="Not defined";
   }
   public void display() 
   { 
      System.out.println("Name: " + name); 
      System.out.println("Area: " + area); 
      System.out.println("Perimeter: " + perimeter); 
   } 
   public void computeArea() 
   { 
      System.out.println("Invalid area"); 
   } 
   public void computePerimeter() 
   { 
	   System.out.println("Invalid perimeter"); 
   } 
}