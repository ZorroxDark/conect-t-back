package com.conectate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conectate.data.entity.CatRol;
import com.conectate.data.entity.Usuario;
import com.conectate.data.entity.UsuarioRole;
import com.conectate.data.repository.IUsuarioDao;

@Service
@Transactional(readOnly = true)
public class UsuarioService implements UserDetailsService{

	@Autowired
	private IUsuarioDao usuarioDao;
	

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUserEmail(username);
		boolean statusUser = false;
		
		
		if(usuario == null) {
			//logger.error("Error en el login: noexiste el usuario '"+username+"' en el sistema ! ");
			throw new UsernameNotFoundException("Error en el login: noexiste el usuario '"+username+"' en el sistema ! ");
			
		}
		
		//Valida Usuario 
		if(usuario.getCatStatusUsuario().getIdcatStatusUsuario() == 1) {
			statusUser = true; 
		}
		
		for(UsuarioRole temp:usuario.getUserRol()) {
			
			System.out.println("ROLE : "+temp.getIdUsuRol());
			System.out.println("ROLE : "+temp.getCatRol().getClaveRol());
			//System.out.println("ROLE : "+temp.getCatRol2().getClaveRol());
		}
		
//		List<GrantedAuthority> authorities = usuario.getUserRol()
//				.stream()
//				.map(role -> 
//					new SimpleGrantedAuthority(  new StringBuilder(("ROLE_").append(role.getCatRol().getClaveRol()))  )
//				.peek( authority -> System.out.println("Role: " + authority.getAuthority()))
//				.collect(Collectors.toList());
		//  grantedAuthorities.add(new SimpleGrantedAuthority(new StringBuilder("ROLE_").append(perfilUsuario.getCatPerfil().getNombre()).toString()));

		
	  List<GrantedAuthority> authorities = usuario.getUserRol()
							.stream()
							.map(role -> new SimpleGrantedAuthority(  new StringBuilder("ROLE_").append(role.getCatRol().getClaveRol()).toString()    
									))
							.peek(authority -> System.out.println("Role: " + authority.getAuthority()))
							.collect(Collectors.toList());



		return new User(usuario.getUserEmail(),usuario.getUserPwd(),statusUser,true , true,true,authorities );
	}

}
