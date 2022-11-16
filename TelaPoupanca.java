package poupanca;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class TelaPoupanca {

	private JFrame frmPoupana;
	private JTextField juros;
	private JTextField anos;
	private JTextField depMens;
	private JTextField total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPoupanca window = new TelaPoupanca();
					window.frmPoupana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPoupanca() {
		initialize();
	}

	double j = 0.0;
	int an = 0;
	double depo = 0.0;
	double tot = 0.0;
	String resul = "";

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPoupana = new JFrame();
		frmPoupana.getContentPane().setBackground(new Color(127, 255, 0));
		frmPoupana.getContentPane().setForeground(new Color(0, 0, 0));
		frmPoupana.getContentPane().setFont(new Font("Agency FB", Font.BOLD, 20));
		frmPoupana.setTitle("POUPANÇA");
		frmPoupana.setBounds(100, 100, 259, 300);
		frmPoupana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPoupana.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Juros por mês % :");
		lblNewLabel.setBounds(10, 27, 102, 14);
		frmPoupana.getContentPane().add(lblNewLabel);

		juros = new JTextField();
		juros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		juros.setBounds(115, 24, 120, 20);
		frmPoupana.getContentPane().add(juros);
		juros.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Num.de anos:");
		lblNewLabel_1.setBounds(10, 67, 89, 14);
		frmPoupana.getContentPane().add(lblNewLabel_1);

		anos = new JTextField();
		anos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		anos.setBounds(91, 64, 144, 20);
		frmPoupana.getContentPane().add(anos);
		anos.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Depósito mensal R$:");
		lblNewLabel_2.setBounds(10, 114, 117, 14);
		frmPoupana.getContentPane().add(lblNewLabel_2);

		depMens = new JTextField();
		depMens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		depMens.setBounds(129, 111, 106, 20);
		frmPoupana.getContentPane().add(depMens);
		depMens.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Total poupado:");
		lblNewLabel_3.setBounds(21, 204, 91, 14);
		frmPoupana.getContentPane().add(lblNewLabel_3);

		total = new JTextField();
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		total.setBounds(113, 201, 122, 20);
		frmPoupana.getContentPane().add(total);
		total.setColumns(10);

		JButton finaliza = new JButton("OK");
		finaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				j = Double.parseDouble(juros.getText());
				an = Integer.parseInt(anos.getText());
				depo = Double.parseDouble(depMens.getText());
				an = an * 12;
				tot = j * an * depo / 100;

				total.setText(String.valueOf(tot) + " R$");

			}
		});
		finaliza.setBounds(70, 154, 89, 23);
		frmPoupana.getContentPane().add(finaliza);
	}
}
