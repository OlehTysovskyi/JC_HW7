package First_Task;

public class Cy_27 extends Plane implements Special_Powers{

	private int maxSpeed;
	private String color;
	
	Cy_27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}


	@Override
	public void turboBoost() {
		int boostSpeed = (int) (Math.random()*(200+1)) + maxSpeed;
		System.out.println("The plane's max speed is boosted to: " + boostSpeed + " km/hour");	
	}

	@Override
	public void Stels() {
		int stelsTime = (int) (Math.random()*(5+1) + 1);
		System.out.println("The plane will be in stels mode for: " + stelsTime + " minutes");
	}

	@Override
	public void nuclearStrike() {
		int countOfBombs = (int) (Math.random()*(10+1));
		if (countOfBombs == 1)
			System.out.println(countOfBombs + " nuclear bomb will be droped");
		else 
			System.out.println(countOfBombs + " nuclear bombs will be droped");
	}


}
