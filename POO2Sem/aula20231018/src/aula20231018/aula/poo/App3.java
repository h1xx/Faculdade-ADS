package aula20231018.aula.poo;

import java.awt.EventQueue;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.w3c.dom.xpath.XPathNSResolver;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;
import java.awt.Color;

public class App3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App3 frame = new App3();
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
	public App3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 175);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("max(60dlu;default):grow"),
				ColumnSpec.decode("max(142dlu;default):grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel, "1, 1, left, fill");
		
		tfName = new JTextField();
		tfName.setBackground(new Color(0, 0, 0));
		tfName.setForeground(new Color(255, 255, 255));
		contentPane.add(tfName, "2, 1, fill, default");
		tfName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1, "1, 2, left, default");
		
		tfEmail = new JTextField();
		tfEmail.setBackground(new Color(0, 0, 0));
		tfEmail.setForeground(new Color(255, 255, 255));
		contentPane.add(tfEmail, "2, 2");
		tfEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_2, "1, 3, left, default");
		
		tfPhone = new JTextField();
		tfPhone.setBackground(new Color(0, 0, 0));
		tfPhone.setForeground(new Color(255, 255, 255));
		contentPane.add(tfPhone, "2, 3, fill, default");
		tfPhone.setColumns(10);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBackground(new Color(0, 255, 0));
		contentPane.add(btnSave, "2, 5");
	}

}
