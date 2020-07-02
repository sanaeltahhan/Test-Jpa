import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entity.Livre;

public class TestJpa {

	public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_bibli");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
     
        // Réalisez un find simple permettant d’extraire un livre en fonction de son identifiant et  affichez son titre et son auteur.
        Livre livre = entityManager.find(Livre.class, 1);
        System.out.println(livre);
        
        // Insérez un nouveau Livre de votre choix en base de données
        
        Livre livreInsert = new Livre();
        livreInsert.setId(6);
        livreInsert.setTitre("La peste");
        livreInsert.setAuteur("Albert Camus");
        
     // Constrainte JPA => la modification doit se faire dans le cadre d'une transaction.
        EntityTransaction entityTransa = entityManager.getTransaction();
        entityTransa.begin();
        entityManager.persist(livreInsert); // insérer une nouvelle ligne
        entityTransa.commit(); 

        // Modifiez le titre du livre d’identifiant 5 qui possède une erreur : le nouveau titre doit être
        // « Du plaisir dans la cuisine » au lieu de « 1001 recettes de Cuisine ».
        
        Livre livreModif = entityManager.find(Livre.class, 5);
        livreModif.setTitre("Du plaisir dans la cuisine");
        
        EntityTransaction entityTransaModif = entityManager.getTransaction();
        entityTransaModif.begin();
        entityManager.persist(livreModif); // insérer une nouvelle ligne modifier
        entityTransaModif.commit(); 
        
        // Faites une requête JPQL pour extraire de la base un livre en fonction de son titre.
        TypedQuery<Livre> querySelect = entityManager.createQuery("select l from Livre as l where TITRE like 'La peste' ", Livre.class);
        System.out.println(querySelect.getSingleResult());
        
        // Faites une requête JPQL pour extraire de la base un livre en fonction de son auteur.
        TypedQuery<Livre> querySelectAuteur = entityManager.createQuery("select l from Livre as l where AUTEUR like 'Albert Camus' ", Livre.class);
        System.out.println(querySelectAuteur.getSingleResult());
        
        // Supprimez un livre de votre choix en base de données.
        Livre livreSupp = entityManager.find(Livre.class, 2);
        
        EntityTransaction entityTransaSup = entityManager.getTransaction();
        entityTransaSup.begin();
        entityManager.remove(livreSupp); // Sup une ligne 
        entityTransaSup.commit(); 
        
        // Affichez la liste de tous les livres présents en base de données (titre et auteur).
        TypedQuery<Livre> querySelectAll = entityManager.createQuery("select l from Livre as l", Livre.class);
        List<Livre> listeLivre = querySelectAll.getResultList();
        System.out.println();
       
        listeLivre.forEach(System.out::println);
        
        
        entityManager.close();


        entityManagerFactory.close();



	}

}
