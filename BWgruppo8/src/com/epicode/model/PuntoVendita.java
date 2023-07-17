package com.epicode.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PuntoVendita {
	@Id
	@GeneratedValue
	Long id;
	@Column(nullable = false)
	String citta;
	@Column(nullable = false)
	String Settore;
	@OneToMany(fetch = FetchType.EAGER)
	List<DocumentoVendita> DocumentiDiVenditaEmessi;
	
	
	
	public PuntoVendita(Long id, String citta, String settore, List<DocumentoVendita> documentiDiVenditaEmessi) {
		super();
		this.id = id;
		this.citta = citta;
		Settore = settore;
		DocumentiDiVenditaEmessi = documentiDiVenditaEmessi;
	}
	public PuntoVendita(String citta, String settore, List<DocumentoVendita> documentiDiVenditaEmessi) {
		super();
		this.citta = citta;
		Settore = settore;
		DocumentiDiVenditaEmessi = documentiDiVenditaEmessi;
	}
	public PuntoVendita() {
		super();
	}
	
	

}
