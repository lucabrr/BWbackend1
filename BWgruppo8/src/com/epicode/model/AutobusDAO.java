package com.epicode.model;

import com.epicode.controller.MainProject;

public class AutobusDAO {
public static void save(Autobus a) {
	try {
		MainProject.em.getTransaction().begin();
		MainProject.em.persist(a);
		MainProject.em.getTransaction().commit();
		MainProject.log.info("Autobus: "+ a.getImmatricolazione() +" creato");
		
	}catch (Exception e) {
		MainProject.em.getTransaction().rollback();
		MainProject.log.error(e.getMessage());
		
		}
	
	}
}


