package com.epicode.model.DAO;

import com.epicode.controller.MainProject;
import com.epicode.model.Tratta;

public class TrattaDAO {

	
	public static void save (Tratta t) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(t);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Tratta con codice "+ t.getCodiceTratta()+ " creata" );
		} catch (Exception e) {
			MainProject.log.error(e.getMessage());
		}
	}
	
}
