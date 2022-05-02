package br.gym.system.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PagamentoAluno {

 	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPagamento_Aluno;
	
 	@OneToOne
 	private Aluno aluno;
	
 	private LocalDate dataPagamento;
	
 	private double valor;
	
	public Integer getIdPagamento_Aluno() {
		return idPagamento_Aluno;
	}
	public void setIdPagamento_Aluno(Integer idPagamento_Aluno) {
		this.idPagamento_Aluno = idPagamento_Aluno;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
