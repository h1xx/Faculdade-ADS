package br.com.unisenai.controller;

import br.com.unisenai.model.IVehicleRepository;
import br.com.unisenai.model.Vehicle;
import br.com.unisenai.model.VehicleRepository;

public class VehicleFormController {
	
	private IVehicleRepository repository = new VehicleRepository();
	private Vehicle vehicle;
	
	public VehicleFormController(Integer id) {
		vehicle = id == null ? new Vehicle(): repository.findById(id);
	}
	
	public String getId() {
		if(vehicle != null && vehicle.getId() != null) {
			return vehicle.getId().toString();
		}
		return "";
	}

	
	public String getBrand() {
		if(vehicle != null && vehicle.getBrand() != null) {
			return vehicle.getBrand();
		}
		return "";
	}
	
	public void setBrand(String brand) {
		if(vehicle != null) {
			vehicle.setBrand(brand);
		}
	}
	
	public String getModel() {
		if(vehicle != null && vehicle.getModel() != null) {
			return vehicle.getModel();
		}
		return "";
	}
	
	public void setModel(String value) {
		if(vehicle != null) {
			vehicle.setModel(value);
		}
	}
	
	public String getCollor() {
		if(vehicle != null && vehicle.getCollor() != null) {
			return vehicle.getCollor();
		}
		return "";
	}
	
	public void setCollor(String value) {
		if(vehicle != null) {
			vehicle.setCollor(value);
		}
	}
	
	public String getPlate() {
		if(vehicle != null && vehicle.getPlate() != null) {
			return vehicle.getPlate();
		}
		return "";
	}
	
	public void setPlate(String value) {
		if(vehicle != null) {
			vehicle.setPlate(value);
		}
	}
	
	public String getYear() {
		if(vehicle != null && vehicle.getYear() > 0) {
			return String.valueOf(vehicle.getYear());
		}
		return "";
	}
	
	public void setYear(String value) {
		if(vehicle != null && value != null && !value.trim().isEmpty()) {
			vehicle.setYear(Integer.parseInt(value));
		}
	}
	
	
	
	
	
	public VehicleActionResponse save() {
		if(vehicle != null) {
			return vehicle.getId() != null ? 
					new VehicleActionResponse("EDIT",repository.update(vehicle)) : 
					new VehicleActionResponse("INSERT",repository.insert(vehicle));
		}
		return null;
	}
	
	

}
