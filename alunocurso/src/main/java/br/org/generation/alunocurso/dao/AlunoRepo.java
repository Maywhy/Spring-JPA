package br.org.generation.alunocurso.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunocurso.model.Aluno;

public interface AlunoRepo extends CrudRepository<Aluno, Integer>{

}
