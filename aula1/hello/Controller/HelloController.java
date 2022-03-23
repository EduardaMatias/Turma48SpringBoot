package com.helloworld.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao futuro; \nResponsabilidade Pessoal; \nMentalidade de Crescimento"
				+ "\nPersistência; \nTrabalho em equipe; \nAtenção aos Detalhes; \nProatividade;"
				+ "\nComunicação.";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprender conceitos básicos do Spring";
	}
}



