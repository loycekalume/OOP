package guiassignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Assignment {

	private JFrame frame;
	private JTextField hoursDay;
	private JTextField name;
	private JTextField grossS;
	private JTextField hpDay;
	private JTextField tDeduction;
	private JTextField tax;
	private JTextField health;
	private JTextField sS;
	private JTextField gS;
	private JTextField deduct;
	private JTextField hWorked;
	private JTextField netSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment window = new Assignment();
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
	public Assignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 796, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setBounds(133, 11, 212, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rate Per Hour:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(79, 84, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hour Per Day:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(79, 115, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of days worked:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 140, 155, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GROSS SALARY:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 196, 98, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(332, 56, 164, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TAX 15% od Monthly Wage:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(256, 84, 156, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Philhealth 5%:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(287, 115, 125, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SSS 2%:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setBounds(353, 140, 59, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(260, 196, 125, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Gross Salary:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setBounds(583, 56, 76, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Deduction:");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(577, 84, 82, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		hoursDay = new JTextField();
		hoursDay.setBounds(175, 81, 86, 20);
		frame.getContentPane().add(hoursDay);
		hoursDay.setColumns(10);
		
		name = new JTextField();
		name.setBounds(175, 53, 86, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		grossS = new JTextField();
		grossS.setEditable(false);
		grossS.setBounds(134, 193, 86, 20);
		frame.getContentPane().add(grossS);
		grossS.setColumns(10);
		
		hpDay = new JTextField();
		hpDay.setBounds(175, 112, 86, 20);
		frame.getContentPane().add(hpDay);
		hpDay.setColumns(10);
		
		tDeduction = new JTextField();
		tDeduction.setEditable(false);
		tDeduction.setBounds(402, 193, 86, 20);
		frame.getContentPane().add(tDeduction);
		tDeduction.setColumns(10);
		
		tax = new JTextField();
		tax.setEditable(false);
		tax.setBounds(422, 81, 86, 20);
		frame.getContentPane().add(tax);
		tax.setColumns(10);
		
		health = new JTextField();
		health.setEditable(false);
		health.setBounds(422, 112, 86, 20);
		frame.getContentPane().add(health);
		health.setColumns(10);
		
		sS = new JTextField();
		sS.setEditable(false);
		sS.setBounds(422, 137, 86, 20);
		frame.getContentPane().add(sS);
		sS.setColumns(10);
		
		gS = new JTextField();
		gS.setEditable(false);
		gS.setBounds(669, 53, 86, 20);
		frame.getContentPane().add(gS);
		gS.setColumns(10);
		
		deduct = new JTextField();
		deduct.setEditable(false);
		deduct.setBounds(669, 81, 86, 20);
		frame.getContentPane().add(deduct);
		deduct.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Employee Name:");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setBounds(61, 56, 104, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		hWorked = new JTextField();
		hWorked.setBounds(175, 137, 86, 20);
		frame.getContentPane().add(hWorked);
		hWorked.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(570, 196, 89, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		netSalary = new JTextField();
		netSalary.setEditable(false);
		netSalary.setBounds(669, 193, 86, 20);
		frame.getContentPane().add(netSalary);
		netSalary.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 255), 4));
		btnNewButton.setBackground(new Color(64, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hourspDay,noofweekDays;
				int ratepHour,salary,taxy,gross,deductions,netS,ssS,healthy,net;
				String employeeName;
				employeeName=name.getText();
				hourspDay=Integer.valueOf(hpDay.getText());
				noofweekDays=Integer.valueOf(hWorked.getText());
				ratepHour=Integer.valueOf(hoursDay.getText());
				
				salary=(hourspDay*noofweekDays*ratepHour);
				taxy=(int)(0.15*salary);
				 ssS=(int)(0.02*salary);
				 healthy=(int)(0.05*salary);
				 deductions=taxy+ssS+healthy;
				 net=salary-deductions;
				 
				 grossS.setText(String.valueOf(salary));
				 tax.setText(String.valueOf(taxy));
				 health.setText(String.valueOf(healthy));
				 sS.setText(String.valueOf(ssS));
				 tDeduction.setText(String.valueOf(deductions));
				 gS.setText(String.valueOf(salary));
				deduct.setText(String.valueOf(deductions));
				netSalary.setText(String.valueOf(net));
			}
		});
		btnNewButton.setBounds(332, 229, 123, 40);
		frame.getContentPane().add(btnNewButton);
	}

}
