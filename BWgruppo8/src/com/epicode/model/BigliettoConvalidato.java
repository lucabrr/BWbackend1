package com.epicode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BigliettoConvalidato {
	@Id
	@GeneratedValue
	protected Long id;
	@Column
	@OneToOne
	private Biglietto biglietto;
	@ManyToOne
	private MezziTrasporto mezzo;

}
