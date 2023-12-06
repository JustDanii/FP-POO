package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crear_Enfermedad extends JDialog {
	
	private Dimension dim;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Crear_Enfermedad dialog = new Crear_Enfermedad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Crear_Enfermedad() {
		setTitle("Registro de enfermedades\r\n");
		
		dim = getToolkit().getScreenSize();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Sintomas:");
			lblNewLabel.setBounds(299, 190, 86, 20);
			contentPanel.add(lblNewLabel);
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(387, 175, 129, 81);
		contentPanel.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Descripcion:");
		lblNewLabel_1.setBounds(15, 190, 98, 20);
		contentPanel.add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(102, 175, 129, 81);
		contentPanel.add(textArea_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:\r\n");
		lblNewLabel_2.setBounds(15, 64, 69, 20);
		contentPanel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(102, 61, 146, 26);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("En observacion\r\n");
		chckbxNewCheckBox.setBounds(299, 60, 186, 29);
		contentPanel.add(chckbxNewCheckBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(0, 0, 694, 48);
		contentPanel.add(panel);
		//`setContentPane(contentPanel);
		setSize(dim.width-700, dim.height-350);
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(64, 224, 208));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
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
