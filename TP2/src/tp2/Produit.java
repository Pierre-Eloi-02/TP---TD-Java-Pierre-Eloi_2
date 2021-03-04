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
public class Produit 
{
    private String designation; //private; ne se voit que dans la classe, accessibilité;  ;rien devant: public
    private String reference; 
    private double coutDeProduction;

    public Produit(String designation, String reference) //constructeur
    {
        this.designation = designation;
        this.reference = reference;
    }

    public String getDesignation() //getter, CAR VARIABLE UNIQUEMENT DISPO ET ACCESSIBLE ENTRE LES DEUX ACCOLADES. IL FAUT LA RENDRE PUBLIQUE GRACE A UN GETTER 
    {
        return designation;
    }

    public String getReference() 
    {
        return reference;
    }

    public double getCoutDeProduction() {
        return coutDeProduction;
    }

    public void setCoutDeProduction(double coutDeProduction) {
        this.coutDeProduction = coutDeProduction;
    }
    
    
    
    
}
