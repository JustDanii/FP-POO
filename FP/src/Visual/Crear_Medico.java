package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear_Medico extends JDialog {
	
	private Dimension dim;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Crear_Medico dialog = new Crear_Medico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Crear_Medico() {
		dim = getToolkit().getScreenSize();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		//`setContentPane(contentPanel);
		setSize(dim.width-700, dim.height-150
				);
		setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JSeparator separator = new JSeparator();
				separator.setBackground(new Color(0, 0, 0));
				separator.setBounds(-16, 228, 600, 2);
				panel.add(separator);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(64, 224, 208));
				panel_1.setBounds(0, 0, 591, 50);
				panel.add(panel_1);
			}
			{
				JLabel lblNewLabel = new JLabel("Informacion General:");
				lblNewLabel.setBounds(10, 59, 171, 20);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre:");
				lblNewLabel_1.setBounds(10, 166, 69, 20);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Cedula:");
				lblNewLabel_2.setBounds(10, 112, 69, 20);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Numero Telefonico:");
				lblNewLabel_3.setBounds(238, 112, 155, 20);
				panel.add(lblNewLabel_3);
			}
			{
				textField = new JTextField();
				textField.setEnabled(true);
				textField.setBounds(81, 109, 129, 26);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(81, 163, 129, 26);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(381, 109, 155, 26);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Especialidad:");
				lblNewLabel_4.setBounds(10, 282, 97, 20);
				panel.add(lblNewLabel_4);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBounds(113, 279, 146, 26);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JLabel lblInformacionDelMedico = new JLabel("Informacion Del Medico:");
				lblInformacionDelMedico.setBounds(10, 243, 192, 20);
				panel.add(lblInformacionDelMedico);
			}
			{
				JSeparator separator = new JSeparator();
				separator.setBackground(Color.BLACK);
				separator.setBounds(0, 356, 600, 2);
				panel.add(separator);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Informacion De Usuario:\r\n");
				lblNewLabel_5.setBounds(10, 370, 192, 20);
				panel.add(lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("Contrase\u00F1a:");
				lblNewLabel_6.setBounds(238, 426, 97, 20);
				panel.add(lblNewLabel_6);
			}
			{
				textField_4 = new JTextField();
				textField_4.setBounds(350, 423, 146, 26);
				panel.add(textField_4);
				textField_4.setColumns(10);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Codigo:");
				lblNewLabel_7.setBounds(10, 426, 69, 20);
				panel.add(lblNewLabel_7);
			}
			{
				textField_5 = new JTextField();
				textField_5.setEnabled(false);
				textField_5.setEditable(false);
				textField_5.setBounds(81, 423, 97, 26);
				panel.add(textField_5);
				textField_5.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(64, 224, 208));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setBackground(new Color(64, 224, 208));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setBackground(new Color(255, 99, 71));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
