package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dao.GroceryItemDao;
import com.grocery.model.GroceryItem;

@Service
public class GroceryItemService {

	@Autowired
	GroceryItemDao gid;
	
	public void setgid(GroceryItemDao gid) {
        this.gid = gid;
    }

	public Iterable<GroceryItem> getAll() {
		return gid.findAll();
	}
	
	public GroceryItem getById(int id) {
		return gid.findById(id).get();
	}
	
	public void insertGroceryItem(GroceryItem gi) {
		gid.save(gi);
	}
	
	public void removeGroceryItem(GroceryItem gi) {
		gid.delete(gi);
	}
}