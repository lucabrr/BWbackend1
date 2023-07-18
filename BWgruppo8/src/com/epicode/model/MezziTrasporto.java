package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MezziTrasporto {
	@Id
	@GeneratedValue
	protected Long id;
	 @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 @JoinColumn(name = "codice_biglietto", nullable = false)
	 protected Biglietto biglietto;
	@Column (nullable = false)
	protected int posti;
	@Column (nullable = false)
	protected LocalDate periodoServizioFine;
	@Column (nullable = false)
	protected LocalDate periodoServizioInizio;
	@Column (nullable = false)
	protected int periodoManutenzioneFine;
	@Column (nullable = false)
	protected int periodoManutenzioneInizio;
	@Column (nullable = false)
	protected Boolean vidimato;
	@Column(nullable=false)
	protected String targa;
	





	public MezziTrasporto(Biglietto biglietto, int posti, LocalDate periodoServizioFine,
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

	public MezziTrasporto() {
		super();
	}

	public Biglietto getBiglietto() {
		return biglietto;
	}

	public void setBiglietto(Biglietto biglietto) {
		this.biglietto = biglietto;
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
