package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController // Quando usada no lugar da anotação @Controller não é mais necessário usar a anotação @ResponseBody
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody // Se não for inserida essa anotação o spring considera que a navegação será feita para uma página
	public List<Topico> lista() {
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
	
		return Arrays.asList(topico,topico,topico);
	}
}
