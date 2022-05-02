package br.gym.system.pdf.generator.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.gym.system.dao.*;
import br.gym.system.domain.Aluno;


@Service
@Transactional
public class AlunoServices {
	
	 @Autowired
	    private AlunoDAO alunoDAO;
	     
	    public List<Aluno> listAll() {
	        return alunoDAO.findAll(Sort.by("email").ascending());
	    }

}
