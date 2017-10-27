import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog(null, "When is your birthday ?");
System.out.println(birthday);
if (birthday.equals("10/26")){
	JOptionPane.showMessageDialog(null, "Happy Birthday");
}  else {JOptionPane.showMessageDialog(null, "happy Unbirthday");



}
}
}
