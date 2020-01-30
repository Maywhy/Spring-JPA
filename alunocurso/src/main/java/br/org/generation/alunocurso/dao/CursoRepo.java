package br.org.generation.alunocurso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunocurso.model.Curso;

public interface CursoRepo extends CrudRepository <Curso, Integer> {
	
}
