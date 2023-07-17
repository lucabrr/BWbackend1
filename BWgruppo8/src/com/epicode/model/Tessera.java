package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tessera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(nullable = false)
	LocalDate dataEmissione;
	@Column(nullable = false)
	LocalDate dataScadenza;
	@OneToOne
	Utente utente;

	public Tessera(Long id, LocalDate dataEmissione, LocalDate dataScadenza, Utente utente) {
		super();
		this.id = id;
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza;
		this.utente = utente;
	}

	public Tessera(LocalDate dataEmissione, LocalDate dataScadenza, Utente utente) {
		super();
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza;
		this.utente = utente;
	}

	public Tessera() {
		super();
	}
	
	
	
}
