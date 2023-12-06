package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CrearConsulta extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private JTextField pacienteTextField;
    private JTextField motivoTextField;

    public static void main(String[] args) {
        try {
            CrearConsulta dialog = new CrearConsulta();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CrearConsulta() {
        setBounds(100, 100, 660, 359);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setBounds(15, 69, 79, 20);
        contentPanel.add(lblPaciente);

        JComboBox<String> pacienteComboBox = new JComboBox<>();
        pacienteComboBox.setBounds(85, 66, 139, 26);
        contentPanel.add(pacienteComboBox);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(64, 224, 208));
        panel.setBounds(0, 0, 638, 40);
        contentPanel.add(panel);

        JLabel lblMotivoConsulta = new JLabel("Motivo de consulta:");
        lblMotivoConsulta.setBounds(283, 69, 139, 20);
        contentPanel.add(lblMotivoConsulta);

        motivoTextField = new JTextField();
        motivoTextField.setBounds(437, 56, 146, 99);
        contentPanel.add(motivoTextField);
        motivoTextField.setColumns(10);

        JLabel lblSintomas = new JLabel("Síntomas:");
        lblSintomas.setBounds(15, 163, 71, 20);
        contentPanel.add(lblSintomas);

        JTextField sintomasTextField = new JTextField();
        sintomasTextField.setBounds(85, 160, 111, 63);
        contentPanel.add(sintomasTextField);
        sintomasTextField.setColumns(10);

        JLabel lblDiagnostico = new JLabel("Diagnóstico:");
        lblDiagnostico.setBounds(283, 203, 96, 20);
        contentPanel.add(lblDiagnostico);

        JComboBox<String> diagnosticoComboBox = new JComboBox<>();
        diagnosticoComboBox.setBounds(394, 200, 146, 26);
        contentPanel.add(diagnosticoComboBox);

        JPanel buttonPane = new JPanel();
        buttonPane.setBackground(new Color(64, 224, 208));
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Lógica para guardar la información
            }
        });
        guardarButton.setActionCommand("OK");
        buttonPane.add(guardarButton);
        getRootPane().setDefaultButton(guardarButton);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        cancelarButton.setBackground(new Color(255, 99, 71));
        cancelarButton.setActionCommand("Cancel");
        buttonPane.add(cancelarButton);
    }
}
