package com.conectate.common.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1178009496000958398L;
	
	private UserItemDTO user;
	
	
	

}

/* ejemplo
id    : 'cfaad35d-07a3-4447-a6c3-d8c3d54fd5df',
name  : 'Miguel Angel',
email : 'watkins.andrew@company.com',
avatar: 'assets/images/avatars/logoVN.jpg',
status: 'online'
*/

