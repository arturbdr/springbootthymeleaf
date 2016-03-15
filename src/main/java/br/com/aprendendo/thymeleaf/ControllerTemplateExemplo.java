package br.com.aprendendo.thymeleaf;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Para testar: 
 *	http://localhost:8080/olaThymeleaf/artur
 */
@Controller
public class ControllerTemplateExemplo {
	
	@RequestMapping("/olaThymeleaf/{nome}")
	public String olaThymeleaf(Map model, @PathVariable("nome") String nome) {
		model.put("nome", nome);
		return "hello";
	}

}
