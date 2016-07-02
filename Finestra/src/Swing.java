import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Swing {
	public void finestra(){
		//aso dins d'un main
		JFrame fin = new JFrame("Demo application");
		fin.setSize(300, 150);
		fin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fin.setVisible(true);
		fin.setResizable(false);
		components(fin);
	}
	public void text(JFrame fin,String m){
		//text
		JLabel text = new JLabel(m);
		text.setBounds(10, 10, 80, 25);
		fin.add(text);	
	}
	public void campText(JFrame fin){
		//on escriu l'usuari
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		fin.add(userText);
	}
	public void contrasenya(JFrame fin){
		//lloc per ecriure contrasenyes
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		fin.add(passwordText);
	}
	public void boto(JFrame fin,String m){
		//boto
		JButton boto = new JButton(m);
		boto.setBounds(10, 80, 80, 25);
		fin.add(boto);

	}
	public void botoListen(JFrame fin,String m){
		//boto
		JButton boto = new JButton("TextBoto");
		boto.setBounds(10, 80, 80, 25);
		fin.add(boto);
		//Listener

		ActionListener myButtonListener = new MyButtonListener();
		boto.addActionListener(myButtonListener);
		boto.addActionListener(myButtonListener);
	}
	public void components(JFrame fin){
		fin.setLayout(null);
		//text
		JLabel text = new JLabel("Text");
		text.setBounds(10, 10, 80, 25);
		fin.add(text);
		//on escriu l'usuari
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		fin.add(userText);
		//lloc per ecriure contrasenyes
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		fin.add(passwordText);
		//boto
		JButton boto = new JButton("TextBoto");
		boto.setBounds(10, 80, 80, 25);
		fin.add(boto);
		//Listener

		ActionListener myButtonListener = new MyButtonListener();
		boto.addActionListener(myButtonListener);
		boto.addActionListener(myButtonListener);

	}
	//listener
	public class MyButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			JOptionPane.showMessageDialog(source, source.getText() + " button has been pressed");
		}
	}

	//comprovar que lo introduit es un numero
	private static boolean isNumber(String n) {
		//introdueixes un isNumber(nom del string)
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
