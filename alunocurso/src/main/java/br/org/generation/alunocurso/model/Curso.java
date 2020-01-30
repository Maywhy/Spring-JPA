package br.org.generation.alunocurso.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tblcurso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="cargahora")
	private int cargahora;
	
	@Column(name="dtinicio", length = 20)
	private String dtinicio;
	
	@Column(name="dtfim", length = 20)
	private String dtfim;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	@JsonIgnoreProperties("curso")
	private List <Aluno> alunos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargahora() {
		return cargahora;
	}
	public void setCargahora(int cargahora) {
		this.cargahora = cargahora;
	}
	public String getDtinicio() {
		return dtinicio;
	}
	public void setDtinicio(String dtinicio) {
		this.dtinicio = dtinicio;
	}
	public String getDtfim() {
		return dtfim;
	}
	public void setDtfim(String dtfim) {
		this.dtfim = dtfim;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
