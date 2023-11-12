import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payroll {

	private JFrame frame;
	private JTextField eName;
	private JTextField rateField;
	private JTextField hoursField;
	private JTextField days;
	private JTextField grossSalary;
	private JTextField taxField;
	private JTextField healthField;
	private JTextField sssField;
	private JTextField totalDeduct;
	private JTextField gsalary;
	private JTextField deduct;
	private JTextField netSalaryField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll window = new payroll();
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
	public payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(236, 11, 212, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(44, 46, 139, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		eName = new JTextField();
		eName.setBounds(132, 46, 123, 20);
		frame.getContentPane().add(eName);
		eName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Rate Per Hour:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(54, 74, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		rateField = new JTextField();
		rateField.setBounds(132, 71, 123, 20);
		frame.getContentPane().add(rateField);
		rateField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Hour Per Day:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(57, 99, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		hoursField = new JTextField();
		hoursField.setBounds(132, 94, 123, 20);
		frame.getContentPane().add(hoursField);
		hoursField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Number of days worked:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 124, 130, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		days = new JTextField();
		days.setBounds(132, 119, 123, 20);
		frame.getContentPane().add(days);
		days.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(33, 178, 178, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		grossSalary = new JTextField();
		grossSalary.setEditable(false);
		grossSalary.setBackground(new Color(240, 240, 240));
		grossSalary.setBounds(132, 175, 123, 20);
		frame.getContentPane().add(grossSalary);
		grossSalary.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_6.setForeground(new Color(214, 56, 123));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(281, 46, 167, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(265, 63, 146, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		taxField = new JTextField();
		taxField.setEditable(false);
		taxField.setBackground(new Color(240, 240, 240));
		taxField.setBounds(407, 60, 86, 20);
		frame.getContentPane().add(taxField);
		taxField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(335, 99, 139, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		healthField = new JTextField();
		healthField.setEditable(false);
		healthField.setBackground(new Color(240, 240, 240));
		healthField.setBounds(407, 94, 86, 20);
		frame.getContentPane().add(healthField);
		healthField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(365, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		sssField = new JTextField();
		sssField.setEditable(false);
		sssField.setBackground(new Color(240, 240, 240));
		sssField.setBounds(407, 130, 86, 20);
		frame.getContentPane().add(sssField);
		sssField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(295, 178, 128, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		totalDeduct = new JTextField();
		totalDeduct.setEditable(false);
		totalDeduct.setBackground(new Color(240, 240, 240));
		totalDeduct.setBounds(407, 175, 86, 20);
		frame.getContentPane().add(totalDeduct);
		totalDeduct.setColumns(10);
		
		JButton calculate = new JButton("Compute");
		calculate.setForeground(Color.white);
		calculate.setBackground(new Color(0, 79, 0));
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=eName.getText();
				int rate=Integer.valueOf(rateField.getText());
				int hours=Integer.valueOf(hoursField.getText());
				int numdays=Integer.valueOf(days.getText());
				int Gsalary=rate*hours*numdays;
				int Salary=Gsalary;
				int taxrate=(15*Gsalary)/100;
				int pilhealth=(5*Gsalary)/100;
				int sss=(2*Gsalary)/100;
				int deductions=taxrate+pilhealth+sss;
				int tdeducts=deductions;
				int netsalary=Gsalary-tdeducts;
				
				grossSalary.setText(String.valueOf(Gsalary));
				gsalary.setText(String.valueOf(Salary));
				taxField.setText(String.valueOf(taxrate));
				healthField.setText(String.valueOf(pilhealth));
				sssField.setText(String.valueOf(sss));
				totalDeduct.setText(String.valueOf(tdeducts));
				deduct.setText(String.valueOf(deductions));
				netSalaryField.setText(String.valueOf(netsalary));
				
			}
		});
		calculate.setBounds(334, 210, 89, 31);
		frame.getContentPane().add(calculate);
		
		JLabel lblNewLabel_11 = new JLabel("Gross Salary:");
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(525, 49, 96, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		gsalary = new JTextField();
		gsalary.setEditable(false);
		gsalary.setBackground(new Color(240, 240, 240));
		gsalary.setBounds(600, 46, 86, 20);
		frame.getContentPane().add(gsalary);
		gsalary.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Deduction:");
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(545, 77, 56, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		deduct = new JTextField();
		deduct.setEditable(false);
		deduct.setBackground(new Color(240, 240, 240));
		deduct.setBounds(600, 74, 86, 20);
		frame.getContentPane().add(deduct);
		deduct.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY:");
		lblNewLabel_13.setBounds(528, 178, 129, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		netSalaryField = new JTextField();
		netSalaryField.setEditable(false);
		netSalaryField.setBackground(new Color(240, 240, 240));
		netSalaryField.setBounds(600, 175, 86, 20);
		frame.getContentPane().add(netSalaryField);
		netSalaryField.setColumns(10);
	}
}
