package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];

		// 3. use a for loop to initialize the robots.
		int x = 0;
		int y = 500;
		Random rad = new Random();

		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(100);
			rob[i].setX(x += 150);
			rob[i].setY(y);
		}
		boolean isracing = true;
		
		while (isracing == true) {
		for (int i = 0; i < rob.length; i++) {
			for (int a = 0; a < 5; a++) {
				int distance;
				distance = rad.nextInt(50);
				rob[i].move(distance);
				if (rob[i].getY() < 0) {
					isracing = false;
					JOptionPane.showMessageDialog(null, "Robot " + i + " won");
					i = 200;

					break;
					
				}
			}
		}
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}