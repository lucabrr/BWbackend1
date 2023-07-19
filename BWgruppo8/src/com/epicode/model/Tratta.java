package com.epicode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ch.qos.logback.core.util.Duration;

@Entity
public class Tratta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@Column(nullable = false)
	String codiceTratta;
	@ManyToOne
	protected MezziTrasporto mezzo;
	@Column(nullable = false)
	protected Duration tempoMedio;
	@Column(nullable = false)
	protected Duration tempoEffettivo;
	
	public Tratta(Long id, String codiceTratta, MezziTrasporto mezzo, Duration tempoMedio, Duration tempoEffettivo) {
		super();
		this.id = id;
		this.codiceTratta = codiceTratta;
		this.mezzo = mezzo;
		this.tempoMedio = tempoMedio;
		this.tempoEffettivo = tempoEffettivo;
		 if (mezzo.stato != Stato.SERVIZIO) {
		        throw new IllegalStateException("Il mezzo non è attualmente in servizio.");
		    }
	}
	public Tratta( String codiceTratta, MezziTrasporto mezzo, Duration tempoMedio, Duration tempoEffettivo) {
		super();
		this.codiceTratta = codiceTratta;
		this.mezzo = mezzo;
		this.tempoMedio = tempoMedio;
		this.tempoEffettivo = tempoEffettivo;
		if (mezzo.stato != Stato.SERVIZIO) {
	        throw new IllegalStateException("Il mezzo non è attualmente in servizio.");
	    }
	}
	public Tratta() {
		super();	
	}
	public String getCodiceTratta() {
		return codiceTratta;
	}
	public void setCodiceTratta(String codiceTratta) {
		this.codiceTratta = codiceTratta;
	}
	public MezziTrasporto getMezzo() {
		return mezzo;
	}
	public void setMezzo(MezziTrasporto mezzo) {
		this.mezzo = mezzo;
	}
	public Duration getTempoMedio() {
		return tempoMedio;
	}
	public void setTempoMedio(Duration tempoMedio) {
		this.tempoMedio = tempoMedio;
	}
	public Duration getTempoEffettivo() {
		return tempoEffettivo;
	}
	public void setTempoEffettivo(Duration tempoEffettivo) {
		this.tempoEffettivo = tempoEffettivo;
	}
	@Override
	public String toString() {
		return "Tratta [codiceTratta=" + codiceTratta + ", mezzo=" + mezzo + ", tempoMedio=" + tempoMedio
				+ ", tempoEffettivo=" + tempoEffettivo + "]";
	}
	
	
	
}
