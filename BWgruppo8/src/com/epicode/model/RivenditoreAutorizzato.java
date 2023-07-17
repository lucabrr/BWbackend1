package com.epicode.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class RivenditoreAutorizzato  extends PuntoVendita{
	@Column(nullable = false)
	String nome;
	@Column(nullable = false)
	String codiceRivenditore;
	
	
}
