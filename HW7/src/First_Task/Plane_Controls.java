package First_Task;

public class Plane_Controls{
	
	private int way;
	
	void moveUp() {
		this.way = (int) (Math.random()*500);
		System.out.println("Plane moved for "+ way + " km UP");
	}
	void moveDown() {
		this.way = (int) (Math.random()*500);
		System.out.println("Plane moved for "+ way + " km DOWN");
	}
	void moveRight() {
		this.way = (int) (Math.random()*500);
		System.out.println("Plane moved for "+ way + " km RIGHT");
	}
	void moveLeft() {
		this.way = (int) (Math.random()*500);
		System.out.println("Plane moved for "+ way + " km LEFT");
	}
}
