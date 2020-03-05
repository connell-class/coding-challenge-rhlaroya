package com.grocery.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GroceryListDao extends CrudRepository<GroceryListDao, Integer> {

}
