package br.gym.system.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.gym.system.dao.ProfessorDAO;
import br.gym.system.domain.Aluno;
import br.gym.system.domain.Professor;

@Controller
public class ProfessorController {

@Autowired
private ProfessorDAO professordao;

	@GetMapping("/cadastraProf")
	public String exibirCadastroProf() {
		return "cadastrar_professor";
		
	}
	
	@PostMapping("/cadastro") 
	public String cadastraProfessor(Professor professor) {
		this.professordao.save(professor);
		
		return "redirect:/cadastraProf" ;
		
	}
	
	@GetMapping("/listarProf")
	public String exibirListaProfessores() {
		return"listarProfessores";
	}
	//
		@ModelAttribute("/listarProfessor")
		public String listarProfessor( Model model) {
			model.addAttribute("lista", this.professordao.findAll());
			return"listarProfessores";
		}
																							
		//
		@GetMapping("/editarProfessores")
		public String editarProfessor(Integer id_professor, Model model) {
			if(id_professor!=null) {
				Professor professor=this.professordao.getById(id_professor);
				model.addAttribute("professor", professor);
			}else {
				model.addAttribute("professor", new Professor());
			}
			model.addAttribute("lista", this.professordao.findAll());
			return "editarProfessor";
		}
		
		@GetMapping("/excluirProfessor")
		public String excluirProfessor(Integer id_professor) {
		this.professordao.deleteById(id_professor);
		return "redirect:/listarProf";
		}
	
	
}
