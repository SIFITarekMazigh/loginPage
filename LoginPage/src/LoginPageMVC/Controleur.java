package LoginPageMVC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Controleur implements ActionListener{

	Model m ;
	Vue v ;
	
	public Controleur(Model m)
	{
		this.m = m ;
	}
	
	public void setVue(Vue v)
	{
		this.v = v ;
	}
	
	public JButton setActionListner(JButton b)
	{
		b.addActionListener(this);
		return b ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == v.resetButton)
		{
			v.userIdText.setText("");
			v.passwordText.setText("");
			v.message.setText("");
		}
		
		if(e.getSource() == v.loginButton)
		{
			String id = v.userIdText.getText();
			String mdp = String.valueOf(v.passwordText.getPassword());
			if(m.logininfo.containsKey(id) && m.logininfo.get(id).equals(mdp))
			{
				v.message.setForeground(Color.GREEN);
				v.message.setText("Succes");
				JOptionPane.showMessageDialog(null, "Welcom");
			}
			else
			{
				v.message.setForeground(Color.RED);
				v.message.setText("Echec");
				JOptionPane.showMessageDialog(null, "Error");
			}
		}
		
	}

}
