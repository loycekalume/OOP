package guiassignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui2 {

	private JFrame frmGeorgetownCleaningServicesemployee;
	private JTextField name;
	private JTextField salary;
	private JTextField fMon;
	private JTextField fTue;
	private JTextField fWed;
	private JTextField fThur;
	private JTextField fFri;
	private JTextField fSat;
	private JTextField fSun;
	private JTextField sMon;
	private JTextField sTue;
	private JTextField sWed;
	private JTextField sThur;
	private JTextField sFri;
	private JTextField sSat;
	private JTextField sSun;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_13;
	private JTextField rHrs;
	private JTextField oHrs;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JTextField rAmount;
	private JTextField oAmount;
	private JLabel lblNewLabel_16;
	private JTextField nPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui2 window = new Gui2();
					window.frmGeorgetownCleaningServicesemployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServicesemployee = new JFrame();
		frmGeorgetownCleaningServicesemployee.getContentPane().setBackground(new Color(245, 245, 220));
		frmGeorgetownCleaningServicesemployee.setBackground(new Color(0, 0, 255));
		frmGeorgetownCleaningServicesemployee.setTitle("Georgetown Cleaning Services-Employee Payroll");
		frmGeorgetownCleaningServicesemployee.setBounds(100, 100, 848, 441);
		frmGeorgetownCleaningServicesemployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServicesemployee.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee name:");
		lblNewLabel_1.setBounds(43, 48, 124, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(132, 45, 233, 20);
		name.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hourly Salary:");
		lblNewLabel_2.setBounds(405, 48, 111, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_2);
		
		salary = new JTextField();
		salary.setBounds(501, 45, 111, 20);
		salary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(salary);
		salary.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setBounds(132, 131, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setBounds(219, 131, 86, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setBounds(332, 131, 86, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setBounds(442, 131, 74, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setBounds(554, 131, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setBounds(743, 131, 66, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("First Week:");
		lblNewLabel_11.setBounds(27, 174, 85, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_11);
		
		fMon = new JTextField();
		fMon.setBounds(110, 171, 86, 20);
		fMon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fMon);
		fMon.setColumns(10);
		
		fTue = new JTextField();
		fTue.setBounds(219, 171, 86, 20);
		fTue.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fTue);
		fTue.setColumns(10);
		
		fWed = new JTextField();
		fWed.setBounds(332, 171, 86, 20);
		fWed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fWed);
		fWed.setColumns(10);
		
		fThur = new JTextField();
		fThur.setBounds(442, 171, 86, 20);
		fThur.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fThur);
		fThur.setColumns(10);
		
		fFri = new JTextField();
		fFri.setBounds(539, 171, 86, 20);
		fFri.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fFri);
		fFri.setColumns(10);
		
		fSat = new JTextField();
		fSat.setBounds(635, 171, 86, 20);
		fSat.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fSat);
		fSat.setColumns(10);
		
		fSun = new JTextField();
		fSun.setBounds(743, 171, 59, 20);
		fSun.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fSun);
		fSun.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Second Week:");
		lblNewLabel_12.setBounds(26, 217, 86, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_12);
		
		sMon = new JTextField();
		sMon.setBounds(110, 214, 86, 20);
		sMon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sMon);
		sMon.setColumns(10);
		
		sTue = new JTextField();
		sTue.setBounds(219, 214, 86, 20);
		sTue.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sTue);
		sTue.setColumns(10);
		
		sWed = new JTextField();
		sWed.setBounds(332, 214, 86, 20);
		sWed.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sWed);
		sWed.setColumns(10);
		
		sThur = new JTextField();
		sThur.setBounds(442, 214, 86, 20);
		sThur.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sThur);
		sThur.setColumns(10);
		
		sFri = new JTextField();
		sFri.setBounds(539, 214, 86, 20);
		sFri.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sFri);
		sFri.setColumns(10);
		
		sSat = new JTextField();
		sSat.setBounds(635, 214, 86, 20);
		sSat.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sSat);
		sSat.setColumns(10);
		
		sSun = new JTextField();
		sSun.setBounds(743, 214, 59, 20);
		sSun.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sSun);
		sSun.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(10, 11, 812, 73);
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(10, 108, 812, 152);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setBounds(619, 22, 74, 14);
		panel_1.add(lblNewLabel_9);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBounds(10, 271, 812, 106);
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Regular:");
		lblNewLabel_3.setBounds(122, 50, 65, 14);
		panel_2.add(lblNewLabel_3);
		
		lblNewLabel_13 = new JLabel("Overtime:");
		lblNewLabel_13.setBounds(111, 81, 76, 14);
		panel_2.add(lblNewLabel_13);
		
		rHrs = new JTextField();
		rHrs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		rHrs.setBounds(178, 47, 59, 20);
		panel_2.add(rHrs);
		rHrs.setColumns(10);
		
		oHrs = new JTextField();
		oHrs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		oHrs.setBounds(178, 78, 59, 20);
		panel_2.add(oHrs);
		oHrs.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Hours");
		lblNewLabel_14.setBounds(191, 25, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Amount");
		lblNewLabel_15.setBounds(295, 25, 46, 14);
		panel_2.add(lblNewLabel_15);
		
		rAmount = new JTextField();
		rAmount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		rAmount.setBounds(282, 47, 59, 20);
		panel_2.add(rAmount);
		rAmount.setColumns(10);
		
		oAmount = new JTextField();
		oAmount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		oAmount.setBounds(282, 78, 59, 20);
		panel_2.add(oAmount);
		oAmount.setColumns(10);
		
		lblNewLabel_16 = new JLabel("Net pay:");
		lblNewLabel_16.setBounds(447, 67, 76, 14);
		panel_2.add(lblNewLabel_16);
		
		nPay = new JTextField();
		nPay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		nPay.setBounds(533, 64, 86, 20);
		panel_2.add(nPay);
		nPay.setColumns(10);
		
		JButton btnNewButton = new JButton("Processing It");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Ename;
				double hsalary,rh,rA,oH,oA,nePay;
				oH=0;
				rh=0;
				double week[][]=new double[2][7];
				Ename=name.getText();
				hsalary=Double.valueOf(salary.getText());
				week[0][0]=Double.valueOf(fMon.getText());
				week[0][1]=Double.valueOf(fTue.getText());
				week[0][2]=Double.valueOf(fWed.getText());
				week[0][3]=Double.valueOf(fThur.getText());
				week[0][4]=Double.valueOf(fFri.getText());
				week[0][5]=Double.valueOf(fSat.getText());
				week[0][6]=Double.valueOf(fSun.getText());
				week[1][0]=Double.valueOf(sMon.getText());
				week[1][1]=Double.valueOf(sTue.getText());
				week[1][2]=Double.valueOf(sWed.getText());
				week[1][3]=Double.valueOf(sThur.getText());
				week[1][4]=Double.valueOf(sFri.getText());
				week[1][5]=Double.valueOf(sSat.getText());
				week[1][6]=Double.valueOf(sSun.getText());
				for(int i=0; i<2; i++) {
					for(int j=0; j<7; j++) {
						if(week[i][j]<=8) {
							rh+=week[i][j];
				}
						else {rh+=8;
						oH+=(week[i][j]-8);
							
						}
					
				}
			}
				rA=rh*hsalary;
				oA=oH*hsalary;
				nePay=rA+oA;
				
				rHrs.setText(String.valueOf(rh));
				oHrs.setText(String.valueOf(oH));
				rAmount.setText(String.valueOf(rA));
				oAmount.setText(String.valueOf(oA));
				nPay.setText(String.valueOf(nePay));
			}
		});
		btnNewButton.setBackground(new Color(245, 245, 220));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(10, 25, 100, 56);
		panel_2.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton_1.setBackground(new Color(245, 245, 220));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(682, 25, 89, 56);
		panel_2.add(btnNewButton_1);
		
	}
}
