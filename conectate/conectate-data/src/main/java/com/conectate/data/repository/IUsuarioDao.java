package com.conectate.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.conectate.data.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	
	public Usuario findByUserEmail(String email);
	
	@Query ("SELECT u FROM Usuario u where u.userEmail =?1")
	public Usuario findByUserEmail2(String email);
	
	

}
