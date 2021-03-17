package com.conectate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conectate.common.dto.NavigationDTO;
import com.conectate.common.dto.NavigationItemDTO;
import com.conectate.service.CatalogoService;


@Service
public class CatalogoServiceImpl implements CatalogoService{

	
	
	
	@Transactional(readOnly = true)
	public NavigationDTO getNavigation() {
		
		NavigationDTO navigationDTO = new NavigationDTO();
		
		List<NavigationItemDTO> listResult = new ArrayList<NavigationItemDTO>();
		List<NavigationItemDTO> listChildrenSub1 = new ArrayList<NavigationItemDTO>();
		
		NavigationItemDTO navItem = new NavigationItemDTO();
		NavigationItemDTO navChildren = new NavigationItemDTO();
		NavigationItemDTO navChildrenSub1 = new NavigationItemDTO();
		
		navItem.setId("congregates");
		navItem.setTitle("Congregantes");
		navItem.setSubtitle("Informacion de general congregantes");
		navItem.setType("group");
		navItem.setIcon("heroicons_outline:home");
		
		
		navChildren.setId("congregates.con");
		navChildren.setTitle("Congregantes");
		navChildren.setType("collapsable");
		navChildren.setIcon("heroicons_outline:user-group");
		navChildren.setLink("/dashboards/finance");
		
		
			navChildrenSub1.setId("congregates.con.general");
			navChildrenSub1.setTitle("General");
			navChildrenSub1.setType("basic");
			navChildrenSub1.setLink("/dashboards/finance"); 
			navChildren.getChildren().add(navChildrenSub1);
		    
			navChildrenSub1 = new NavigationItemDTO();
			
			navChildrenSub1.setId("congregates.con.servidores");
			navChildrenSub1.setTitle("Servidores");
			navChildrenSub1.setType("basic");
			navChildrenSub1.setLink("/dashboards/finance"); 
			navChildren.getChildren().add(navChildrenSub1);
			
		
		/*
		children: [
                   {
                       id   : 'applications.ecommerce.inventory',
                       title: 'Inventory',
                       type : 'basic',
                       link : '/apps/ecommerce/inventory'
                   }
               ]*/
		
		navItem.getChildren().add(navChildren);
		//navChildren = new NavigationItemDTO();
		
		
		/*
		navChildren.setId("dashboards.analytics");
		navChildren.setTitle("Analytics");
		navChildren.setType("basic");
		navChildren.setIcon("heroicons_outline:chart-pie");
		navChildren.setLink("/dashboards/analytics");
		
		navItem.getChildren().add(navChildren);
		navChildren = new NavigationItemDTO();
		
		navChildren.setId("dashboards.crypto");
		navChildren.setTitle("Crypto");
		navChildren.setType("basic");
		navChildren.setIcon("heroicons_outline:currency-dollar");
		navChildren.setLink("/dashboards/crypto");
		
		navItem.getChildren().add(navChildren);
		navChildren = new NavigationItemDTO();
		*/
		
		
		listResult.add(navItem);
		
		navigationDTO.setDefaultNavigation(listResult);
		
		
		return navigationDTO;
		
		
	}
	/*********** Ejemplo *************/
	
	/*
	 *  id      : 'dashboards',
        title   : 'Dashboards',
        subtitle: 'Unique dashboard designs',
        type    : 'group',
        icon    : 'heroicons_outline:home',
        children: [
            {
                id   : 'dashboards.finance',
                title: 'Finance',
                type : 'basic',
                icon : 'heroicons_outline:cash',
                link : '/dashboards/finance'
            },
            {
                id   : 'dashboards.analytics',
                title: 'Analytics',
                type : 'basic',
                icon : 'heroicons_outline:chart-pie',
                link : '/dashboards/analytics'
            },
            {
                id   : 'dashboards.crypto',
                title: 'Crypto',
                type : 'basic',
                icon : 'heroicons_outline:currency-dollar',
                link : '/dashboards/crypto'
            }
        ]
    },
	 */
	

}
