package com.grocery.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grocery.model.GroceryItem;

@Repository
@Transactional
public interface GroceryItemDao extends CrudRepository<GroceryItem, Integer> {

}
