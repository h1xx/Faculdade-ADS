package br.com.unisenai.controller;

import br.com.unisenai.model.Vehicle;

public class VehicleActionResponse {
	
	private String  actionResult;
	private Vehicle vehicle;
	
	
	public VehicleActionResponse(String actionResult, Vehicle vehicle) {
		super();
		this.actionResult = actionResult;
		this.vehicle = vehicle;
	}
	public String getActionResult() {
		return actionResult;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	
}
