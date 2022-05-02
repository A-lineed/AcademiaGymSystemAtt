package br.gym.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gym.system.domain.PagamentoAluno;

public interface PagamentoAlunoDAO extends JpaRepository<PagamentoAluno, Integer>{

}
