package com.conectate.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.conectate.common.dto.NavigationDTO;
import com.conectate.common.dto.NavigationItemDTO;
import com.conectate.service.CatalogoService;


@RestController
@RequestMapping("/catalogo")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
public class CatalogosController {
	
	@Autowired
	CatalogoService catalogoService;

	 @GetMapping(value = "/getNavegacion/{idUser}")
	 public ResponseEntity<NavigationDTO> getNavigation(){
		 return new ResponseEntity<NavigationDTO>(catalogoService.getNavigation(), HttpStatus.OK);
	 }
	
	 
	 
	 

}





