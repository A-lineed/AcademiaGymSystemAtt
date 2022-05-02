package br.gym.system.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Aluno {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_aluno;
	
	@Column(length=60)
	private String nome;
	
	
	private String Sexo;
	
	
	@Column(length=11)
	private String cpf;
	
	@Column(length=11)
	private String rg;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataNascimento;
	
	@Column(length=11)
	private String telefone;
	
	@Column(length=50)
	private String email;
	
	@Column(length=50)
	private String senha;
	
	@Column(length=60)
	private String rua;
	
	@Column(length=10)
	private String numCasa;
	
	@Column(length=30)
	private String bairro;
	
	@Column(length=30)
	private String cidade;
	
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumCasa() {
		return numCasa;
	}
	public void setNumCasa(String numCasa) {
		this.numCasa = numCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Integer getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
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
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Object getRoles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
