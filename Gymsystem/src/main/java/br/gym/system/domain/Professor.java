package br.gym.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Professor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_professor;
	
	@Column(length=60)
	private String nome;
	
	@Column(length=20)
	private String cpf;
	
	public Integer getId_professor() {
		return id_professor;
	}
	public void setId_professor(Integer id_professor) {
		this.id_professor = id_professor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
