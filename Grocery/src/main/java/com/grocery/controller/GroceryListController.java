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
import com.grocery.model.GroceryList;
import com.grocery.service.GroceryListService;

@RestController
@RequestMapping(value = "/groceryl")
@CrossOrigin(origins = "http://localhost:3000")
public class GroceryListController {

	@Autowired
	GroceryListService gs;
	
	@GetMapping("/{id}")
	public GroceryList findById(@PathVariable("id") int id) {
		return gs.getById(id);
	}
	
	@GetMapping("/all")
	public Iterable<GroceryList> findAll() {
		return gs.getAll();
	}
	
	@PostMapping("/add")
	public String insert(@RequestBody GroceryList gl) {
		gs.insertGroceryList(gl);
		return "Inserted Grocery List";
	}
	
	@DeleteMapping("/remove")
    public String delete(@RequestBody GroceryList gl) {
        gs.removeGroceryList(gl);
        return "Grocery List has been removed";
    }
	
}
