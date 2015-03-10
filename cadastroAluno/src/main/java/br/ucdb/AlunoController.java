package br.ucdb;


import java.awt.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlunoController
 */

@WebServlet(urlPatterns = "/AlunoController")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GerenciadorAluno ga = new GerenciadorAluno();
		
		List alunos = (List) ga.getAlunos();
		
		request.setAttribute("alu", alunos);
		
		RequestDispatcher view = request.getRequestDispatcher("aluno.jsp");
		view.forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome =  request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String rg = request.getParameter("rg");
		String sexo = request.getParameter("sexo");
		String uf = request.getParameter("uf");
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setRg(rg);
		aluno.setSexo(sexo);
		aluno.setUf(uf);
		
		GerenciadorAluno ga = new GerenciadorAluno();
		ga.salvar(aluno);
	}

}
