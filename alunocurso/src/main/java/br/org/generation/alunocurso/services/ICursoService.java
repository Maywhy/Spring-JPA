package br.org.generation.alunocurso.services;

import java.util.List;

import br.org.generation.alunocurso.model.Curso;

public interface ICursoService {
	
	public void adicionarNovoCurso(Curso curso);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();
}
