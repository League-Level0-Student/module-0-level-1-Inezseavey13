import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint0 {
	public static void main(String[] args) {
	String Color =	JOptionPane.showInputDialog(null,"What is your favorite color?");
JOptionPane.showMessageDialog(null,Color+" is also my favorite color" );
	Robot larry = new Robot();
	larry.penDown();
	larry.setSpeed(100);
	larry.turn(60);
	larry.move(100);
	larry.turn(60);
	larry.move(100);
	larry.turn(150);
	larry.move(200);
	}

}





