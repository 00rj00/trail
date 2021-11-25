package com.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="furniture")
public class Furniture 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int furnitureId;
	
	private String furnitureName;

	private String furnitureModel;
	
	private String furnitureColor;
	
	
	private int price;

	public int getFurnitureId() {
		return furnitureId;
	}

	public void setFurnitureId(int furnitureId) {
		this.furnitureId = furnitureId;
	}

	public String getFurnitureName() {
		return furnitureName;
	}

	public void setFurnitureName(String furnitureName) {
		this.furnitureName = furnitureName;
	}

	public String getFurnitureModel() {
		return furnitureModel;
	}

	public void setFurnitureModel(String furnitureModel) {
		this.furnitureModel = furnitureModel;
	}

	public String getFurnitureColor() {
		return furnitureColor;
	}

	public void setFurnitureColor(String furnitureColor) {
		this.furnitureColor = furnitureColor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Furniture [furnitureId=" + furnitureId + ", furnitureName=" + furnitureName + ", furnitureModel="
				+ furnitureModel + ", furnitureColor=" + furnitureColor + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(furnitureColor, furnitureId, furnitureModel, furnitureName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furniture other = (Furniture) obj;
		return Objects.equals(furnitureColor, other.furnitureColor) && furnitureId == other.furnitureId
				&& Objects.equals(furnitureModel, other.furnitureModel)
				&& Objects.equals(furnitureName, other.furnitureName) && price == other.price;
	}

	public Furniture(int furnitureId, String furnitureName, String furnitureModel, String furnitureColor, int price) {
		super();
		this.furnitureId = furnitureId;
		this.furnitureName = furnitureName;
		this.furnitureModel = furnitureModel;
		this.furnitureColor = furnitureColor;
		this.price = price;
	}

	public Furniture() {
		super();
	}
	
	
	

}
