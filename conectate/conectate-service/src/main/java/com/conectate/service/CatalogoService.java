package com.conectate.service;

import com.conectate.common.dto.NavigationDTO;
import com.conectate.common.dto.UserDTO;


public interface CatalogoService {
	
	NavigationDTO getNavigation(Long userId);
	
	UserDTO getInfoUser(int userCon);

}
