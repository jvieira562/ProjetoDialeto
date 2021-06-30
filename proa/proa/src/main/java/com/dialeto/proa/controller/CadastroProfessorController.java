package com.dialeto.proa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroProfessorController {
	
	@GetMapping("/cadastroProfessor")
	public String cadastroProfessor()	{
		return "cadastroProfessor";
	}

}
