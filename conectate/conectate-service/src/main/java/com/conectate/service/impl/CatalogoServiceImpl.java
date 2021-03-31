package com.conectate.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conectate.common.dto.NavigationBadgeDTO;
import com.conectate.common.dto.NavigationDTO;
import com.conectate.common.dto.NavigationItemDTO;
import com.conectate.common.dto.UserDTO;
import com.conectate.common.dto.UserItemDTO;
import com.conectate.data.entity.NavegacionRole;
import com.conectate.data.entity.Usuario;
import com.conectate.data.repository.INavegacionDao;
import com.conectate.data.repository.IUsuarioDao;
import com.conectate.service.CatalogoService;
import com.conectate.service.utils.Utileria;


@Service
@Transactional(readOnly = true)
public class CatalogoServiceImpl implements CatalogoService{

	@Autowired
	private INavegacionDao navegacionDao;
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	
	
	@Transactional(readOnly = true)
	public NavigationDTO getNavigation(Long userId) {
		
		NavigationDTO result = new NavigationDTO();
		
		try {
			
			List<NavegacionRole> listNavRole = new ArrayList<NavegacionRole>();
			listNavRole = navegacionDao.findAll(); 
			
			List<NavigationItemDTO> listResultNivel_0 = new ArrayList<NavigationItemDTO>();
			List<NavigationItemDTO> listResultNivel_1 = new ArrayList<NavigationItemDTO>();
			List<NavigationItemDTO> listResultNivel_2 = new ArrayList<NavigationItemDTO>();
			
			List<NavigationItemDTO> listResultFinal = new ArrayList<NavigationItemDTO>();
			NavigationItemDTO navItemDto = new NavigationItemDTO();
			NavigationBadgeDTO navBadgeDto = new NavigationBadgeDTO();
			
			for(NavegacionRole navRole:listNavRole) {
			
				navItemDto = new NavigationItemDTO();
				navBadgeDto = new NavigationBadgeDTO();
				
				if(navRole.getCatNavegacion().getNivel() == 0) { // Encabezados 
					
					navItemDto.setActive(navRole.getCatNavegacion().getActive() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getActive()) : null);
					navItemDto.setDisabled(navRole.getCatNavegacion().getDisabled() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getDisabled()) : null);
					navItemDto.setExactMatch(navRole.getCatNavegacion().getExactMatch() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getExactMatch()) : null);
					navItemDto.setExternalLink(navRole.getCatNavegacion().getExternalLink() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getExternalLink()) : null);
					
					navBadgeDto.setBackground(navRole.getCatNavegacion().getBadgeBackground() != null ? navRole.getCatNavegacion().getBadgeBackground(): null);
					navBadgeDto.setColor(navRole.getCatNavegacion().getBadgeColor() != null ? navRole.getCatNavegacion().getBadgeColor(): null);
					navBadgeDto.setStyle(navRole.getCatNavegacion().getBadgeStyle() != null ? navRole.getCatNavegacion().getBadgeStyle(): null);
					navBadgeDto.setTitle(navRole.getCatNavegacion().getBadgeTitle() != null ? navRole.getCatNavegacion().getBadgeTitle(): null);
					
					navItemDto.setBadge(navBadgeDto);
					//navItem.setChildren(children);
					navItemDto.setClasses(navRole.getCatNavegacion().getClasses() != null ? navRole.getCatNavegacion().getClasses() : null);
					navItemDto.setIcon(navRole.getCatNavegacion().getIcon() != null ? navRole.getCatNavegacion().getIcon() : null);
					navItemDto.setIconClasses(navRole.getCatNavegacion().getIconClasses() != null ? navRole.getCatNavegacion().getIconClasses() : null);
					navItemDto.setId(navRole.getCatNavegacion().getId() != null ? navRole.getCatNavegacion().getId() : null);
					navItemDto.setLink(navRole.getCatNavegacion().getLink() != null ? navRole.getCatNavegacion().getLink() : null);
					navItemDto.setMeta(navRole.getCatNavegacion().getMeta() != null ? navRole.getCatNavegacion().getMeta() : null);
					navItemDto.setSubtitle(navRole.getCatNavegacion().getSubtitle() != null ? navRole.getCatNavegacion().getSubtitle() : null);
					navItemDto.setTitle(navRole.getCatNavegacion().getTitle() != null ? navRole.getCatNavegacion().getTitle() : null);
					navItemDto.setType(navRole.getCatNavegacion().getType() != null ? navRole.getCatNavegacion().getType() : null);
					
