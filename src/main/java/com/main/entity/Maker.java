package com.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Maker")
public class Maker {
	
	public Maker() {
	}

	public Maker(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Maker(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "maker_id")
	@SequenceGenerator(name = "makerSeq", sequenceName = "makerSeq", allocationSize = 1)
	@GeneratedValue(generator = "makerSeq", strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Maker [id=" + id + ", name=" + name + "]";
	}
	
	
}
