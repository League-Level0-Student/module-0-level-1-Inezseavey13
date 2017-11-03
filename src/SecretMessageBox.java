import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String passcode = "15";
		String message = JOptionPane.showInputDialog(null,"type a secret message");
		String guess = JOptionPane.showInputDialog(null,"try to guess the passcode");
		if (guess.equals(passcode)) {
			JOptionPane.showMessageDialog(null, message);}
			else 
				JOptionPane.showMessageDialog(null, "INTRUDER!!");
		
		
		
	}
}