					listResultNivel_0.add(navItemDto);
				}
				
				if(navRole.getCatNavegacion().getNivel() == 1) { //Secciones
					
					navItemDto.setActive(navRole.getCatNavegacion().getActive() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getActive()) : null);
					navItemDto.setDisabled(navRole.getCatNavegacion().getDisabled() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getDisabled()) : null);
					navItemDto.setExactMatch(navRole.getCatNavegacion().getExactMatch() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getExactMatch()) : null);
					navItemDto.setExternalLink(navRole.getCatNavegacion().getExternalLink() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getExternalLink()) : null);
					
					navBadgeDto.setBackground(navRole.getCatNavegacion().getBadgeBackground() != null ? navRole.getCatNavegacion().getBadgeBackground(): null);
					navBadgeDto.setColor(navRole.getCatNavegacion().getBadgeColor() != null ? navRole.getCatNavegacion().getBadgeColor(): null);
					navBadgeDto.setStyle(navRole.getCatNavegacion().getBadgeStyle() != null ? navRole.getCatNavegacion().getBadgeStyle(): null);
					navBadgeDto.setTitle(navRole.getCatNavegacion().getBadgeTitle() != null ? navRole.getCatNavegacion().getBadgeTitle(): null);
					
					navItemDto.setBadge(navBadgeDto);
					//navItem.setChildren(children);
					navItemDto.setClasses(navRole.getCatNavegacion().getClasses() != null ? navRole.getCatNavegacion().getClasses() : null);
					navItemDto.setIcon(navRole.getCatNavegacion().getIcon() != null ? navRole.getCatNavegacion().getIcon() : null);
					navItemDto.setIconClasses(navRole.getCatNavegacion().getIconClasses() != null ? navRole.getCatNavegacion().getIconClasses() : null);
					navItemDto.setId(navRole.getCatNavegacion().getId() != null ? navRole.getCatNavegacion().getId() : null);
					navItemDto.setLink(navRole.getCatNavegacion().getLink() != null ? navRole.getCatNavegacion().getLink() : null);
					navItemDto.setMeta(navRole.getCatNavegacion().getMeta() != null ? navRole.getCatNavegacion().getMeta() : null);
					navItemDto.setSubtitle(navRole.getCatNavegacion().getSubtitle() != null ? navRole.getCatNavegacion().getSubtitle() : null);
					navItemDto.setTitle(navRole.getCatNavegacion().getTitle() != null ? navRole.getCatNavegacion().getTitle() : null);
					navItemDto.setType(navRole.getCatNavegacion().getType() != null ? navRole.getCatNavegacion().getType() : null);
					
					listResultNivel_1.add(navItemDto);
				}
				
				if(navRole.getCatNavegacion().getNivel() == 2) { // SubSecciones
					
					navItemDto.setActive(navRole.getCatNavegacion().getActive() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getActive()) : null);
					navItemDto.setDisabled(navRole.getCatNavegacion().getDisabled() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getDisabled()) : null);
					navItemDto.setExactMatch(navRole.getCatNavegacion().getExactMatch() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getExactMatch()) : null);
					navItemDto.setExternalLink(navRole.getCatNavegacion().getExternalLink() != null ? Utileria.setIntABoolean(navRole.getCatNavegacion().getExternalLink()) : null);
					
					navBadgeDto.setBackground(navRole.getCatNavegacion().getBadgeBackground() != null ? navRole.getCatNavegacion().getBadgeBackground(): null);
					navBadgeDto.setColor(navRole.getCatNavegacion().getBadgeColor() != null ? navRole.getCatNavegacion().getBadgeColor(): null);
					navBadgeDto.setStyle(navRole.getCatNavegacion().getBadgeStyle() != null ? navRole.getCatNavegacion().getBadgeStyle(): null);
					navBadgeDto.setTitle(navRole.getCatNavegacion().getBadgeTitle() != null ? navRole.getCatNavegacion().getBadgeTitle(): null);
					
					navItemDto.setBadge(navBadgeDto);
					//navItem.setChildren(children);
					navItemDto.setClasses(navRole.getCatNavegacion().getClasses() != null ? navRole.getCatNavegacion().getClasses() : null);
					navItemDto.setIcon(navRole.getCatNavegacion().getIcon() != null ? navRole.getCatNavegacion().getIcon() : null);
					navItemDto.setIconClasses(navRole.getCatNavegacion().getIconClasses() != null ? navRole.getCatNavegacion().getIconClasses() : null);
					navItemDto.setId(navRole.getCatNavegacion().getId() != null ? navRole.getCatNavegacion().getId() : null);
					navItemDto.setLink(navRole.getCatNavegacion().getLink() != null ? navRole.getCatNavegacion().getLink() : null);
					navItemDto.setMeta(navRole.getCatNavegacion().getMeta() != null ? navRole.getCatNavegacion().getMeta() : null);
					navItemDto.setSubtitle(navRole.getCatNavegacion().getSubtitle() != null ? navRole.getCatNavegacion().getSubtitle() : null);
					navItemDto.setTitle(navRole.getCatNavegacion().getTitle() != null ? navRole.getCatNavegacion().getTitle() : null);
					navItemDto.setType(navRole.getCatNavegacion().getType() != null ? navRole.getCatNavegacion().getType() : null);
					
					listResultNivel_2.add(navItemDto);
				}
				
			 }
			
			
			int contador = 0;
			for(NavigationItemDTO seccion:  listResultNivel_1) {
				//-----> Encabezado
				//----------> Seccion
			    //--------------> subSeccion
				
				for(NavigationItemDTO hijo:  listResultNivel_2) {
					
					String[] partsPadre =  seccion.getId().split("\\.");
					String[] partsHijo  =  hijo.getId().split("\\.");
					
					if(partsPadre[0].equals(partsHijo[0])) {
						listResultNivel_1.get(contador).getChildren().add(hijo);
					}
					
				}
			
				contador++;
			}
			
			 contador = 0;
			for(NavigationItemDTO encabeza:  listResultNivel_0) {
				//-----> Encabezado
				//----------> Seccion
				
				for(NavigationItemDTO hijo:  listResultNivel_1) {
					String[] partsPadre = encabeza.getId().split("\\.");
					String[] partsHijo  =  hijo.getId().split("\\.");
					
					if(partsPadre[0].equals(partsHijo[0])) {
						listResultNivel_0.get(contador).getChildren().add(hijo);
					}
					
				}
				
				contador++;
			}
			
			
			
			result.setDefaultNavigation(listResultNivel_0);
			
			
			
			
			
		}catch(Exception e) {
			System.out.println("Error --> "+ e);
			
		}
		return result;
		

		
	}
	/*********** Ejemplo *************/


	@Override
	public UserDTO getInfoUser(int userCon) {
		UserDTO userDTO = new UserDTO();
		UserItemDTO userItemDTO = new UserItemDTO();
		
		try {
			Usuario user = usuarioDao.findByUsuarioIdCon(userCon);
			
			
			
			
			userItemDTO.setAvatar("assets/images/avatars/logoVN.jpg");
			userItemDTO.setEmail(user.getUserEmail());
			userItemDTO.setId(String.valueOf(user.getIdUsuario()));
			userItemDTO.setName("Miguel ZorroxDarks Super Admin");
			userItemDTO.setStatus("online");
			
			
			userDTO.setUser(userItemDTO);
			
		}catch (Exception e) {
			System.out.println("Error :"+e);
		}
		
		
		
		return userDTO;
		
	}
	
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
