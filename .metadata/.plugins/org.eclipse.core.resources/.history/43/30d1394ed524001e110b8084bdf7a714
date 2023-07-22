package com.epicode.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class DistributoreAutomatico extends PuntoVendita {	
	@Enumerated(EnumType.STRING)	
	private Status status;
	
	

	public DistributoreAutomatico(Long id, String citta, String settore,
			List<DocumentoVendita> documentiDiVenditaEmessi, Status status) {
		super(id, citta, settore, documentiDiVenditaEmessi);
		this.status = status;
	}
	

	public DistributoreAutomatico( String citta, String settore,
			List<DocumentoVendita> documentiDiVenditaEmessi, Status status) {
		super( citta, settore, documentiDiVenditaEmessi);
		this.status = status;
	}
	


	public DistributoreAutomatico() {
		super();
	}


	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
