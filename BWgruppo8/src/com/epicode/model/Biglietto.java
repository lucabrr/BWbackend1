package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Biglietto extends DocumentoVendita {
	
	private LocalDate dataConvalida;
	


	public Biglietto(Long id, String codice, LocalDate dataEmissione) {
		super(id, codice, dataEmissione);
		this.dataConvalida = null;
		 
	}

	public Biglietto() {
		super();
	}

	public Biglietto( String codice, LocalDate dataEmissione) {
		super( codice, dataEmissione);
		this.dataConvalida = null;
	}

	public LocalDate getDataConvalida() {
		return dataConvalida;
	}

	public void setDataConvalida(LocalDate dataConvalida) {
		this.dataConvalida = dataConvalida;
	}
	
	
	
	
	
}
