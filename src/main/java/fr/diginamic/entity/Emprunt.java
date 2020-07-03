package fr.diginamic.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPRUNT")
public class Emprunt {
	
	@ManyToMany(mappedBy="emprunts")
	private Set<Livre> livres;
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	
	@Column(name="DATE_DEBUT")
	private LocalDateTime dateDebut;
	
	@Column(name="DELAI")
	private int delai;
	
	@Column(name="DATE_FIN")
	private LocalDateTime dateFin;
		
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	/** Constructeur
	 * @param id
	 * @param dateDebut
	 * @param delai
	 * @param dateFin
	 * @param idClient
	 */
	public Emprunt(Integer id, LocalDateTime dateDebut, int delai, LocalDateTime dateFin, int idClient) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.delai = delai;
		this.dateFin = dateFin;
	}

	/** Constructeur vide
	 * 
	 */
	public Emprunt() {	}
	
	

	@Override
	public String toString() {
		return  livres +" - "+dateDebut + " - " + delai +  " - " + dateFin + " - "  + client ;
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
	 * @return the dateDebut
	 */
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/** Setter
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/** Getter
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	
	
	
	
	

}
