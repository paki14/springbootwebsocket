package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient",schema="websocket")
public class Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6754835304228619358L;
	@Id
	private Integer id;
	private String name;
	private double temperature;
	private double pulse;
	private double hartRates;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPulse() {
		return pulse;
	}

	public void setPulse(double pulse) {
		this.pulse = pulse;
	}

	public double getHartRates() {
		return hartRates;
	}

	public void setHartRates(double hartRates) {
		this.hartRates = hartRates;
	}

}
