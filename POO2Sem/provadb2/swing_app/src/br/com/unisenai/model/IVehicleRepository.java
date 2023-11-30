package br.com.unisenai.model;

import java.util.List;

public interface IVehicleRepository {
	
	public Vehicle insert(Vehicle vehicle);
	public Vehicle update(Vehicle vehicle);
	public List<Vehicle> findAll();
	public Vehicle findById(Integer id);
	public Vehicle remove(Integer id);


}
