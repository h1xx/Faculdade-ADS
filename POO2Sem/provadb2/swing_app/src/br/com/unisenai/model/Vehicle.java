package br.com.unisenai.model;

import java.util.Objects;

public class Vehicle {
	
	private Integer id;
	private String brand;
	private String model;
	private String plate;
	private String collor;
	private int year;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vehicle(Integer id, String brand, String model, String plate, String color, int year) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.plate = plate;
		this.collor = color;
		this.year = year;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getPlate() {
		return plate;
	}


	public void setPlate(String plate) {
		this.plate = plate;
	}


	public String getCollor() {
		return collor;
	}


	public void setCollor(String color) {
		this.collor = color;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", model=" + model + ", plate=" + plate + ", color=" + collor
				+ ", year=" + year + "]";
	}
	
	

	
	

}
