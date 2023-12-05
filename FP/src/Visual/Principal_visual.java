package Visual;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;
import java.awt.GridLayout;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import java.awt.Window.Type;

public class Principal_visual extends JFrame {

	private JTextField txtFecha;
	private JPanel contentPane;
    private JCalendar calendar;

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

    public Principal_visual() {
        setTitle("Principal");
        setType(Type.UTILITY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 1213, 535);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Panel p_header = new Panel();
        p_header.setBackground(new Color(30, 144, 255));
        p_header.setBounds(0, 0, 1209, 80);
        contentPane.add(p_header);
        p_header.setLayout(null);

        JButton button = new JButton("");
        button.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\equipo-medico.png"));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.WHITE);
        button.setBounds(10, 0, 97, 80);
        p_header.add(button);
        
        JLabel lbl_name = new JLabel("Clinica Medica Jose Daniel");
        lbl_name.setFont(new Font("Rockwell", Font.PLAIN, 38));
        lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_name.setBounds(132, 11, 1067, 58);
        p_header.add(lbl_name);

        Panel P_menu = new Panel();
        P_menu.setBounds(0, 79, 116, 427);
        contentPane.add(P_menu);
        P_menu.setLayout(null);
        P_menu.setBackground(new Color(220, 220, 220));

        JMenuItem MI_ini = new JMenuItem("SESION");
        MI_ini.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
				
				Login login = new Login();
				login.setVisible(true);
        	}
        });
        MI_ini.setSelected(true);
        MI_ini.setBackground(new Color(192, 192, 192));
        MI_ini.setBounds(0, 0, 116, 38);
        P_menu.add(MI_ini);
        MI_ini.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\casa.png"));

        JMenuItem MI_pa = new JMenuItem("PACIENTES");
        MI_pa.setBackground(new Color(192, 192, 192));
        MI_pa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Paciente paciente = new Paciente();
                paciente.setVisible(true);
            }
        });
        MI_pa.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\grupo-de-chat.png"));
        MI_pa.setBounds(0, 38, 116, 38);
        P_menu.add(MI_pa);

        JMenuItem MI_doc = new JMenuItem("DOCTORES");
        MI_doc.setSelected(true);
        MI_doc.setBackground(new Color(192, 192, 192));
        MI_doc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Doctor doctor = new Doctor();
                doctor.setVisible(true);
            }
        });
        MI_doc.setIcon(new ImageIcon("C:\\Users\\Mr\\git\\ProyectoFinal\\FinalProyect\\src\\images\\doctor.png"));
        MI_doc.setBounds(0, 76, 116, 38);
        P_menu.add(MI_doc);

        JPanel P_calendario = new JPanel();
        P_calendario.setBounds(115, 79, 1094, 425);
        contentPane.add(P_calendario);
        P_calendario.setLayout(null);
        
        calendar = new JCalendar();
        calendar.getDayChooser().setDecorationBackgroundColor(Color.WHITE);
        calendar.getDayChooser().setAlwaysFireDayProperty(false);
        calendar.getDayChooser().setDecorationBordersVisible(true);
        calendar.setWeekdayForeground(Color.BLACK);
        calendar.getDayChooser().getDayPanel().setBackground(new Color(192, 192, 192));
        calendar.setTodayButtonVisible(true);
        calendar.setWeekOfYearVisible(false);
        calendar.setSundayForeground(new Color(0, 0, 0));
        calendar.setBorder(new CompoundBorder());
        calendar.setDecorationBackgroundColor(Color.WHITE);
        calendar.setDecorationBordersVisible(true);
        calendar.getYearChooser().getSpinner().setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 16));
        calendar.getMonthChooser().getComboBox().setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 16));
        GridLayout gridLayout = (GridLayout) calendar.getDayChooser().getDayPanel().getLayout();
        calendar.setBounds(10, 11, 1063, 403);
        P_calendario.add(calendar);
    }
}
