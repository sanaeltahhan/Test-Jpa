package fr.diginamic.banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="CLIENT")
public class Client {
	
	@ManyToOne
	@JoinColumn(name="banque_id")
	private Banque banque;
	
	@ManyToMany(mappedBy="clients")
	private List<Compte> comptes;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	
	@Embedded
	private Adresse adresse;
	
	
	
	/** Constructeur
	 * @param banque
	 * @param comptes
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param adresse
	 */
	public Client( String nom, String prenom, LocalDate dateDeNaissance,
			Adresse adresse, Banque banque) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.banque = banque;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** Getter
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	/** Setter
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	/** Getter
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	/** Getter
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}
	/** Setter
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	/** Getter
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}
	/** Setter
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	
	

}
