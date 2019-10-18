package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CervejasController {
	//Configurar URL
	
	
	
	//Controle desvolvendo o nome da View
	
	@RequestMapping("/cervejas/novo")
	public String novo() {
		
		return "cerveja/CadastroCerveja";
	}
}
