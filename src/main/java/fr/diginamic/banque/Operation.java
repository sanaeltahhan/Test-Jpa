package fr.diginamic.banque;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPERATION")
public class Operation {
	
	@ManyToOne
	@JoinColumn(name="compte_id")
	private Compte compte;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime date;
	private double montant;
	private String motif;
	
	
	/** Constructeur
	 * @param compte
	 * @param date
	 * @param montant
	 * @param motif
	 */
	public Operation(Compte compte, LocalDateTime date, double montant, String motif) {
		this.compte = compte;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
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
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/** Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/** Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}
	/** Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	
}
