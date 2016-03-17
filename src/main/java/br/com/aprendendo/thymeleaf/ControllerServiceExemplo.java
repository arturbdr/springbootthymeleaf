package br.com.aprendendo.thymeleaf;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.domain.vo.PessoaVO;

/**
 * Para testar: 
 *	http://localhost:8080/ola/artur.json (para ter um retorno do tipo JSON)
 *	ou
 *	http://localhost:8080/ola/artur.xml (para ter um retorno do tipo XML)
 */
@RestController
public class ControllerServiceExemplo {
	
	public ControllerServiceExemplo(){
		System.out.println("construtor padrao");
	}
	
	public PessoaVO pessoa;
	
	@PostConstruct
	public void init() {
		System.out.println("init - PostConstruct");
		pessoa = new PessoaVO();
		pessoa.setIdade(31);
	}
	
	@RequestMapping("/ola/{nome}")
	public PessoaVO olaThymeleaf(Map model, @PathVariable("nome") String nome) {
		pessoa.setNome(nome);
		return pessoa;
		
	}

}
