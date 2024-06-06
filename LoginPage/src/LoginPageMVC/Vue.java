package LoginPageMVC;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Vue extends JFrame{

	Model m ;
	Controleur c ;
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdText = new JTextField();
	JPasswordField passwordText = new JPasswordField();
	JLabel userIdLabel = new JLabel("user : ");
	JLabel passwordLabel = new JLabel("password : ");
	JLabel message = new JLabel();
	
	
	public Vue(Model m , Controleur c)
	{
		this.m = m ;
		this.c = c ;
		
		userIdLabel.setBounds(50,100,75,25);
		passwordLabel.setBounds(50,150,75,25);
		message.setBounds(125,250,250,25);
		message.setFont(new Font(null,Font.ITALIC,25));
		
		userIdText.setBounds(125,100,200,25);
		passwordText.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton = c.setActionListner(loginButton);
		loginButton.setFocusable(false);
		
		resetButton.setBounds(225,200,100,25);
		resetButton = c.setActionListner(resetButton);
		resetButton.setFocusable(false);
		
		frame.add(userIdLabel);
		frame.add(passwordLabel);
		frame.add(message);
		frame.add(userIdText);
		frame.add(passwordText);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	
}
