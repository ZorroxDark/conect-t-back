package com.conectate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conectate.data.entity.Usuario;
import com.conectate.data.repository.IUsuarioDao;

@Service

public class UsuarioService implements UserDetailsService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUserEmail(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Error en el login: noexiste el usuario '"+username+"' en el sistema ! ");
			
		}
		
		SimpleGrantedAuthority simple =new  SimpleGrantedAuthority("AMDIN");
		
		List<GrantedAuthority> authorities =new ArrayList<GrantedAuthority>(); 
		authorities.add(simple);
		
		return new User(usuario.getUserEmail(),usuario.getUserPwd(),true,true , true,true,authorities );
	}

}
