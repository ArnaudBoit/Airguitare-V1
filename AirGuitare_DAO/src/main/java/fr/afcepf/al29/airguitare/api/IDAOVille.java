package fr.afcepf.al29.airguitare.api;

import java.util.List;

import fr.afcepf.al29.airguitare.entities.Pays;
import fr.afcepf.al29.airguitare.entities.Ville;

/**
 * 
 */
public interface IDAOVille {

    /**
     * @param int idPays 
     * @return
     */
    public List<Ville> getVilleByPays(int idPays);

    /**
     * @return
     */
    public List<Pays> getAllPays();

    /**
     * @param Ville ville 
     * @return
     */
    public Ville addVille(Ville ville);

}