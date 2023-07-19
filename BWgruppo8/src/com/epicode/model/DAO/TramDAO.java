package com.epicode.model.DAO;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.DistributoreAutomatico;
import com.epicode.model.Tram;

public class TramDAO {
	public static void save(Tram a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			
		}catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
		
	}
	
	public static Tram getByCode(String codice) {
		try {
			String query = "SELECT d FROM Biglietto d WHERE d.codice = :codice";
			Query q = MainProject.em.createQuery(query);
			q.setParameter("codice",codice);
			  return (Tram) q.getSingleResult();	
		} catch (Exception e) {
			e.printStackTrace();
			MainProject.log.error(e.getMessage());
		} return null;
		
	}

}
