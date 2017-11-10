import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
		String riddle = JOptionPane.showInputDialog(null, ("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?"));
		if (riddle.equals("meat")) {
			score += 1;
			JOptionPane.showMessageDialog(null, ("correct"));
		} else {
			JOptionPane.showMessageDialog(null, ("incorrect"));
			score += 0;
		}
Sting riddles = JOptionPane.showInputDialog(null, ("Take off my skin - I won't cry, but you will! What am I?"));
	if(riddles.equals("onion"));
	}
}