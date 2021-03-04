/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.ArrayList;

/**
 *
 * @author pierr
 */
public class Usine 
{
    private String localite;
    private ArrayList<Produit> listeDeProduitFabricable = new ArrayList<>();

    public Usine(String localite) 
    {
        this.localite = localite;
    }
    
    
    public void ajouterUnProduit(Produit p)
    {
        this.listeDeProduitFabricable.add(p);  
    }
    
    public boolean recherche(String designation)
    {
        for (int i = 0; i < listeDeProduitFabricable.size(); i++)  //on boucle sur la liste des produits fabricables
        {
            Produit produitActuel = listeDeProduitFabricable.get(i);//pour chaque élément de ma liste, je récupère le produit.
            if(produitActuel.getDesignation().equals(designation)) //si la déignation de mon produit est egal à la designation passé en parametre
            { 
                return true; //je retourne 'true', cad que j'ai trouvé le produit recherché
            }
        }
        return false; //sinon je continue de boucler sur ma liste
    }
    
    public boolean recherche(Produit produit)
    {
        return listeDeProduitFabricable.contains(produit);
    }
    public double getCoutMoyen()
    {
        double somme = 0; 
        for (int i = 0; i < listeDeProduitFabricable.size(); i++) 
        {
            Produit produitActuel = listeDeProduitFabricable.get(i);
            somme = somme + produitActuel.getCoutDeProduction();
        }
        return somme;
    }
    
    public double getCoutMoyenRaquette()
    {
        double somme = 0;
        int compteur = 0;
        for (int i = 0; i < listeDeProduitFabricable.size(); i++) 
        {
            Produit produitActuel = listeDeProduitFabricable.get(i);
            if (produitActuel instanceof Raquette) 
            {
                if((Raquette) produitActuel).getSport().equals(Sport)
                        {
                            somme = somme + produitActuel.getCoutDeProduction(); 
                        }
                somme = somme + produitActuel.getCoutDeProduction();
                compteur = compteur+1;
            }
        }
        return somme; 
    }
    
    public double getCoutMoyenRaquette(String sport)
    {
        double resultat =0;
        return resultat; 
    }

    @Override
    public String toString() {
        String result = "Usine de" + localite + "fabrique: \n";
        
        for (int i = 0; i < listeDeProduitFabricable.size(); i++) 
        {
            result = result +"\t - " + listeDeProduitFabricable.get(i)+"\n";
        }
        
        return result;
                
    }
    
    
}
