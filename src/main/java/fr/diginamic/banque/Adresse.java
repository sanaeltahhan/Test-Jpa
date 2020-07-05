package fr.diginamic.banque;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private Integer numero;
	private String rue;
	private String ville;
	
	
	
	
	/** Constructeur
	 * 
	 */
	public Adresse() {	}
	
	
	/** Constructeur
	 * @param numero
	 * @param rue
	 * @param ville
	 */
	public Adresse(Integer numero, String rue, String ville) {
		super();
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}
	/** Getter
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/** Setter
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/** Getter
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}
	/** Setter
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}
	/** Getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/** Setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

}
