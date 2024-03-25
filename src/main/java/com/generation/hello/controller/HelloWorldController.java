package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping() // Requisições do tipo GET/Busca
	public String hello() {
		return "Hello World <BR> As BSMs da Generation Brazil são: <BR> Orietação ao Futuro / Responsabilidade Pessoal / Mentalidade de Crescimento / Persitência / Trabalho em Equipe / Orientação ao Detalhe / Proatividade / Comunicação.";
	}
	
}
