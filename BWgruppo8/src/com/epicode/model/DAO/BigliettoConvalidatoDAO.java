package com.epicode.model.DAO;

import java.time.LocalDate;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.Biglietto;
import com.epicode.model.BigliettoConvalidato;
import com.epicode.model.MezziTrasporto;
import com.epicode.model.Stato;
import com.epicode.model.StoricoMezzo;
import com.epicode.model.Tram;

public class BigliettoConvalidatoDAO {
	public static void save(BigliettoConvalidato a) {
		try {
			MainProject.em.getTransaction().begin();
			MainProject.em.persist(a);
			MainProject.em.getTransaction().commit();
			MainProject.log.info("Biglietto: "+ a.getBiglietto() +" creato");
			
		}catch (Exception e) {
			MainProject.em.getTransaction().rollback();
			MainProject.log.error(e.getMessage());
			
		}
	}
	
	
	public static Biglietto convalida(String codice) {
	    Biglietto t = null;
	    try {
	    	 String query1 = "SELECT sm FROM StoricoMezzo sm WHERE sm.status = :MANUTENZIONE AND sm.mezzoAssociato.immatricolazione = :codice";
	        if(query1 == "MANUTENZIONE") {
	        	 MainProject.log.info("Mezzo in Manutezione non si può convalidare un biglietto");
	        	
	        }else {
	        	String query = "SELECT m FROM Biglietto m WHERE m.codice = :codice";
	        	 Query q = MainProject.em.createQuery(query);
	 	        q.setParameter("codice", codice);
	 	        t = (Biglietto) q.getSingleResult();    
	 	        t.setDataConvalida(LocalDate.now());
	 	        MainProject.em.merge(t);
	 	        MainProject.log.info("Biglietto: "+ t.getCodice()+" modificato");
	        }
	       
	    } catch (NoResultException ex) {
	        MainProject.log.error("Biglietto non trovato per il codice: " + codice);
	    } catch (Exception e) {
	        e.printStackTrace();
	        MainProject.log.error(e.getMessage());
	    }
	    return t;
	}

	
		public static MezziTrasporto getMezzo(String codice) {
			MezziTrasporto y = null;
			 try {
				  String query = "SELECT m FROM MezziTrasporto m WHERE m.immatricolazione = :codice";
			        Query q = MainProject.em.createQuery(query);
			        q.setParameter("codice", codice);
			        y = (MezziTrasporto) q.getSingleResult();
			    } catch (NoResultException ex) {
			        MainProject.log.error("Mezzo non trovato per il codice: " + codice);
			    }
			    catch (Exception e) {
			        e.printStackTrace();
			        MainProject.log.error(e.getMessage());
			    }
			    return y;
		
		}
}	

	

