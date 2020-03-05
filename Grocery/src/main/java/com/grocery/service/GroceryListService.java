package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dao.GroceryListDao;
import com.grocery.model.GroceryList;

@Service
public class GroceryListService {

	@Autowired
	GroceryListDao gd;
	
	public void setGd(GroceryListDao gd) {
		this.gd = gd;
	}
	
	public Iterable<GroceryListDao> getAll() {
		return gd.findAll();
	}
	
	public GroceryList getById(int id) {
		return gd.findById(id).get();
	}
	
	public void insertGroceryList(GroceryList gl) {
		gd.save(gl);
	}
	
	public void removeGroceryList(GroceryList gl) {
		gd.delete(gl);
	}
}
