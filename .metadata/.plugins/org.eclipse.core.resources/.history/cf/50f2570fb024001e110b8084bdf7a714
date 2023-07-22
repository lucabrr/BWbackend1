package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Abbonamento extends DocumentoVendita {
	@Column(nullable = false)
	LocalDate dataScadenza;
	@Column(nullable = false)
	Periodicita periodicita;
	@OneToOne(fetch = FetchType.EAGER)
	Tessera tessera;
}
