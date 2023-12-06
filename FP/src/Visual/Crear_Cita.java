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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear_Cita extends JFrame {
	
	private Dimension dim;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setSize(dim.width-600, dim.height-200);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hora:");
		lblNewLabel.setBounds(15, 287, 40, 20);
		panel.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("Sexo:\r\n");
		label_4.setBounds(15, 140, 40, 20);
		panel.add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(117, 284, 32, 26);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(70, 284, 32, 26);
		panel.add(spinner_1);
		
		JLabel label = new JLabel("Informacion del paciente:");
		label.setBounds(10, 26, 200, 20);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(286, 76, 69, 20);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Cedula:\r\n");
		label_2.setBounds(15, 76, 69, 20);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Numero Telefonico:");
		label_3.setBounds(288, 136, 153, 20);
		panel.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(65, 139, 72, 26);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(435, 132, 170, 26);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 72, 135, 26);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(350, 73, 138, 26);
		panel.add(textField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(0, 0, 781, 26);
		panel.add(panel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(770, 215, -759, -5);
		panel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Informacion De Cita:");
		lblNewLabel_1.setBounds(15, 215, 153, 20);
		panel.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setText(":");
		textField_3.setBounds(103, 283, 19, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Doctor:");
		lblNewLabel_2.setBounds(15, 363, 69, 20);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(70, 360, 140, 26);
		panel.add(comboBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 224, 208));
		panel_2.setBounds(0, 402, 818, 66);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.setBackground(new Color(64, 224, 208));
		btnNewButton_1.setBounds(406, 21, 115, 29);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.setBounds(530, 21, 115, 29);
		panel_2.add(btnNewButton);
	}
}
