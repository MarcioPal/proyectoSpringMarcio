package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaApp {

	public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenciaAppPU");
      EntityManager em = emf.createEntityManager();

	}

}
