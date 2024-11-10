package br.com.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

	
	// filtro para alunos ativos
	@Query("select x from Aluno x where x.status = 0 ")
	public List<Aluno> findByStatusAtivos();

	// filtro para alunos inativos
	@Query("select x from Aluno x where x.status = 1 ")
	public List<Aluno> findByStatusInativos();

	// filtro para alunos PENDENTE
	@Query("select x from Aluno x where x.status = 2 ")
	public List<Aluno> findByStatusPendente();

	// filtro para alunos CONCLUIDO
	@Query("select x from Aluno x where x.status = 3 ")
	public List<Aluno> findByStatusConcluido();

	// filtro para alunos CANCELADO
	@Query("select x from Aluno x where x.status = 4 ")
	public List<Aluno> findByStatusCancelado();

	// filtro para alunos EM_ANDAMENTO
	@Query("select x from Aluno x where x.status = 5 ")
	public List<Aluno> findByStatusEmAndamento();
		
	public List<Aluno> findByNomeContainingIgnoreCase (String nome);
}
