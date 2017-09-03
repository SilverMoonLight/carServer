package com.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "Car")
public class Car {

	public Car() {
	}

	public Car(int id, String description, String imagePath, int door, int miles, int year, String model,
			int passengers, float price, Maker maker) {
		this.id = id;
		this.description = description;
		this.imagePath = imagePath;
		this.door = door;
		this.miles = miles;
		this.year = year;
		this.model = model;
		this.passengers = passengers;
		this.price = price;
		this.maker = maker;
	}
	
	

	public Car(String description, String imagePath, int door, int miles, int year, String model, int passengers,
			float price, Maker maker) {
		this.description = description;
		this.imagePath = imagePath;
		this.door = door;
		this.miles = miles;
		this.year = year;
		this.model = model;
		this.passengers = passengers;
		this.price = price;
		this.maker = maker;
	}



	@Id
	@Column(name = "car_id")
	@SequenceGenerator(name = "carSeq", sequenceName = "carSeq", allocationSize = 1)
	@GeneratedValue(generator = "carSeq", strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "description")
	private String description;

	@Column(name = "imagePath")
	private String imagePath;

	@Column(name = "door")
	private int door;

	@Column(name = "miles")
	private int miles;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "model", nullable = false)
	private String model;

	@Column(name = "passengers")
	@Min(1)
	private int passengers;

	@Column(name = "price")
	private float price;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maker_id")
	private Maker maker;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Maker getMaker() {
		return maker;
	}

	public void setMaker(Maker maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", description=" + description + ", imagePath=" + imagePath + ", door=" + door
				+ ", miles=" + miles + ", year=" + year + ", model=" + model + ", passengers=" + passengers + ", price="
				+ price + ", maker=" + maker + "]";
	}
	
	

}
