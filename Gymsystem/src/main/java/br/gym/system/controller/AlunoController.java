package br.gym.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.gym.system.dao.AlunoDAO;
import br.gym.system.domain.Aluno;



@Controller
public class AlunoController {
	
	@Autowired 
	private AlunoDAO alunoDAO;
	
	@GetMapping("/homeAluno")
	public String homeAluno() {
		return"tela_aluno";
	}
	
	@GetMapping("/listarAlunos")
	public String exibirLista() {
		return"listarteste";
	}

	@PostMapping("/resetSenha") 
	public String resetarSenha(Aluno aluno) {

	return "tela_recuperacao_senha1";
	}
	
	
	
	@GetMapping("/formAluno")
	public String exibirForm() {
		return "cadastrar_aluno";
	}
	
	@PostMapping("/salvarAluno")
	public String salvarAluno(Aluno aluno) {
		this.alunoDAO.save(aluno);
		return"redirect:/login";
	}
	//model??
	@ModelAttribute("/listarAluno")
	public String listarAluno( Model model) {
		model.addAttribute("lista", this.alunoDAO.findAll());
		return"listarteste";
	}
																						
	//model??
	@GetMapping("/editarAluno")
	public String editarAluno(Integer id_aluno, Model model) {
		if(id_aluno!=null) {
			Aluno aluno=this.alunoDAO.getById(id_aluno);
			model.addAttribute("aluno", aluno);
		}else {
			model.addAttribute("aluno", new Aluno());
		}
		model.addAttribute("aluno", this.alunoDAO.findAll());
		return "editarAluno";
	}
	
	@GetMapping("/excluirAluno")
	public String excluirAluno(Integer id_aluno) {
	this.alunoDAO.deleteById(id_aluno);
	return "redirect:/listarAlunos";
	}
}
