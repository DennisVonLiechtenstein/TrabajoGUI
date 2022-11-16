package loginC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(71, 50, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(71, 117, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		login = new JTextField();
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
			               
			        
			}
		});
		login.setBounds(115, 47, 208, 20);
		contentPane.add(login);
		login.setColumns(10);
		
		JButton entrar = new JButton("ENTRAR");
		entrar.addMouseListener(new MouseAdapter() {
			
		});
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String se=senha.getText();
				String us = login.getText();
				
				if(us.equals("cefet") && (se.equals("2021"))){
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
					
					dispose();
				}else {
					JOptionPane.showMessageDialog(null,"alerta","Usuario ou senha incorretos!",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		entrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		entrar.setBounds(167, 196, 89, 23);
		contentPane.add(entrar);
		
		senha = new JPasswordField();
		senha.setBounds(115, 115, 208, 20);
		contentPane.add(senha);
	}
}
