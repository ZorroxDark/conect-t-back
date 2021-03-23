package com.conectate.service.utils;

public class Utileria {
	
	public static Boolean setIntABoolean(Integer valor) {
		
		Boolean result = null;
		
		if(valor == 0) {
			result = false;
			
		}else if(valor == 1) {
			result = true;
		}
		return result;
		
	}

}
