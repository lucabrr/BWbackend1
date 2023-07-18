package com.epicode.model.DAO;

import com.epicode.controller.MainProject;
import com.epicode.model.Biglietto;


public class BigliettoDAO {

	
	public static void save(Biglietto b) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(b);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("il biglietto è stato salvato nel db");
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	public static void getById(Long id) {
		try {
			MainProject.em.getTransaction().begin();
			Biglietto b = MainProject.em.find(Biglietto.class, id);
			MainProject.em.getTransaction().commit();
			MainProject.log.info(b.toString());
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	public static Biglietto getCode(String codice) {
		Biglietto b = null;
		try {
			MainProject.em.getTransaction().begin();
			b = MainProject.em.find(Biglietto.class, codice);
			MainProject.em.getTransaction().commit();
			MainProject.log.info(b.toString());
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
		return b;
	}
}
