package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loads {

	@Id
	private long id;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private long weight;
	private long noOfTrucks;
	private String date;
	private String description;

	public Loads(long id, String loadingPoint, String unloadingPoint, String productType, long weight, long noOfTrucks,
			String date, String description) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.weight = weight;
		this.noOfTrucks = noOfTrucks;
		this.date = date;
		this.description = description;
	}

	public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public long getNoOfTrucks() {
		return noOfTrucks;
	}

	@Override
	public String toString() {
		return "Loads [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", weight=" + weight + ", noOfTrucks=" + noOfTrucks + ", date=" + date
				+ ", description=" + description + "]";
	}

	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
