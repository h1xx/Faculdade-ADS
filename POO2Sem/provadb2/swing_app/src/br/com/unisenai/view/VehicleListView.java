package br.com.unisenai.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import br.com.unisenai.controller.VehicleListController;
import br.com.unisenai.model.Vehicle;

public class VehicleListView extends JFrame implements IFormActionListener<Vehicle>{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel pnActions;
	private JScrollPane pnTable;
	private JTable tbVehicles;
	private JButton btnNew;
	private JButton btnEdit;
	private JButton btnDelete;
	private VehicleListController controller = new VehicleListController();
	private VehicleTableModel tableModel = new VehicleTableModel(controller.findAll(), controller.getColumnNames());

	public VehicleListView() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("5dlu"),},
			new RowSpec[] {
				RowSpec.decode("5dlu"),
				RowSpec.decode("fill:20dlu"),
				RowSpec.decode("5dlu"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("5dlu"),}));
		
		pnActions = new JPanel();
		getContentPane().add(pnActions, "2, 2, fill, fill");
		pnActions.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("5dlu"),
				ColumnSpec.decode("50dlu"),},
			new RowSpec[] {
				RowSpec.decode("fill:20dlu"),}));
		
		btnNew = new JButton("Novo");
		pnActions.add(btnNew,"1, 1, fill, fill");
		btnNew.addActionListener((event)->{
			JDialog dialog = new VehicleFormView(this,null);
			dialog.setVisible(true);
		});
		
		btnEdit= new JButton("Editar");
		btnEdit.setEnabled(false);
		pnActions.add(btnEdit,"3, 1, fill, fill");
		btnEdit.addActionListener((event)->{
			
			JDialog dialog = new VehicleFormView(this,controller.getSelectedId());
			dialog.setVisible(true);
		});
		
		btnDelete = new JButton("Remover");
		btnDelete.setEnabled(false);
		pnActions.add(btnDelete,"5, 1, fill, fill");
		
		btnDelete.addActionListener((event)->{
			controller.remove();
			tableModel.removeRow(tbVehicles.getSelectedRow());
			
		});
		
		
		pnTable = new JScrollPane();
		getContentPane().add(pnTable, "2, 4, fill, fill");
		
		
		
		tbVehicles = new JTable(tableModel);
		pnTable.setViewportView(tbVehicles);
		
		tbVehicles.getSelectionModel().addListSelectionListener((event)->{
			    int selectedRow = tbVehicles.getSelectedRow();
				controller.setSelectedRecord(selectedRow);
				btnEdit.setEnabled(selectedRow > -1);
				btnDelete.setEnabled(selectedRow > -1);
			}
		);
		
		
	}
	
	private class VehicleTableModel extends EntityTableModel<Vehicle>{

		private static final long serialVersionUID = 1L;
		

		public VehicleTableModel(List<Vehicle> elements, List<String> columnNames) {
			super(elements, columnNames);
		}

		@Override
		public Object getValue(Vehicle element, String columnName) {
			return switch(columnName) {
				case "Código" -> element.getId();
				case "Marca" -> element.getBrand();
				case "Modelo" -> element.getModel();
				case "Cor" -> element.getCollor();
				case "Placa" -> element.getPlate();
				case "Ano Fabricação" -> element.getYear();
				default -> "";
			};
		}

		@Override
		public void editRow(Vehicle element, int position) {
			this.setValueAt(element.getId(), position, 0);
			this.setValueAt(element.getBrand(), position, 1);
			this.setValueAt(element.getModel(), position, 2);
			this.setValueAt(element.getCollor(), position, 3);
			this.setValueAt(element.getPlate(), position, 4);
			this.setValueAt(element.getYear(), position, 5);
			this.fireTableRowsUpdated(position, position);
			
		}
	
	}

	@Override
	public void onSave(String action, Vehicle element) {
		if(action.equals("INSERT")) {
			tableModel.addRow(element);
		}else {
			int position = controller.getPosition(element);
			tableModel.editRow(element, position);
		}
		
	}

}
