package fr.afcepf.al29.airguitare.business;

import fr.afcepf.al29.airguitare.api.IDAOAvisClient;
import fr.afcepf.al29.airguitare.api.IDAOClient;
import fr.afcepf.al29.airguitare.api.IDAOCommande;
import fr.afcepf.al29.airguitare.api.IDAOProduit;
import fr.afcepf.al29.airguitare.ibusiness.IBusinessProduit;

/**
 * 
 */
public class BusinessProduit implements IBusinessProduit {


    /**
     * 
     */
    private IDAOProduit DAOProduit;

    /**
     * 
     */
    private IDAOCommande DAOCommande;

    /**
     * 
     */
    private IDAOAvisClient DAOAvisClient;

    /**
     * 
     */
    private IDAOClient DAOClient;

}