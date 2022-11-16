package telaCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField visor;
	double n1, n2, resul;
	String opcao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(255, 0, 0));
		frmCalculadora.setFont(new Font("Agency FB", Font.BOLD, 25));
		frmCalculadora.setTitle("CALCULADORA");
		frmCalculadora.setBounds(100, 100, 343, 363);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		visor = new JTextField();
		visor.setFont(new Font("Tahoma", Font.BOLD, 20));
		visor.setForeground(new Color(0, 0, 0));
		visor.setEnabled(false);
		visor.setBounds(10, 11, 309, 45);
		frmCalculadora.getContentPane().add(visor);
		visor.setColumns(10);

		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "7");

			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 20));
		b7.setBounds(17, 67, 67, 43);
		frmCalculadora.getContentPane().add(b7);

		JButton b8 = new JButton("8");
		b8.setFont(new Font("Tahoma", Font.BOLD, 20));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "8");
			}
		});
		b8.setBounds(94, 67, 67, 43);
		frmCalculadora.getContentPane().add(b8);

		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "9");
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 20));
		b9.setBounds(171, 67, 67, 43);
		frmCalculadora.getContentPane().add(b9);

		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText(" ");
				opcao = "/";
				
			}
		});
		divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		divide.setBounds(249, 67, 67, 43);
		frmCalculadora.getContentPane().add(divide);

		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "4");
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		b4.setBounds(17, 121, 67, 43);
		frmCalculadora.getContentPane().add(b4);

		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "5");
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 20));
		b5.setBounds(94, 121, 67, 43);
		frmCalculadora.getContentPane().add(b5);

		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "6");
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 20));
		b6.setBounds(171, 121, 67, 43);
		frmCalculadora.getContentPane().add(b6);

		JButton bvezes = new JButton("x");
		bvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText(" ");
				opcao = "x";

				
			}
		});
		bvezes.setFont(new Font("Tahoma", Font.BOLD, 20));
		bvezes.setBounds(252, 121, 67, 43);
		frmCalculadora.getContentPane().add(bvezes);

		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "1");
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setBounds(17, 175, 67, 43);
		frmCalculadora.getContentPane().add(b1);

		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "2");
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(94, 175, 67, 43);
		frmCalculadora.getContentPane().add(b2);

		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "3");
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(171, 175, 67, 43);
		frmCalculadora.getContentPane().add(b3);

		JButton bmenos = new JButton("-");
		bmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(visor.getText());
				visor.setText(" ");
				opcao = "-";
				
			}
		});
		bmenos.setFont(new Font("Tahoma", Font.BOLD, 20));
		bmenos.setBounds(252, 175, 67, 43);
		frmCalculadora.getContentPane().add(bmenos);

		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + "0");
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 20));
		b0.setBounds(17, 229, 67, 43);
		frmCalculadora.getContentPane().add(b0);

		JButton bponto = new JButton(".");
		bponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + ".");
			}

		});
		bponto.setFont(new Font("Tahoma", Font.BOLD, 20));
		bponto.setBounds(94, 229, 67, 43);
		frmCalculadora.getContentPane().add(bponto);
		JButton bmais = new JButton("+");
		bmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n1 = Double.parseDouble(visor.getText());
				visor.setText(" ");
				opcao = "+";
			}
		});
		bmais.setFont(new Font("Tahoma", Font.BOLD, 20));
		bmais.setBounds(252, 229, 67, 43);
		frmCalculadora.getContentPane().add(bmais);

		JButton bigual = new JButton("=");
		bigual.addMouseListener(new MouseAdapter() {
		
		
		});
		bigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				n2 = Double.parseDouble(visor.getText());

				if (opcao.equals("+")) {
					

					visor.setText(String.valueOf(n1+n2));

				}else if(opcao.equals("-")) {
					visor.setText(String.valueOf(n1-n2));

				}else if(opcao.equals("x")) {
					visor.setText(String.valueOf(n1*n2));
				}else if(opcao.equals("/")) {
					visor.setText(String.valueOf(n1/n2));
					
				}
			}
		});
		bigual.setFont(new Font("Tahoma", Font.BOLD, 20));
		bigual.setBounds(171, 229, 67, 43);
		frmCalculadora.getContentPane().add(bigual);

		JButton blimpa = new JButton("AC");
		blimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText("");
			}
		});
		blimpa.setFont(new Font("Tahoma", Font.BOLD, 20));
		blimpa.setBounds(116, 283, 89, 35);
		frmCalculadora.getContentPane().add(blimpa);
	}
}
