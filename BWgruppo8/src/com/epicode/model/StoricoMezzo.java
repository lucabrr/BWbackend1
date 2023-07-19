package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StoricoMezzo {
	@Id
	@GeneratedValue
	protected Long id;
	
	@Column (nullable = false)
	@Enumerated(EnumType.STRING)
	private Stato status;
	
    @ManyToOne
    protected MezziTrasporto mezzoAssociato;
    
    @Column (nullable = false)
    private LocalDate dataInizio;
    
    
    @Column (nullable = false)
    private LocalDate dataFine;
    

    
    

}
