package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Menu_Administracion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Administracion frame = new Menu_Administracion();
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
	public Menu_Administracion() {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Medico med = new Crear_Medico();
				med.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Menu_Administracion.class.getResource("/Visual/images/pngtree-vector-add-icon-png-image_4184841__1_-removebg-preview.png")));
		btnNewButton.setBounds(159, 52, 115, 85);
		panel.add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Vacuna vac = new Crear_Vacuna();
				vac.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(Menu_Administracion.class.getResource("/Visual/images/pngtree-vector-add-icon-png-image_4184841__1_-removebg-preview.png")));
		button.setBounds(350, 52, 126, 85);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 224));
		panel_1.setBounds(0, 0, 134, 322);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listas");
		lblNewLabel.setBounds(37, 5, 51, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Medicos");
		btnNewButton_1.setBackground(new Color(250, 250, 210));
		btnNewButton_1.setBounds(0, 44, 134, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Enfermedades");
		btnNewButton_2.setBackground(new Color(250, 250, 210));
		btnNewButton_2.setBounds(0, 89, 134, 29);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Vacunas\r\n");
		btnNewButton_3.setBackground(new Color(250, 250, 210));
		btnNewButton_3.setBounds(0, 134, 134, 29);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cerrar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_4.setBackground(new Color(255, 0, 0));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(15, 277, 104, 29);
		panel_1.add(btnNewButton_4);
		
		JButton btnSecretarias = new JButton("Secretarias");
		btnSecretarias.setBackground(new Color(250, 250, 210));
		btnSecretarias.setBounds(0, 179, 134, 29);
		panel_1.add(btnSecretarias);
		
		JButton btnUsuario = new JButton("Admin");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUsuario.setBackground(new Color(250, 250, 210));
		btnUsuario.setBounds(0, 224, 134, 29);
		panel_1.add(btnUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Agregar Medico");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(159, 29, 134, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Agregar Vacunas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(350, 29, 136, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Agregar Enfermedades");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(143, 174, 162, 20);
		panel.add(lblNewLabel_3);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crear_Enfermedad enf = new Crear_Enfermedad();
				enf.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(Menu_Administracion.class.getResource("/Visual/images/pngtree-vector-add-icon-png-image_4184841__1_-removebg-preview.png")));
		button_1.setBounds(159, 197, 115, 85);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(Menu_Administracion.class.getResource("/Visual/images/pngtree-vector-add-icon-png-image_4184841__1_-removebg-preview.png")));
		button_2.setBounds(350, 197, 115, 85);
		panel.add(button_2);
		
		JLabel lblAgregarAdministrador = new JLabel("Agregar Administrador");
		lblAgregarAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAgregarAdministrador.setBounds(324, 174, 169, 20);
		panel.add(lblAgregarAdministrador);
	}
}
