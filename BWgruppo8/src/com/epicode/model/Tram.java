package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tram extends MezziTrasporto{
	
	public Tram(Biglietto biglietto, int posti, LocalDate periodoServizioFine,
			LocalDate periodoServizioInizio, int periodoManutenzioneFine, int periodoManutenzioneInizio,
			Boolean vidimato, String targa) {
		super();
		this.biglietto = biglietto;
		this.posti = posti;
		this.periodoServizioFine = periodoServizioFine;
		this.periodoServizioInizio = periodoServizioInizio;
		this.periodoManutenzioneFine = periodoManutenzioneFine;
		this.periodoManutenzioneInizio = periodoManutenzioneInizio;//Da modificare
		this.vidimato = vidimato;
		this.targa = targa;
	}

	 public Tram() {
	        
	    }

		public int getPosti() {
			return posti;
		}

		public void setPosti(int posti) {
			this.posti = posti;
		}

		public LocalDate getPeriodoServizioFine() {
			return periodoServizioFine;
		}

		public void setPeriodoServizioFine(LocalDate periodoServizioFine) {
			this.periodoServizioFine = periodoServizioFine;
		}

		public LocalDate getPeriodoServizioInizio() {
			return periodoServizioInizio;
		}

		public void setPeriodoServizioInizio(LocalDate periodoServizioInizio) {
			this.periodoServizioInizio = periodoServizioInizio;
		}

		public int getPeriodoManutenzioneFine() {
			return periodoManutenzioneFine;
		}

		public void setPeriodoManutenzioneFine(int periodoManutenzioneFine) {
			this.periodoManutenzioneFine = periodoManutenzioneFine;
		}

		public int getPeriodoManutenzioneInizio() {
			return periodoManutenzioneInizio;
		}

		public void setPeriodoManutenzioneInizio(int periodoManutenzioneInizio) {
			this.periodoManutenzioneInizio = periodoManutenzioneInizio;
		}

		public Boolean getVidimato() {
			return vidimato;
		}

		public void setVidimato(Boolean vidimato) {
			this.vidimato = vidimato;
		}

		public String getTarga() {
			return targa;
		}

		public void setTarga(String targa) {
			this.targa = targa;
		}

		public Long getId() {
			return id;
		}
	 
	 
}
	
	

