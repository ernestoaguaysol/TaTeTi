package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class interfaz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton casilla1;
	public JButton casilla2;
	public JButton casilla3;
	public JButton casilla5;
	public JButton casilla9;
	public JButton casilla4;
	public JButton casilla7;
	public JButton casilla8;
	public JButton casilla6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
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
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 3, 3));
		
		casilla1 = new JButton("");
		contentPane.add(casilla1);
		
		casilla2 = new JButton("");
		contentPane.add(casilla2);
		
		casilla3 = new JButton("");
		contentPane.add(casilla3);
		
		casilla4 = new JButton("");
		contentPane.add(casilla4);
		
		casilla5 = new JButton("");
		contentPane.add(casilla5);
		
		casilla6 = new JButton("");
		contentPane.add(casilla6);
		
		casilla7 = new JButton("");
		contentPane.add(casilla7);
		
		casilla8 = new JButton("");
		contentPane.add(casilla8);
		
		casilla9 = new JButton("");
		contentPane.add(casilla9);
	}

	
}
