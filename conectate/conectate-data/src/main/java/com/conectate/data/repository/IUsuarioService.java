package com.conectate.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conectate.data.entity.Usuario;
@Repository
public interface IUsuarioService extends CrudRepository<Usuario, Long>{
	

	
	@Query ("SELECT u FROM Usuario u where u.userEmail =?1")
	public Usuario findByUserEmailShow(String email);
	
	
}
