package fr.diginamic.banque;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestBanque {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_banque");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        
        Adresse adr1 = new Adresse(11, "rue du four", "paris");
        Banque banque1 = new Banque("Credit mut");
        
        Compte compte1 = new Compte("111AZERT", 3005.55);
        Compte compte2 = new Compte("222TREZA", 3005.55);
        
        
        
        Operation ope1 = new Operation(compte1, LocalDateTime.now(), 300.0, "Course");
        Operation ope2 = new Operation(compte1, LocalDateTime.now(), 400.0, "Loyer");
        
        Client client1 = new Client("Dubois","Marc",LocalDate.of(1995,Month.MARCH,29), adr1, banque1); 
        Client client2 = new Client("Dubois","Marie",LocalDate.of(1998,Month.MARCH,10), adr1, banque1); 
        
        List <Client> clients = new ArrayList<Client>();
        clients.add(client1);
        clients.add(client2);
        
        compte1.setClients(clients);
        
        List <Compte> comptes = new ArrayList<Compte>();
        comptes.add(compte1);
        comptes.add(compte2);
        
        client1.setComptes(comptes);

        
        EntityTransaction entityTrans = entityManager.getTransaction();
        entityTrans.begin();
        
        entityManager.persist(banque1);
        entityManager.persist(compte1);
        entityManager.persist(compte2);
        entityManager.persist(ope1);
        entityManager.persist(ope2);
        entityManager.persist(client1);
        entityManager.persist(client2);
        
        entityTrans.commit();
        
        
        
        
        entityManager.close();
        
        entityManagerFactory.close();
        

	}

}
