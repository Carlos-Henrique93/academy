package br.com.academy.model;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome")
    @NotBlank(message = "O nome não pode ser vazio!")
    @Size(min = 5, max = 35, message = "O nome deve conter no mínimo 5 caracteres.")
    private String nome;

    @Enumerated(EnumType.ORDINAL)
    @NotNull(message = "O campo Curso não pode ser nulo.")
    private Curso curso;

    @Enumerated(EnumType.ORDINAL)
    @NotNull(message = "O campo Status não pode ser nulo.")
    private Status status;
    
    @NotBlank(message = "O campo Matrícula não pode ser vazio!")
    private String matricula;
    
    
    @NotBlank(message = "O campo Turno não pode ser vazio!")
    @Size(min = 4, message = "O turno deve ter no mínimo 4 caracteres.")
    private String turno;
    // Getters e setters
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}



}
