package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Crear_Vacuna extends JDialog {
	
	private Dimension dim;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Crear_Vacuna dialog = new Crear_Vacuna();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Crear_Vacuna() {
		setTitle("Registro De Vacunas");
		dim = getToolkit().getScreenSize();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(64, 224, 208));
				panel_1.setBounds(0, 0, 643, 45);
				panel.add(panel_1);
			}
			{
				JLabel lblNewLabel = new JLabel("Codigo:");
				lblNewLabel.setBounds(15, 87, 69, 20);
				panel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				textField.setBounds(83, 84, 146, 26);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre:\r\n");
				lblNewLabel_1.setBounds(273, 87, 69, 20);
				panel.add(lblNewLabel_1);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(345, 84, 146, 26);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Enfermedad:");
				lblNewLabel_2.setBounds(15, 186, 98, 20);
				panel.add(lblNewLabel_2);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setBounds(123, 183, 131, 26);
				panel.add(comboBox);
			}
		}
		//`setContentPane(contentPanel);
		setSize(dim.width-700, dim.height-370);
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(64, 224, 208));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setBackground(new Color(64, 224, 208));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(new Color(255, 99, 71));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
