package com.conectate.web.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.conectate.data.entity.Usuario;
import com.conectate.data.repository.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {
	

	@Autowired
	private IUsuarioService usuarioService;
	
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		
		Usuario usuario = usuarioService.findByUserEmailShow(authentication.getName());
		
		Map<String, Object> info = new HashMap<>();
		info.put("usuario_matricula", usuario.getUserMatricula());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
