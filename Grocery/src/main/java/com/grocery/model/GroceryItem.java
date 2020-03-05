package com.grocery.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	private int amount;
	
	@Enumerated(EnumType.STRING)
	private GroceryType type;
	
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public GroceryType getType() {
		return type;
	}
	public void setType(GroceryType type) {
		this.type = type;
	}
	public GroceryItem() {
		super();
	}
	
	public GroceryItem(int id, String name, int price, int amount, GroceryType type, GroceryItem groceryItem) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.type = type;
		this.groceryItem = groceryItem;
	}
	
	@Override
	public String toString() {
		return "GroceryItem [id=" + id + ", name=" + name + ", price=" + price + ", amount=" + amount + ", type=" + type
				+ ", groceryItem=" + groceryItem + "]";
	}
}
