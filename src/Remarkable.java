import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String remarkable = JOptionPane.showInputDialog(null, "what is your name ?");
		if (remarkable.equals("inez")) {
			JOptionPane.showMessageDialog(null, "you have nice hair.");
		} else if (remarkable.equals("marc"))
			JOptionPane.showMessageDialog(null, "i like your shirt.");
		else if (remarkable.equals("josh"))
			JOptionPane.showMessageDialog(null, "i like your shoes");
		else if (remarkable.equals("jon"))
			JOptionPane.showMessageDialog(null, "where are you ?");
		else if (remarkable.equals("maran"))
			JOptionPane.showMessageDialog(null, "nice hair");
		else
			JOptionPane.showMessageDialog(null, "i don't know you.");

	}
}