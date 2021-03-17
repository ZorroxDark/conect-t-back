package com.conectate.common.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NavigationItemDTO implements Serializable {

	
	private static final long serialVersionUID = -3366100010881065540L;
	
	
	  private String id;
	  private String title;
	  private String subtitle;
	  private String type;//: 'aside' | 'basic' | 'collapsable' | 'divider' | 'group' | 'spacer';
	   // hidden?: (item: TreoNavigationItem) => boolean;
	  private Boolean active;
	  private Boolean disabled;
	  private String link;
	  private Boolean externalLink;
	  private Boolean exactMatch;
	    //function?: (item: TreoNavigationItem) => void;
	  private String classes;
	  private String icon;
	  private String iconClasses;
	  private NavigationBadgeDTO badge;
	     
	  private String meta;
	  private List<NavigationItemDTO>  children = new ArrayList<NavigationItemDTO>();
	  
	  
}
