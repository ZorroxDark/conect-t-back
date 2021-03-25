package com.conectate.common.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserItemDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -669990610990496376L;
	
	
	private String id;
	private String name;
	private String email;
	private String avatar;
	private String status;

}
