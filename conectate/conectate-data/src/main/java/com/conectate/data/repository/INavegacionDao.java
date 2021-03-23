package com.conectate.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.conectate.data.entity.NavegacionRole;


public interface INavegacionDao  extends CrudRepository<NavegacionRole, Long>{
	
	public List<NavegacionRole> findAll(); 

}
