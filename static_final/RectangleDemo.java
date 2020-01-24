
class RectangleDemo {
	public static void createRectangle(Rectangle r1) {
		Rectangle r3=new Rectangle();
		//r3=r1;
		r3.length=50;
		r1=r3;
	}
		  public static void main(String args[]) {

		  Rectangle r1 = new Rectangle();
		  Rectangle r2 = r1;

		  r1.length = 10;
		  r2.length = 20;
		  r2=null;
		  createRectangle(r1);
		  System.out.println("Value of R1's Length : " + r1.length);
		  System.out.println("Value of R2's Length : " + r2);

		  }
		}