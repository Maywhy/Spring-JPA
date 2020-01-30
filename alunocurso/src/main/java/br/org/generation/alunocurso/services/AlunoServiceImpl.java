package br.org.generation.alunocurso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunocurso.dao.AlunoRepo;
import br.org.generation.alunocurso.model.Aluno;

@Component
public class AlunoServiceImpl implements IAlunoService {
	
	@Autowired
	private AlunoRepo repo;
	
	@Override
	public List <Aluno> recuperarTodos() {
		return (List<Aluno>)repo.findAll();
	}
	
	@Override
	public Aluno recuperarPeloRa(int ra) {
		return repo.findById(ra).get();
	}

	@Override
	public void novoAluno(Aluno aluno) {
		repo.save(aluno);
	}
}