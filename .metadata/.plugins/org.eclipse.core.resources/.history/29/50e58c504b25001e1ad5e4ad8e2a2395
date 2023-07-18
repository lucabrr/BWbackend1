package com.epicode.model.DAO;

import com.epicode.controller.MainProject;
import com.epicode.model.Abbonamento;


public class AbbonamentoDAO {

	
	public static void save(Abbonamento a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Abbonamento salvato nel db");
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	public static Abbonamento getById(Long id) {
		Abbonamento a = new Abbonamento();
		try {
			MainProject.em.getTransaction().begin();
			 a = MainProject.em.find(Abbonamento.class, id);
			MainProject.em.getTransaction().commit();
			MainProject.log.info(a.toString());
			
			
		} catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}return a;
	}
}
