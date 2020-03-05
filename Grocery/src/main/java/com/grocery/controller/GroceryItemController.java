package com.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.model.GroceryItem;
import com.grocery.service.GroceryItemService;

@RestController
@RequestMapping(value = "/groceryi")
@CrossOrigin(origins = "http://localhost:3000")
public class GroceryItemController {

	@Autowired
	GroceryItemService gs;
	
	@GetMapping("/{id}")
	public GroceryItem findById(@PathVariable("id") int id) {
		return gs.getById(id);
	}
	
	@GetMapping("/all")
	public Iterable<GroceryItem> findAll() {
		return gs.getAll();
	}
	
	@PostMapping("/add")
	public String insert(@RequestBody GroceryItem gi) {
		gs.insertGroceryItem(gi);
		return "Saved Grocery Item";
	}
	
	@DeleteMapping("/remove")
    public String delete(@RequestBody GroceryItem gi) {
        gs.removeGroceryItem(gi);
        return "Grovery Item has been removed";
    }
	
}
