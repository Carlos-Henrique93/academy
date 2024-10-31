package br.com.academy.Enums;

public enum Status {
	
	ATIVO("ATIVO"),
	INATIVO("INATIVO"),
	CANCELADO("CANCELADO"),
	TRANCADO("TRANCADO");

	private String status; 
	
	private Status(String status) {
		this.status = status;
	}
	
}
