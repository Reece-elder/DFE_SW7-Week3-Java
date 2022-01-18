package qa.com.main;

import qa.com.designPattern.runner.DesRunner;
import qa.com.solid.runner.SubRunner;

public class Runner {
	
	public static void main(String[] args) {
//		SubRunner exercise = new SubRunner();
//		exercise.task();
//		exercise.openClosed();
//		exercise.dependency();
		DesRunner exercise = new DesRunner();
		exercise.builder();
		exercise.adapter();
	}

}
