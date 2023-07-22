package com.epicode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(nullable = false)
	String nome;
	@Column(nullable = false)
	String cognome;
	
	
	public Utente(Long id, String nome, String cognome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		
	}
	public Utente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		
	}
	public Utente() {
		super();
	}

	 
}
