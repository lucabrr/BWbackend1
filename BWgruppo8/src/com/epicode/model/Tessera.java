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
	private	Long id;
	@Column(nullable = false)
	private	LocalDate dataEmissione;
	@Column(nullable = false)
	private	LocalDate dataScadenza;
	@OneToOne
	private	Utente utente;

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

	public Long getId() {
		return id;
	}

	
	public LocalDate getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	
	
}
