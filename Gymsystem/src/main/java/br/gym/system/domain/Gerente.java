package br.gym.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerente {

	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id_gerente;

private String chaveAcesso;

@Column(length=50)
private String email;

@Column(length=11)
private String telefone;


public Integer getId_gerente() {
	return id_gerente;
}
public void setId_gerente(Integer id_gerente) {
	this.id_gerente = id_gerente;
}
public String getChaveAcesso() {
	return chaveAcesso;
}
public void setChaveAcesso(String chaveAcesso) {
	this.chaveAcesso = chaveAcesso;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

}
