package LoginPage;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdText = new JTextField();
	JPasswordField passwordText = new JPasswordField();
	JLabel userIdLabel = new JLabel("user : ");
	JLabel passwordLabel = new JLabel("password : ");
	JLabel message = new JLabel();
	HashMap<String,String> logininfo = new HashMap<>();
	
	public LoginPage(HashMap<String,String> logininfoOrginal)
	{
		logininfo = logininfoOrginal ;
		
		userIdLabel.setBounds(50,100,75,25);
		passwordLabel.setBounds(50,150,75,25);
		message.setBounds(125,250,250,25);
		message.setFont(new Font(null,Font.ITALIC,25));
		
		userIdText.setBounds(125,100,200,25);
		passwordText.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton)
		{
			userIdText.setText("");
			passwordText.setText("");
			message.setText("");
		}
		
		if(e.getSource() == loginButton)
		{
			String id = userIdText.getText();
			String mdp = String.valueOf(passwordText.getPassword());
			if(logininfo.containsKey(id) && logininfo.get(id).equals(mdp))
			{
				message.setForeground(Color.GREEN);
				message.setText("Succes");
				JOptionPane.showMessageDialog(null, "Welcom");
			}
			else
			{
				message.setForeground(Color.RED);
				message.setText("Echec");
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
		
	}
	
}
