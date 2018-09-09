package com.examplejpa.objects;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarBreakDowns {

	@Id
	private int id;
	private List<CarBreakDown> carBreakDownList = new ArrayList<>();
	/**
	 * @return the carBreakDownList
	 */
	public List<CarBreakDown> getCarBreakDownList() {
		return carBreakDownList;
	}
	/**
	 * @param carBreakDownList the carBreakDownList to set
	 */
	public void setCarBreakDownList(List<CarBreakDown> carBreakDownList) {
		this.carBreakDownList = carBreakDownList;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
