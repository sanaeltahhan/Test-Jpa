package fr.diginamic.banque;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COMPTE")
public class Compte {
	
	@ManyToMany
	@JoinTable (name="COMPTE_CLIENT",
	joinColumns = @JoinColumn(name="id_compte", referencedColumnName="id"),
	inverseJoinColumns = @JoinColumn (name="id_client", referencedColumnName="id"))
	private List<Client> clients;
	
	@OneToMany (mappedBy="compte")
	private List<Operation> operations;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String numeroCompte;
	private double solde;
	
	
	/** Constructeur
	 * @param clients
	 * @param operations
	 * @param id
	 * @param numeroCompte
	 * @param solde
	 */
	public Compte( String numeroCompte, double solde) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
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
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}
	/** Setter
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	/** Getter
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}


	/** Getter
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}


	/** Setter
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	/** Getter
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}


	/** Setter
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	

}
