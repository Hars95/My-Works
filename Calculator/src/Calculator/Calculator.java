package Calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
//import javax.swing.SwingConstants;
import java.awt.Font;
//import java.awt.TextField;
//import javax.swing.UIManager;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JTextArea;
//import javax.swing.DropMode;
//import javax.swing.JTextField;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//private JTextArea textArea;
	double Firstone;
	double Second;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbDisplay = new JLabel("");
		lbDisplay.setBackground(Color.BLACK);
		lbDisplay.setFont(new Font("Calibri", Font.BOLD, 15));
		lbDisplay.setBounds(31, 38, 238, 48);
		contentPane.add(lbDisplay);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn2.getText();
				lbDisplay.setText(number);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 15));
		btn2.setBounds(91, 121, 58, 57);
		contentPane.add(btn2);
		
		JButton btn1_1 = new JButton("1");
		btn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn1_1.getText();
				lbDisplay.setText(number);
			}
		});
		btn1_1.setFont(new Font("Calibri", Font.BOLD, 15));
		btn1_1.setBounds(31, 121, 58, 57);
		contentPane.add(btn1_1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn4.getText();
				lbDisplay.setText(number);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 15));
		btn4.setBounds(31, 177, 58, 57);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn5.getText();
				lbDisplay.setText(number);
			}
		});
		btn5.setFont(new Font("Calibri", Font.BOLD, 15));
		btn5.setBounds(91, 177, 58, 57);
		contentPane.add(btn5);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn3.getText();
				lbDisplay.setText(number);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 15));
		btn3.setBounds(152, 121, 58, 57);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn6.getText();
				lbDisplay.setText(number);
			}
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 15));
		btn6.setBounds(152, 177, 58, 57);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn7.getText();
				lbDisplay.setText(number);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 15));
		btn7.setBounds(31, 235, 58, 57);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn8.getText();
				lbDisplay.setText(number);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 15));
		btn8.setBounds(91, 235, 58, 57);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn9.getText();
				lbDisplay.setText(number);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 15));
		btn9.setBounds(152, 235, 58, 57);
		contentPane.add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btnDot.getText();
				lbDisplay.setText(number);
			}
		});
		btnDot.setFont(new Font("Calibri", Font.BOLD, 19));
		btnDot.setBounds(152, 292, 58, 57);
		contentPane.add(btnDot);
		
		JButton btnML = new JButton("*");
		btnML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstone=Double.parseDouble(lbDisplay.getText());
				lbDisplay.setText("");
				operation="*";
			}
		});
		btnML.setFont(new Font("Calibri", Font.BOLD, 15));
		btnML.setBounds(211, 292, 58, 57);
		contentPane.add(btnML);
		
		JButton btnD = new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstone=Double.parseDouble(lbDisplay.getText());
				lbDisplay.setText("");
				operation="/";
			}
		});
		btnD.setFont(new Font("Calibri", Font.BOLD, 15));
		btnD.setBounds(211, 347, 58, 57);
		contentPane.add(btnD);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				Second=Double.parseDouble(lbDisplay.getText());
				if(operation=="+")
				{
					result=Firstone + Second;
					answer=String.format("%2f",result);
					lbDisplay.setText(answer);
				}
				else if(operation=="-")
				{
					result=Firstone - Second;
					answer=String.format("%2f",result);
					lbDisplay.setText(answer);
				}
				else if(operation=="*")
				{
					result=Firstone * Second;
					answer=String.format("%2f",result);
					lbDisplay.setText(answer);
				}
				else if(operation=="/")
				{
					result=Firstone / Second;
					answer=String.format("%2f",result);
					lbDisplay.setText(answer);
				}
				else if(operation=="%")
				{
					result=Firstone % Second;
					answer=String.format("%2f",result);
					lbDisplay.setText(answer);
				}
				
			}
		});
		btnEq.setFont(new Font("Calibri", Font.BOLD, 15));
		btnEq.setBounds(211, 121, 58, 57);
		contentPane.add(btnEq);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstone=Double.parseDouble(lbDisplay.getText());
				lbDisplay.setText("");
				operation="+";
			}
		});
		btnP.setFont(new Font("Calibri", Font.BOLD, 15));
		btnP.setBounds(211, 177, 58, 57);
		contentPane.add(btnP);
		
		JButton btnM = new JButton("-");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstone=Double.parseDouble(lbDisplay.getText());
				lbDisplay.setText("");
				operation="-";
			}
		});
		btnM.setFont(new Font("Calibri", Font.BOLD, 15));
		btnM.setBounds(211, 235, 58, 57);
		contentPane.add(btnM);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstone=Double.parseDouble(lbDisplay.getText());
				lbDisplay.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Calibri", Font.BOLD, 15));
		btnPercentage.setBounds(152, 347, 58, 57);
		contentPane.add(btnPercentage);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn0.getText();
				lbDisplay.setText(number);
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 15));
		btn0.setBounds(31, 292, 58, 57);
		contentPane.add(btn0);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= lbDisplay.getText()+btn00.getText();
				lbDisplay.setText(number);
			}
		});
		btn00.setFont(new Font("Calibri", Font.BOLD, 15));
		btn00.setBounds(91, 292, 58, 57);
		contentPane.add(btn00);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace="";
				if(lbDisplay.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(lbDisplay.getText());
					str.deleteCharAt(lbDisplay.getText().length()-1);
					backSpace=str.toString();
					lbDisplay.setText(backSpace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.BOLD, 15));
		btnB.setBounds(31, 347, 58, 57);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbDisplay.setText("");
			}
		});
		btnC.setFont(new Font("Calibri", Font.BOLD, 15));
		btnC.setBounds(91, 347, 58, 57);
		contentPane.add(btnC);
	}
}
