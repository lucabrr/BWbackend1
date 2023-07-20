package com.epicode.model.DAO;

import java.util.List;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.MezziTrasporto;
import com.epicode.model.Stato;
import com.epicode.model.StoricoMezzo;
import com.epicode.model.Tram;

public class StoricoMezzoDAO {
	public static void save(StoricoMezzo a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Storico Mezzo: "+ a.getMezzoAssociato() +" creato");
			
		}catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	public static Stato getByStato(String codice) {
	    Stato stato = null;
	    try {
	        String query = "SELECT m.stato FROM MezziTrasporto m WHERE m.immatricolazione = :codice";

	        Query q = MainProject.em.createQuery(query);
	        q.setParameter("codice", codice);
	        Object statoObject = q.getSingleResult();
	        if (statoObject instanceof Stato) {
	            stato = (Stato) statoObject;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return stato;
	}

	
	public static List<StoricoMezzo>inServizio(String codice) {
	    List<StoricoMezzo> mezziInManutenzione = null;
	    try {
	        String query = "SELECT sm FROM StoricoMezzo sm WHERE sm.status = :SERVIZIO AND sm.mezzoAssociato.immatricolazione = :codice";

	        Query q = MainProject.em.createQuery(query, StoricoMezzo.class);
	        q.setParameter("SERVIZIO", Stato.SERVIZIO);
	        q.setParameter("codice", codice);
	        mezziInManutenzione = q.getResultList();
	        for (StoricoMezzo storicoMezzo : mezziInManutenzione) {
	            System.out.println(storicoMezzo.toString());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return mezziInManutenzione;
	}
	
	
	public static List<StoricoMezzo>inManutenzione(String codice) {
	    List<StoricoMezzo> mezziInManutenzione = null;
	    try {
	        String query = "SELECT sm FROM StoricoMezzo sm WHERE sm.status = :MANUTENZIONE AND sm.mezzoAssociato.immatricolazione = :codice";

	        Query q = MainProject.em.createQuery(query, StoricoMezzo.class);
	        q.setParameter("MANUTENZIONE", Stato.MANUTENZIONE);
	        q.setParameter("codice", codice);
	        mezziInManutenzione = q.getResultList();
	        for (StoricoMezzo storicoMezzo : mezziInManutenzione) {
	            System.out.println(storicoMezzo.toString());
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return mezziInManutenzione;
	}
	
	
	


}
