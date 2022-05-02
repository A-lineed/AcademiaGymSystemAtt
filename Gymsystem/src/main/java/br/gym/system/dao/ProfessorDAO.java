package br.gym.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gym.system.domain.Professor;

public interface ProfessorDAO extends JpaRepository<Professor, Integer>{

}
