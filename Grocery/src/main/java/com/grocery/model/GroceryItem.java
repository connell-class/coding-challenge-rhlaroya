package com.grocery.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class GroceryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int price;
	
	@Column
	private String type;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "list")
	private GroceryItem groceryItem;
	
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
	public int getPrice() {
		return price;
	}

	public GroceryItem getGroceryItem() {
		return groceryItem;
	}
	public void setGroceryItem(GroceryItem groceryItem) {
		this.groceryItem = groceryItem;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public GroceryItem() {
		super();
	}
	public GroceryItem(int id, String name, int price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "GroceryItem [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", groceryItem="
				+ groceryItem + "]";
	}
	
	public GroceryItem(int id, String name, int price, String type, GroceryItem groceryItem) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.groceryItem = groceryItem;
	}
	
	

	
}
