package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Quando usada no lugar da anotação @Controller não é mais necessário usar a anotação @ResponseBody
public class HelloController {

	@RequestMapping("/")
	@ResponseBody // Se não for inserida essa anotação o spring considera que a navegação será feita para uma página
	public String hello() {
		return "Hello World!";
	}
}
