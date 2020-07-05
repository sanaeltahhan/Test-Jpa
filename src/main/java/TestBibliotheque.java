import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import fr.diginamic.entity.Emprunt;
import fr.diginamic.entity.Livre;
import fr.diginamic.entity.ClientBib;

public class TestBibliotheque {

	public static void main(String[] args) {
		
		/*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_bibli");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
		// Réalisez une requête qui permet d’extraire un emprunt et tous ses livres associés.
        
        Emprunt emprunt = entityManager.find(Emprunt.class, 1);
        
        System.out.println("Réalisez une requête qui permet d’extraire un emprunt et tous ses livres associés");
        System.out.println(emprunt);
        
        // Réalisez une requête qui permet d’extraire tous les emprunts d’un client donné.
        
        System.out.println("Réalisez une requête qui permet d’extraire tous les emprunts d’un client donné");

        List<Emprunt> clientEmprunt = entityManager.find(ClientBib.class, 1).getEmprunts();
        
        for (Emprunt emprunt2 : clientEmprunt) {
        	System.out.println(emprunt2);
			
		}
        
        //System.out.println(clientEmprunt);
       

        
        // Ferme tout
        entityManager.close();
        entityManagerFactory.close();*/
	}

}
