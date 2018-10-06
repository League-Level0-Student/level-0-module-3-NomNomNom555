
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setX(30);
		rob.setPenColor(Color.YELLOW);
		rob.penDown();
		rob.setSpeed(50);
		// 2. Make the robot draw a star shape. Hint: 144.
		rob.turn(17);
		for(int j=1; j<=17; j++) {
		for(int i=1; i<=5;i++) {
		rob.move(30);
		rob.turn(144);
		}
		rob.turn(73);
		rob.penUp();
		rob.move(50);
		rob.turn(287);
		rob.penDown();		
		}
		rob.penUp();
		rob.turn(200);
		rob.move(200);
		rob.turn(60);
		rob.move(200);
		for(int k=1; k<=40;k++) {
		rob.turn(360);
		}
		// 3. Set the size of the star to 30.
		
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * // You also need to show the robot to see the result of this line.
		 * Hint: The distance between stars is 50.
		 */

	}

}
