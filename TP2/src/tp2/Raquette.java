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
public class Raquette extends Produit
{
    private String sport;
    private String materiau;
    
    public Raquette(String designation, String reference, String sport, String materiau) //pour exister, la raquette a au moins besoin des mêmes caractéristiques que produit
    {
        super(designation, reference); //fait ref à la classe mère (ici produit, car extends)
        this.sport = sport; // chaque raquette va être différente de l'autre. Le this correspond à la raquette en question
        this.materiau = materiau; 
    }

    @Override //surcharger le système. On veut èétudier le comportement de ToString, donc on le force par rapport aux autres
    public String toString() 
    {
        return "Raquette '" +this.getDesignation()+"'de " + this.sport + "en"+ this.materiau+ " (ref:" +this.getReference() + ")";   //this.De... lié au getter desihnation et reference de profuit
    }
   
   
   
}
