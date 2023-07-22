package com.epicode.model.DAO;

import java.time.Duration;
import java.util.List;

import javax.persistence.Query;

import com.epicode.controller.MainProject;
import com.epicode.model.MezziTrasporto;
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
//	public static void getNtratte(String imm){
//		
//		String query =  "SELECT t, COUNT(t), t.tempoEffettivo "
//				+ "FROM Tratta t WHERE t.mezzo.immatricolazione = :imm GROUP BY t";
//		Query q = MainProject.em.createQuery(query);
//		q.setParameter("imm", imm);
//			List<Object[]> lista = q.getResultList();
//			
//			for (Object[] result : lista) {
//			    Tratta tratta = (Tratta) result[0];
//			    Long count = (Long) result[1];
//			    Duration tempoEffettivo = (Duration) result[2];
//
//			    System.out.println("Codice Tratta: " + tratta.getCodiceTratta());
//			    System.out.println("Numero di volte in cui la Tratta è stata effettuata: " + count);
//			    System.out.println("Tempo effettivo per la Tratta: " + tempoEffettivo);
//			    System.out.println("-----------------------------------");
//			}
//	}
	
	
}
