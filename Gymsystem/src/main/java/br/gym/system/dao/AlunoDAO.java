package br.gym.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gym.system.domain.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Integer>{

	Aluno findByEmailAndSenha(String email, String senha);

	 
} 

