package br.gym.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gym.system.domain.Treino;

public interface TreinoDAO extends JpaRepository<Treino, Integer>{

}
