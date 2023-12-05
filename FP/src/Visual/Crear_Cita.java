package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JSpinner;

public class Crear_Cita extends JFrame {
	
	private Dimension dim;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crear_Cita frame = new Crear_Cita();
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
	public Crear_Cita() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		dim = getToolkit().getScreenSize();
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setSize(dim.width-700, dim.height-300
				);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hora:");
		lblNewLabel.setBounds(263, 39, 40, 20);
		panel.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(358, 36, 32, 26);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(304, 36, 32, 26);
		panel.add(spinner_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 18));
		textPane.setEnabled(false);
		textPane.setEditable(false);
		textPane.setText(" ");
		textPane.setBounds(340, 39, 15, 26);
		panel.add(textPane);
	}
}
