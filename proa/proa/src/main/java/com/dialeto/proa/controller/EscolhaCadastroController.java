package com.dialeto.proa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EscolhaCadastroController {

	@GetMapping("/escolhaCadastro")
	public String escolhaCadastro()	{
		return "escolhaCadastro";
	}
	
}
