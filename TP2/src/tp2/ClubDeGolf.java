/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author pierr
 */
public class ClubDeGolf extends Produit
{
    private boolean estUnFer; 
    public ClubDeGolf(String designation, String reference, boolean estUnFer) 
    {
        super(designation, reference);
        this.estUnFer = estUnFer; 
    }

    @Override
    public String toString() 
    {
        String type = "bois"; //par defaut le club est de type renvoie bois
        if(this.estUnFer) //si estUnFer est égal à true
        { 
            type = "fer";//On modifie la valeur de type
        }
        return "ClubDeGolf '" + this.getDesignation()+ "' de type '" + type + "' (ref: " + this.getReference()+")";
    }
    
    
    
}
