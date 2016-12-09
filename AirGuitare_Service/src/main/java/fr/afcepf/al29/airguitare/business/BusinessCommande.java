package fr.afcepf.al29.airguitare.business;

import fr.afcepf.al29.airguitare.api.IDAOCommande;
import fr.afcepf.al29.airguitare.api.IDAOProduit;
import fr.afcepf.al29.airguitare.ibusiness.IBusinessCommande;

/**
 * 
 */
public class BusinessCommande implements IBusinessCommande {


    /**
     * 
     */
    private IDAOCommande DAOCommande;

    /**
     * 
     */
    private IDAOProduit DAOProduit;

}