package br.com.domain.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaVO {
	
	String nome;
	Integer idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

}
