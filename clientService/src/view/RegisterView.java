package view;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame {

	private JPanel panel;
	private JLabel username,password;
	private JPasswordField pass;
	private JTextField userName;
	private JButton log;
	public RegisterView() {
		super("Register");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(320,170);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		this.add(panel);
		 
		setPanel();
	}
	
	public String getUsername(){
		return userName.getText();
	}
	
	public String getPassword(){
		return pass.getText();
	}
	
	public void registerListener(ActionListener a){
		log.addActionListener(a);
	}
	
	public void closePanel() {
		this.dispose();
	}
	
	public void setPanel(){
		
		username = new JLabel("Username:");
		username.setBounds(10,20,90,30);
		
		userName = new JTextField();
		userName.setBounds(90,23,200,25);
		
		password = new JLabel("Password:");
		password.setBounds(10,50,90,30);
		
		pass = new JPasswordField();
		pass.setBounds(90,53,200,25);
		
		log = new JButton("Register");
		log.setBounds(110,90,100,30);
		log.setBackground(new Color(255, 204, 255));
		log.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
	
		panel.setBackground(new Color(220, 243, 243));
		panel.setLayout(null);
		panel.setSize(320,170);
		panel.add(username);
		panel.add(userName);
		panel.add(password);
		panel.add(pass);
		panel.add(log);
	}

}
