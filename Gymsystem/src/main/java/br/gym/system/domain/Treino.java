package br.gym.system.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;


@Entity

public class Treino {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_treino;
	
	
	@Enumerated(EnumType.STRING)
	private Modalidade modalidade;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime dataTreino;
	
	private Integer qntAluno;
	
	@ManyToOne
	private Gerente gerente;
	
	@ManyToOne
	private Professor professor;	
	
	@ManyToOne
	private Aluno aluno;
	
	
	
	
	public Integer getId_treino() {
		return id_treino;
	}
	public void setId_treino(Integer id_treino) {
		this.id_treino = id_treino;
	}


	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Integer getQntAlunos() {
		return qntAluno;
	}
	public void setQntAluno(Integer qntAluno) {
		this.qntAluno = qntAluno;
	}
	public LocalDateTime getDataTreino() {
		return dataTreino;
	}
	public void setDataTreino(LocalDateTime dataTreino) {
		this.dataTreino = dataTreino;
	}
	
	

}
