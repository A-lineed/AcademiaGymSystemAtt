package br.gym.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.gym.system.dao.ProfessorDAO;
import br.gym.system.dao.TreinoDAO;
import br.gym.system.domain.Modalidade;
import br.gym.system.domain.Professor;
import br.gym.system.domain.Treino;

@Controller
public class TreinoController {

	@Autowired 
	private TreinoDAO treinodao;
	
	@Autowired
	private ProfessorDAO professordao;
	
	@GetMapping("/treino")
	public String exibirCadastroTreino() {
		return "cadastrar_treino";
		
	}
	
	@PostMapping("/cadastraTreino") 
	public String cadastraTreino(Treino treino) {
		this.treinodao.save(treino);
		
		return "redirect:/treino" ;
		
	}
	
	@ModelAttribute("enum_modalidade")
	public Modalidade[] getModalidade() {
	return Modalidade.values();
	}
	
	@ModelAttribute("lista_prof")
	public List<Professor> getProfessor() {
	return professordao.findAll();
	}
	 
	
	@GetMapping("/listarTreinos")
	public String exibirListaTreino() {
		return"listarTreinos";
	}
	//
		@ModelAttribute("/listarTreino")
		public String listarTreino (Model model) {
			model.addAttribute("lista", this.treinodao.findAll());
			return"listarTreinos";
		}
																							
		//
		@GetMapping("/editarTreinos")
		public String editarTreino(Integer id_treino, Model model) {
			if(id_treino!=null) {
				Treino treino=this.treinodao.getById(id_treino);
				model.addAttribute("treino", treino);
			}else {
				model.addAttribute("treino", new Treino());
			}
			model.addAttribute("lista", this.treinodao.findAll());
			return "editarTreino";
		}
		
		@GetMapping("/excluirTreino")
		public String excluirTreino(Integer id_treino) {
		this.professordao.deleteById(id_treino);
		return "redirect:/listarTreino";
		}
	
	
	
}
