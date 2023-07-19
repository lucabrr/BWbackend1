package com.epicode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MezziTrasporto {
	@Id
	@GeneratedValue
	protected Long id;
	@Column (nullable = false)
	protected int posti;
	@Column (nullable = false)
	String immatricolazione;
	@Column (nullable = false)
	@Enumerated(EnumType.STRING)
	Stato stato;
	@OneToMany
    protected List<StoricoMezzo>storico;
	@OneToMany
	protected List<BigliettoConvalidato>bigliettoConvalidato;
	@OneToMany
	protected List<Tratta> tratta;
	

}
