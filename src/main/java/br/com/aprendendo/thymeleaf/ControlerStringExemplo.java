package br.com.aprendendo.thymeleaf;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Para testar: 
 *	http://localhost:8080/ola/artur
 */
@Controller
public class ControlerStringExemplo {
	
	@RequestMapping("/ola/{nome}")
	public @ResponseBody String olaThymeleaf(Map model, @PathVariable("nome") String nome) {
		return "Ola " + nome;
		
	}

}
