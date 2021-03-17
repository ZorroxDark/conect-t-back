package com.conectate.common.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NavigationBadgeDTO implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5176313617641709546L;
	
	
	private String title;
    private String style;// 'rectangle' | 'rounded' | 'simple',
    private String background;
    private String color;


}
