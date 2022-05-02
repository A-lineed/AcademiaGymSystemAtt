package br.gym.system.acesso;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.gym.system.dao.AlunoDAO;
import br.gym.system.domain.Aluno;
import br.gym.system.domain.Gerente;

@Controller
public class AcessoController {
	
	@Autowired
	private AlunoDAO alunoDAO;
	
	@GetMapping("/")
	public String exibirTelaInicial() {
		return"tela_home";
	}
	
	@GetMapping("/loginGerente")
	public String exibirLoginGerente() {
		return"tela_login_gerente";
	}
	
	@GetMapping("/telaGerente")
	public String homeGerente() {
		return"tela_gerente";
	}
	
	
	@PostMapping("/login")
	public String loginGerente(Gerente gerente, RedirectAttributes ra, HttpSession session) {
		if (gerente.getEmail().equals("admin")&&
			gerente.getChaveAcesso().equals("1234")) {
			return"tela_gerente";
		}else {
			ra.addFlashAttribute("mensagem","Você Não possui permissão para esta Área!");
			return"tela_login_gerente";
		}
	}

	
	@GetMapping("/login")
	public String exibirAcesso() {
		return"tela_login";
	}
	
	
	
	@PostMapping("/logar")
	public String efetuarLogin(Aluno aluno,Gerente gerente, RedirectAttributes ra, HttpSession session) {
		aluno = this.alunoDAO.findByEmailAndSenha(aluno.getEmail(), aluno.getSenha());
		if (aluno != null) {
			session.setAttribute("alunoLogado", aluno);
			return"redirect:/homeAluno";
		}else {
			ra.addFlashAttribute("mensagem","Usuário ou senha inválidos");
			return"redirect:/login";
			
		}
	}
		
}
