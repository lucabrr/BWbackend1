package com.epicode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Autobus extends MezziTrasporto {
	
	@Column (nullable = false)

	private String cambio;

	public Autobus(int posti, String immatricolazione, String cambio) {
		super(posti, immatricolazione);
		this.cambio = cambio;
	}


	public Autobus() {
		super();
	}



	



}
