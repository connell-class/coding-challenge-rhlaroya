package com.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.service.GroceryListService;

@RestController
@RequestMapping(value = "/groceryl")
@CrossOrigin(origins = "http://localhost:3000")
public class GroceryListController {

	@Autowired
	GroceryListService gs;
	
	
}
