package com.epicode.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PuntoVendita {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String citta;
	@Column(nullable = false)
	private String Settore;
	@OneToMany(fetch = FetchType.EAGER)
	private List<DocumentoVendita> DocumentiDiVenditaEmessi;
	
	
	
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
	public Long getId() {
		return id;
	}
	
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getSettore() {
		return Settore;
	}
	public void setSettore(String settore) {
		Settore = settore;
	}
	public List<DocumentoVendita> getDocumentiDiVenditaEmessi() {
		return DocumentiDiVenditaEmessi;
	}
	public void setDocumentiDiVenditaEmessi(List<DocumentoVendita> documentiDiVenditaEmessi) {
		DocumentiDiVenditaEmessi = documentiDiVenditaEmessi;
	}
	
	

}
