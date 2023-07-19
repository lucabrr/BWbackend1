package com.epicode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tram extends MezziTrasporto{
	@Column (nullable = false)
	private int vagoni;
	

	

	public Tram(int posti, String immatricolazione, int vagoni) {
		super(posti, immatricolazione);
		this.vagoni = vagoni;
	}




	public Tram() {
	        
	    }




	public int getVagoni() {
		return vagoni;
	}




	public void setVagoni(int vagoni) {
		this.vagoni = vagoni;
	}

	
	 
}
	
	

