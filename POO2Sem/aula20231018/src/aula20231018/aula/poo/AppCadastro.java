package aula20231018.aula.poo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class AppCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCadastro frame = new AppCadastro();
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
	public AppCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuBARCadastro = new JMenu("Cadastro");
		menuBar.add(menuBARCadastro);
		
		JMenuItem menu_listar = new JMenuItem("Listar Clientes");
		menuBARCadastro.add(menu_listar);
		
		JMenuItem menu_cadastrar = new JMenuItem("Cadastrar Clientes");
		menuBARCadastro.add(menu_cadastrar);
		
		JSeparator separator = new JSeparator();
		menuBARCadastro.add(separator);
		
		JMenuItem menu_sair = new JMenuItem("Sair");
		menuBARCadastro.add(menu_sair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JMenu menuBARFinanceiro = new JMenu("Financeiro");
		menuBar.add(menuBARFinanceiro);
		JMenuItem mniContasPagar = new JMenuItem("Contas a Pagar");
		menuBARFinanceiro.add(mniContasPagar);
		

		setContentPane(contentPane);
	}

}
