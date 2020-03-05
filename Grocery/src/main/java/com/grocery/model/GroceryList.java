package com.grocery.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class GroceryList {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int grocerylist_id;

	@Column
	private String name;
	
	@Column
	private String information;
	
	@OneToMany(mappedBy = "groceryItem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<GroceryItem>list;

	public int getGrocerylist_id() {
		return grocerylist_id;
	}

	public void setGrocerylist_id(int grocerylist_id) {
		this.grocerylist_id = grocerylist_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public List<GroceryItem> getList() {
		return list;
	}

	public void setList(List<GroceryItem> list) {
		this.list = list;
	}

	public GroceryList() {
		super();
	}

	public GroceryList(int grocerylist_id, String name, String information, List<GroceryItem> list) {
		super();
		this.grocerylist_id = grocerylist_id;
		this.name = name;
		this.information = information;
		this.list = list;
	}

	@Override
	public String toString() {
		return "GroceryList [grocerylist_id=" + grocerylist_id + ", name=" + name + ", information=" + information
				+ ", list=" + list + "]";
	}

    
	
}
