package jdc;

import java.awt.EventQueue;
import java.sql.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cat2form {

	private JFrame frame;
	private JTextField Name;
	private JTextField Usname;
	private JTextField pWord;
	private JTextField cPassword;
	private JTextField mail;
	private JTextField pNo;
	private JTextField dress;
	private final JButton btnClose = new JButton("Close");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cat2form window = new Cat2form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cat2form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(38, 11, 159, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(83, 48, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setBounds(63, 73, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setBounds(73, 108, 63, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password:");
		lblNewLabel_4.setBounds(20, 133, 118, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(86, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address:");
		lblNewLabel_6.setBounds(72, 218, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		Name = new JTextField();
		Name.setBounds(148, 48, 239, 20);
		frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		Usname = new JTextField();
		Usname.setBounds(148, 77, 239, 20);
		frame.getContentPane().add(Usname);
		Usname.setColumns(10);
		
		pWord = new JTextField();
		pWord.setBounds(148, 108, 239, 20);
		frame.getContentPane().add(pWord);
		pWord.setColumns(10);
		
		cPassword = new JTextField();
		cPassword.setBounds(148, 133, 239, 20);
		frame.getContentPane().add(cPassword);
		cPassword.setColumns(10);
		
		mail = new JTextField();
		mail.setBounds(148, 158, 239, 20);
		frame.getContentPane().add(mail);
		mail.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Phone:");
		lblNewLabel_7.setBounds(80, 193, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		pNo = new JTextField();
		pNo.setBounds(148, 189, 239, 20);
		frame.getContentPane().add(pNo);
		pNo.setColumns(10);
		
		dress = new JTextField();
		dress.setBounds(148, 218, 239, 20);
		frame.getContentPane().add(dress);
		dress.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=name.getText();
				String Username=Usname.getText();
				String Password=pWord.getText();
				String Email=mail.getText();
				String Phone=pNo.getText();
				String Address=dress.getText();
				String ConfirmPassword=cPassword.getText();
				
				
				
				 try {
	                    
	                    Class.forName("com.mysql.cj.jdbc.Driver");
	    				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cat2form","root","");
	    				String sql="select * from login where name=? AND Username=? AND Password=? AND Email=? AND Phone=? AND Address=?";
	    				PreparedStatement pst=con.prepareStatement(sql);
	    				pst.setString(1,Name);
	    				pst.setString(2,Username);
	    				pst.setString(3,Password);
	    				pst.setString(4,Email);
	    				pst.setString(5,Phone);
	    				pst.setString(6,Address);
	    				
	    				ResultSet rs=pst.executeQuery();
	                 
	                    

	                  

	                } catch(Exception e1){
						System.out.println(e1);
						}
			}
		});
		btnNewButton.setBounds(100, 301, 89, 23);
		frame.getContentPane().add(btnNewButton)
		btnNewButton.setBounds(91, 301, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(212, 301, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name.setText("");
				Usname.setText("");
				pWord.setText("");
				cPassword.setText("");
				mail.setText("");
				pNo.setText("");
				dress.setText("");
			}
		});
		btnClose.setBounds(332, 301, 97, 23);
		frame.getContentPane().add(btnClose);
	}
}
