package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class DocumentoVendita {
	@Id
	@GeneratedValue
	Long id;
	@Column(nullable = false)
	String codice;
	@Column(nullable = false)
	LocalDate dataEmissione;
	
	
	
	
	
	public DocumentoVendita(Long id, String codice, LocalDate dataEmissione) {
		super();
		this.id = id;
		this.codice = codice;
		this.dataEmissione = dataEmissione;
	}



	public DocumentoVendita(String codice, LocalDate dataEmissione) {
		super();
		this.codice = codice;
		this.dataEmissione = dataEmissione;
	}



	public DocumentoVendita() {
		super();
	}
	
	
	
}
