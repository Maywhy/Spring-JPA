package br.org.generation.alunocurso.services;

import java.util.List;

import br.org.generation.alunocurso.model.Aluno;

public interface IAlunoService  {
	public List <Aluno> recuperarTodos();
	public Aluno recuperarPeloRa(int ra);
	public void novoAluno(Aluno aluno);
}
