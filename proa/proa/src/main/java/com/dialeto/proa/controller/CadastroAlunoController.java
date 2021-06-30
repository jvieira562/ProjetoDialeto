package com.dialeto.proa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroAlunoController {

	//@Autowired
	//private UserRepository userRepo;
	
	@GetMapping("/cadastroAluno")
	public String cadastroAluno() {
		return "cadastroAluno";
	}
	
}
