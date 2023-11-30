package br.com.unisenai.controller;

import java.util.List;

import br.com.unisenai.model.IVehicleRepository;
import br.com.unisenai.model.Vehicle;
import br.com.unisenai.model.VehicleRepository;

public class VehicleListController {
	
	private IVehicleRepository repository = new VehicleRepository();
	private Integer selectedId;
	private String[] columnNames = new String[] {"Código", "Marca", "Modelo", "Cor","Placa", "Ano Fabricação"};
	
	public List<Vehicle> findAll(){
		return repository.findAll();
	}
	
	public void setSelectedRecord(int row) {
		if(row > -1 && row < repository.findAll().size()) {
			selectedId = repository.findAll().get(row).getId();
		}else {
			selectedId = null;
		}
	}
	
	public Integer getSelectedId() {
		return selectedId;
	}
	
	public void remove() {
		if(selectedId != null) {
			repository.remove(selectedId);
		}
	}
	
	public List<String> getColumnNames() {
		return List.of(columnNames);
	}
	
	public Vehicle findById(Integer id) {
		return repository.findById(id);
	}

	public int getPosition(Vehicle element) {
		return repository.findAll().indexOf(element);
	}
	
	
	

}
