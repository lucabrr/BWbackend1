package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Entity;
@Entity
public class Autobus extends MezziTrasporto {



	public Autobus(Biglietto biglietto, int posti, LocalDate periodoServizioFine,
			LocalDate periodoServizioInizio, int periodoManutenzioneFine, int periodoManutenzioneInizio,
			Boolean vidimato, String targa) {
		super();
		this.biglietto = biglietto;
		this.posti = posti;
		this.periodoServizioFine = periodoServizioFine;
		this.periodoServizioInizio = periodoServizioInizio;
		this.periodoManutenzioneFine = periodoManutenzioneFine;
		this.periodoManutenzioneInizio = periodoManutenzioneInizio;
		this.vidimato = vidimato;
		this.targa = targa;
	}


	 
	 public  Autobus() {
	        
	    }

}
