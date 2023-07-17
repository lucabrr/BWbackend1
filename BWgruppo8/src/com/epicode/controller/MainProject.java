package com.epicode.controller;

import javax.persistence.EntityManager;

import com.epicode.util.JpaUtil;

public class MainProject {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	}

}
