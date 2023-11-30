package br.com.unisenai.view;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import br.com.unisenai.controller.VehicleActionResponse;
import br.com.unisenai.controller.VehicleFormController;
import br.com.unisenai.model.Vehicle;

import com.jgoodies.forms.layout.FormSpecs;

public class VehicleFormView extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JButton btnSave;
	private JButton btnCancel;
	private JLabel lbCode;
	private JLabel lbBrand;
	private JLabel lbModel;
	private JLabel lbCollor;
	private JLabel lbYear;
	private JLabel lbPlate;
	private JTextField tfCode;
	private JTextField tfBrand;
	private JTextField tfModel;
	private JTextField tfCollor;
	private JTextField tfYear;
	private JTextField tfPlate;
	private JPanel pnForm;
	private JPanel pnActions;
	private VehicleFormController controller;
	IFormActionListener<Vehicle> owner;
	
	public VehicleFormView() {
		this(null, null);
	}
	
	
	public VehicleFormView(IFormActionListener<Vehicle> owner, Integer id) {
		this.owner = owner;
		controller = new VehicleFormController(id);
		
		setSize(600, 450);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				RowSpec.decode("20dlu"),
				RowSpec.decode("5dlu"),}));
		
		configurePanelForm(getContentPane());
		configurePanelActions(getContentPane());
	}
	
	private void configurePanelForm(Container container) {
		pnForm = new JPanel();
		container.add(pnForm, "2, 2, fill, fill");
		
		pnForm.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("fill:default"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:18dlu"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:default"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:18dlu"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:default"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:18dlu"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:default"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:18dlu"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:default"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:18dlu"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:default"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:18dlu"),
				RowSpec.decode("5dlu"),}));
		
		lbCode = new JLabel("Código");
		pnForm.add(lbCode, "1, 1, fill, fill");
		
		tfCode = new JTextField();
		tfCode.setText(controller.getId());
		tfCode.setEditable(false);
		pnForm.add(tfCode, "1, 3, fill, fill");
		
		lbBrand = new JLabel("Marca");
		pnForm.add(lbBrand, "1, 5, fill, fill");
		
		tfBrand = new JTextField();
		pnForm.add(tfBrand, "1, 7, fill, fill");
		tfBrand.setText(controller.getBrand());
		tfBrand.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.setBrand(tfBrand.getText());
			}
		});
		
		lbModel = new JLabel("Modelo");
		pnForm.add(lbModel, "1, 9, fill, fill");
		
		tfModel = new JTextField();
		pnForm.add(tfModel, "1, 11, fill, fill");
		tfModel.setText(controller.getModel());
		tfModel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.setModel(tfModel.getText());
			}
		});
		
		lbCollor= new JLabel("Cor");
		pnForm.add(lbCollor, "1, 13, fill, fill");
		
		tfCollor = new JTextField();
		pnForm.add(tfCollor, "1, 15, fill, fill");
		tfCollor.setText(controller.getCollor());
		tfCollor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.setCollor(tfCollor.getText());
			}
		});
		
		lbYear= new JLabel("Ano Fabricação");
		pnForm.add(lbYear, "1, 17, fill, fill");
		
		tfYear= new JTextField();
		pnForm.add(tfYear, "1, 19, fill, fill");
		tfYear.setText(controller.getYear());
		tfYear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.setYear(tfYear.getText());
			}
		});
		
		lbPlate= new JLabel("Placa");
		pnForm.add(lbPlate, "1, 21, fill, fill");
		
		tfPlate= new JTextField();
		pnForm.add(tfPlate, "1, 23, fill, fill");
		tfPlate.setText(controller.getPlate());
		tfPlate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				controller.setPlate(tfPlate.getText());
			}
		});
			
	}
	
	private void configurePanelActions(Container container) {
		pnActions = new JPanel();
		container.add(pnActions, "2, 4, right, fill");
		pnActions.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("50dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),},
			new RowSpec[] {
				RowSpec.decode("fill:default:grow"),}));
		
		btnSave = new JButton("Salvar");
		pnActions.add(btnSave, "3, 1");
		btnSave.addActionListener((event)->{
			VehicleActionResponse response = controller.save();
			owner.onSave(response.getActionResult(), response.getVehicle());
			dispose();
		});
		
		btnCancel = new JButton("Cancelar");
		pnActions.add(btnCancel, "1, 1");
		btnCancel.addActionListener((event)->{
			dispose();
		});
		
	}
	
	

}
