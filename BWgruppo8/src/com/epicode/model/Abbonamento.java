package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Abbonamento extends DocumentoVendita {
	@Column(nullable = false)
	private LocalDate dataScadenza;
	@Column(nullable = false)
	private Periodicita periodicita;
	@OneToOne(fetch = FetchType.EAGER)
	private Tessera tessera;
	
	
	public Abbonamento(Long id, String codice, LocalDate dataEmissione, LocalDate dataScadenza, Periodicita periodicita,
			Tessera tessera) {
		super(id, codice, dataEmissione);
		this.dataScadenza = dataScadenza;
		this.periodicita = periodicita;
		this.tessera = tessera;
	}
	
	public Abbonamento( String codice, LocalDate dataEmissione, LocalDate dataScadenza, Periodicita periodicita,
			Tessera tessera) {
		super(codice, dataEmissione);
		this.dataScadenza = dataScadenza;
		this.periodicita = periodicita;
		this.tessera = tessera;
	}
	
	public Abbonamento() {
		super();
		
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	public Tessera getTessera() {
		return tessera;
	}

	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}
	
	
	
}
