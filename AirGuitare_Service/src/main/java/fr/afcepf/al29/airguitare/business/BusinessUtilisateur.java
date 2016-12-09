package fr.afcepf.al29.airguitare.business;

import fr.afcepf.al29.airguitare.api.IDAOAdresse;
import fr.afcepf.al29.airguitare.api.IDAOClient;
import fr.afcepf.al29.airguitare.api.IDAOVille;
import fr.afcepf.al29.airguitare.ibusiness.IBusinessUtilisateur;

/**
 * 
 */
public class BusinessUtilisateur implements IBusinessUtilisateur {

   
    /**
     * 
     */
    private IDAOAdresse DAOAdresse;

    /**
     * 
     */
    private IDAOClient DAOClient;

    /**
     * 
     */
    private IDAOVille DAOVille;

}