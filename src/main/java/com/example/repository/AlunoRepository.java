package com.example.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {
	List<Aluno> findByCidade(String cidade);
	//List<Aluno> findByNome(String nome);
	List<Aluno> findByRenda(double renda);
	List<Aluno> findByCidadeAndRenda(String cidade, double renda);
	List<Aluno> findByra(String ra);
	
	//Buscar todos os alunos com nome "xxxx":
	@Query("SELECT a FROM Aluno a WHERE a.nome = :nome")
	List<Aluno> findByNome(@Param("nome")String nome);
	
	@Query("SELECT a FROM Aluno a WHERE a.nomeCompleto = :nomeCompleto")
	List<Aluno> findByNomeLike(@Param("nomeCompleto")String nomeCompleto);
	
	@Query("SELECT a FROM Aluno a JOIN a.turma t WHERE t.id = :turmaId")
	List<Aluno> findByTurmaId(@Param("turmaId")Long turmaId);
	
}