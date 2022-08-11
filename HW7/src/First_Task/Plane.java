package First_Task;

public abstract class Plane extends Plane_Controls {

	private int length;
	private int width;
	private int weight;
	
	Plane (int length, int width, int weight){
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	
	void engineLaunch() {
		int takeOffTime = (int) (Math.random()*(66+1)) + 20;
		System.out.println("There are " + takeOffTime + " seconds left before the plane takes off");
	}
	
	void planeTakeOff() {
		int powerReserve = (int) (Math.random()*1000) + 100;
		System.out.println("The plane will fly " + powerReserve + " kilometers");
	}
	
	void planeLanding() {
		System.out.println("The plane is going to land");
	}
		
}
