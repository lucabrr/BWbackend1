package com.epicode.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.epicode.model.Biglietto;
import com.epicode.util.JpaUtil;

public class MainProject {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		Biglietto b1 = new Biglietto("tre123", LocalDate.of(2022, 6, 17));
		
	}

}
