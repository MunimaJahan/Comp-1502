package debugger;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = y;
		this.y = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.getX() + " " + this.getY() + ")";
	}
	
	public boolean same (Point other) {
		
		if (this.getX() == other.getX() && 
				this.getY() == other.getY()) {
			return true;
		} else {
			return false;
		}
	}

}
