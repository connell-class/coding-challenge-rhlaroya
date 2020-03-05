package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dao.GroceryListDao;
import com.grocery.model.GroceryList;

@Service
public class GroceryListService {

	@Autowired
	GroceryListDao gld;
	
	public void setgid(GroceryListDao gld) {
        this.gld = gld;
    }
	
	public Iterable<GroceryList> getAll() {
		return gld.findAll();
	}
	
	public GroceryList getById(int id) {
		return gld.findById(id).get();
	}
	
	public void insertGroceryList(GroceryList gl) {
		gld.save(gl);
	}
	
	public void removeGroceryList(GroceryList gl) {
		gld.delete(gl);
	}
}
