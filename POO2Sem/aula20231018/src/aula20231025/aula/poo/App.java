package aula20231025.aula.poo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfCode;
	private JTextField tfDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.GROWING_BUTTON_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.UNRELATED_GAP_ROWSPEC,}));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "2, 1, fill, fill");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("50dlu"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnSave = new JButton("Salvar");
		panel.add(btnSave, "1, 1");
		
		JButton btnDelete = new JButton("Deletar");
		panel.add(btnDelete, "2, 1");
		
		JLabel lbCode = new JLabel("Código");
		getContentPane().add(lbCode, "2, 3");
		
		tfCode = new JTextField();
		getContentPane().add(tfCode, "2, 4, fill, default");
		tfCode.setColumns(10);
		
		JLabel lbDescription = new JLabel("Descrição");
		getContentPane().add(lbDescription, "2, 6");
		
		tfDescription = new JTextField();
		getContentPane().add(tfDescription, "2, 7, fill, default");
		tfDescription.setColumns(10);
		
		btnSave.addActionListener(new ActionListener() { // Nome de evento é ActionListener
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cliquei no botão de Salvar");
			}
		});
		
	btnDelete.addActionListener((event)->{ // É a mesma coisa de cima só que mais rapido por ter só 1 único método.
		JOptionPane.showMessageDialog(null, "Cliquei em Delete");
	});
	
	tfCode.addKeyListener(new KeyListener() {
		public void keyTyped(KeyEvent e) {}
	    public void keyPressed(KeyEvent e) {}
	    public void keyReleased(KeyEvent e) {
	    	System.out.println("Digitando a letra "+e.getKeyChar());
	    	System.out.println("O texto agora é "+tfCode.getText());
	    }
	});
	
	tfDescription.addKeyListener(new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("[tfDescription] Digitando a letra "+e.getKeyChar());
			System.out.println("[tfDescription] O texto agora é " +tfDescription.getText());
		}
	});
	
	}

}
