package src;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob=new Robot();
	public static void main(String[] args) {
	String draw= JOptionPane.showInputDialog("What shape do you want?");
	if (draw.equals("square")) {
	drawSquare();
	}	
		
	if (draw.equals("triangle")) {	
		drawTriangle();
	}
	
	if (draw.equals("circle")) {
	drawCircle();	
	}
	}
	
	
	 
public	static void drawSquare() {
for (int i = 0; i <4 ; i++) {
	rob.penDown();
	rob.setSpeed(30);
	rob.move(200);
	rob.turn(360/4);
}	
}	
	
public static void drawTriangle() {
for (int i = 0; i < 3; i++) {
	rob.penDown();
	rob.setSpeed(30);
	rob.move(200);
	rob.turn(180/3);
}	
}
	
public static void drawCircle() {
for (int i = 0; i < 360; i++) {
	rob.penDown();
	rob.setSpeed(1000000000);
	rob.move(1);
	rob.turn(360/360);
}
}

	
	
	
}
