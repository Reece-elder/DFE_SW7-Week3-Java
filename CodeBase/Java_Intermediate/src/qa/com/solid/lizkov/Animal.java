package qa.com.solid.lizkov;

public class Animal {
	
	public void tryFlying(FlyingBird bird) {
		bird.fly();
	}
	
	public void tryFalling(FlightlessBird bird) {
		bird.fall();
	}

}
