package br.com.unisenai.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.unisenai.controller.Database;

public class VehicleRepository  implements IVehicleRepository{
	private static final String COL_ID = "id";
	private static final String COL_BRAND = "brand";
	private static final String COL_MODEL = "model";
	private static final String COL_PLATE = "plate";
	private static final String COL_COLLOR = "collor";
	private static final String COL_YEARFAB = "year_fab";

	@Override
	public Vehicle insert(Vehicle vehicle) {
		String sql = "insert into vehicles (brand, model, plate, collor, year_fab) values (?,?,?,?,?)";
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, vehicle.getBrand());
			preparedStatement.setString(2, vehicle.getModel());
			preparedStatement.setString(3, vehicle.getPlate());
			preparedStatement.setString(4, vehicle.getCollor());
			preparedStatement.setInt(5, vehicle.getYear());
			
			preparedStatement.execute();
			
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				vehicle = new Vehicle (vehicle.getId(), vehicle.getBrand(), vehicle.getModel(), vehicle.getPlate(), vehicle.getCollor(), vehicle.getYear());
			}
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível inserir o registro");
		}
		return vehicle;
	}
	
	@Override
	public Vehicle update(Vehicle vehicle) {
	String sql = "update vehicles set brand = ?, model = ?, plate = ?, collor = ?, year_fab = ? where id = ?";
	try {
		Connection db = Database.getConnection();
		PreparedStatement preparedStatement = db.prepareStatement(sql);
		preparedStatement.setString(1, vehicle.getBrand());
		preparedStatement.setString(2, vehicle.getModel());
		preparedStatement.setString(3, vehicle.getPlate());
		preparedStatement.setString(4, vehicle.getCollor());
		preparedStatement.setInt(5, vehicle.getYear());
		preparedStatement.setInt(6, vehicle.getId());
		
		preparedStatement.executeUpdate();
		preparedStatement.close();
		db.close();
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println("Não foi possível atualizar o registro");
		}
	return vehicle;
	}
	
	@Override
	public List<Vehicle> findAll(){
		List<Vehicle> records = new ArrayList<>();
		String sql = "select * from vehicles";
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				records.add(fromResultSet(resultSet));
			}
			resultSet.close();
			preparedStatement.close();
			db.close();
			
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possível executar a operação no banco de dados");
		}
		return records;
	}
	
	private Vehicle fromResultSet(ResultSet resultSet) throws SQLException{
		Integer id = resultSet.getInt(COL_ID);
		String brand = resultSet.getString(COL_BRAND);
		String model = resultSet.getString(COL_MODEL);
		String plate = resultSet.getString(COL_PLATE);
		String collor = resultSet.getString(COL_COLLOR);
		Integer year = resultSet.getInt(COL_YEARFAB);
		return new Vehicle(id, brand, model, plate, collor, year);
	}

	@Override
	public Vehicle findById(Integer id) {
		Vehicle vehicle = null;
		String sql = "select * from vehicles where id = ?";
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				vehicle = fromResultSet(resultSet);
			}
			resultSet.close();
			preparedStatement.close();
			db.close();
			
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possível executar a operação no banco de dados");
		}
		return vehicle;
	}
	
	@Override
	public Vehicle remove(Integer id) {
		String sql = "delete from vehicles where id = ?";
		try {
			Connection db = Database.getConnection();
			PreparedStatement preparedStatement = db.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível remover o registro");
		}
		return null;
	}
}
