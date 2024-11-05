package br.com.academy.Enums;

public enum Curso {
	
	ADMINISTRACAO("ADMINSTRACAO"),
	INFORMATICA("INFORMATICA"),
	CONTABILIDADE("CONTABILIDADE"),
	PROGRAMACAO("PROGRAMACAO"),
	ENFERMAGEM("ENFERMAGEM"),
	JAVA("JAVA");

	private String curso;
	
	private Curso (String curso) {
		this.curso= curso;
	}
}
