package fr.afcepf.al29.airguitare.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="produit")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminant")
@DiscriminatorValue(value="Produit")
public class Produit implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 
     */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    /**
     * 
     */
    private String intitule;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Double prix;

    /**
     * 
     */
    private String photo;

    /**
     * 
     */
    private String reference;

    /**
     * 
     */
    private Integer stock;

    /**
     * 
     */
    private Integer seuil;

    /**
     * 
     */
    private Integer nbVues;

    /**
     * 
     */
    @ManyToOne
    private TypeProduit typeProduit;

    /**
     * 
     */
    @ManyToOne
    private Marque marque;

    /**
     * 
     */
    @OneToMany(mappedBy="produit")
    private Set<LigneCommande> ligneCommandes;

    /**
     * 
     */
    @OneToMany(mappedBy="produit")
    private Set<AvisClient> avisClients;
    
    /**
     * Default constructor
     */
    public Produit() {
    }

	public Produit(int id, String intitule, String description, Double prix, String photo, String reference,
			Integer stock, Integer seuil, Integer nbVues, TypeProduit typeProduit, Marque marque,
			Set<LigneCommande> ligneCommandes, Set<AvisClient> avisClients) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.description = description;
		this.prix = prix;
		this.photo = photo;
		this.reference = reference;
		this.stock = stock;
		this.seuil = seuil;
		this.nbVues = nbVues;
		this.typeProduit = typeProduit;
		this.marque = marque;
		this.ligneCommandes = ligneCommandes;
		this.avisClients = avisClients;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getSeuil() {
		return seuil;
	}

	public void setSeuil(Integer seuil) {
		this.seuil = seuil;
	}

	public Integer getNbVues() {
		return nbVues;
	}

	public void setNbVues(Integer nbVues) {
		this.nbVues = nbVues;
	}

	public TypeProduit getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(TypeProduit typeProduit) {
		this.typeProduit = typeProduit;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Set<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public Set<AvisClient> getAvisClients() {
		return avisClients;
	}

	public void setAvisClients(Set<AvisClient> avisClients) {
		this.avisClients = avisClients;
	}
    
    

}