package Visual;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;


public class Principal_visual extends JFrame {

	private JPanel contentPane;

	
	//cam
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_visual frame = new Principal_visual();
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
	public Principal_visual() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		Panel panel = new Panel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 765, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setIcon(new ImageIcon(Principal_visual.class.getResource("/Visual/images/equipo-medico.png")));
		lblNewLabel_3.setBounds(32, 0, 88, 80);
		panel.add(lblNewLabel_3);
		
		JTextPane txtpnCodigo = new JTextPane();
		txtpnCodigo.setEditable(false);
		txtpnCodigo.setText("Codigo:");
		txtpnCodigo.setBackground(new Color(64, 224, 208));
		txtpnCodigo.setBounds(135, 16, 133, 26);
		panel.add(txtpnCodigo);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setForeground(new Color(0, 0, 0));
		textPane_1.setBackground(new Color(64, 224, 208));
		textPane_1.setBounds(135, 38, 133, 26);
		panel.add(textPane_1);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("Nombre:");
		txtpnNombre.setBackground(new Color(64, 224, 208));
		txtpnNombre.setBounds(308, 16, 133, 26);
		panel.add(txtpnNombre);
		
		JTextPane txtpnMorfe = new JTextPane();
		txtpnMorfe.setEditable(false);
		txtpnMorfe.setBackground(new Color(64, 224, 208));
		txtpnMorfe.setBounds(308, 38, 116, 26);
		panel.add(txtpnMorfe);
		
		JButton btnNewButton_2 = new JButton("Cerrar Sesion ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.setVisible(false);
				dispose();
			}
		});
		btnNewButton_2.setBounds(600, 25, 133, 29);
		panel.add(btnNewButton_2);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 79, 141, 331);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 255, 240));
		
		JButton btnNewButton_1 = new JButton("Administracion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu_Administracion admin = new Menu_Administracion();
				admin.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(64, 224, 208));
		btnNewButton_1.setBounds(0, 161, 141, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.setBackground(new Color(64, 224, 208));
		btnConsulta.setBounds(0, 105, 141, 29);
		panel_1.add(btnConsulta);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Cita cita = new Crear_Cita();
				cita.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Principal_visual.class.getResource("/Visual/images/6711415 (1).png")));
		btnNewButton.setBounds(259, 115, 154, 114);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista_Citas citas = new Lista_Citas();
				citas.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(Principal_visual.class.getResource("/Visual/images/list-icon-png_265066__1_-removebg-preview.png")));
		button_1.setBounds(486, 115, 154, 114);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Principal_visual.class.getResource("/Visual/images/6711415 (1).png")));
		button_3.setBounds(259, 267, 154, 115);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar_Pacientes lpac = new Listar_Pacientes();
				lpac.setVisible(true);
			}
		});
		button_4.setIcon(new ImageIcon(Principal_visual.class.getResource("/Visual/images/list-icon-png_265066__1_-removebg-preview.png")));
		button_4.setBounds(486, 268, 154, 114);
		contentPane.add(button_4);
		
		JLabel lblNewLabel = new JLabel("Agregar Cita");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(286, 86, 98, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblAgregarPaciente = new JLabel("Agregar Paciente");
		lblAgregarPaciente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAgregarPaciente.setBounds(269, 234, 141, 20);
		contentPane.add(lblAgregarPaciente);
		
		JLabel lblNewLabel_1 = new JLabel("Listar Citas\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(517, 86, 91, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Listar Pacientes");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(496, 234, 125, 20);
		contentPane.add(lblNewLabel_2);
	}

}
