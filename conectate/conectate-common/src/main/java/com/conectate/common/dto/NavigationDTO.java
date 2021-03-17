package com.conectate.common.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NavigationDTO implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -2366958113490866971L;
	  
	 private List<NavigationItemDTO>  compactNavigation;
	 private List<NavigationItemDTO>  defaultNavigation;
	 private List<NavigationItemDTO>  futuristicNavigation;
	 private List<NavigationItemDTO>  horizontalNavigation;
	 

}
