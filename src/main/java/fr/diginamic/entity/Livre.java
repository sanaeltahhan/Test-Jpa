package fr.diginamic.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {
	
	@ManyToMany
	@JoinTable(name="COMPO", joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"))
	private Set<Emprunt> emprunts;
	
	@Id
    @Column(name = "ID")
	private Integer id;
	
    @Column(name = "TITRE")
	private String titre;

    @Column(name = "AUTEUR")
	private String auteur;

	/** Constructeur
	 * @param id
	 */
	public Livre(Integer id) {
		this.id = id;
	}
	
	/** Constructeur vide
	 * @param id
	 */
	public Livre () {};
	
	

	@Override
	public String toString() {
		return "Le Titre du livre est : " + titre + ", l'auteur est : "+ auteur + ", et l'Id est : " + id ;
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	

}
