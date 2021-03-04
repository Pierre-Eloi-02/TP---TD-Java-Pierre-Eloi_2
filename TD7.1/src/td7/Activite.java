/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td7;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author pierr
 */
public class Activite{
    private String nom;
    private LinkedList<Abonne>listeAbonnes = new LinkedList<>(); //on retrouve LinkedList en faisant ctrl space (et donc choper le import)

    public Activite(String nom)
    {
        this.nom = nom;
    }

    @Override //source, toString
    public String toString() {
        return "nom=" + nom + ", listeAbonnes=" + listeAbonnes;
    }
    
    public void ajout(Abonne a)
    {
        listeAbonnes.add(a);
    }
    
    public Abonne recherche(String numero)//on va passer dans la liste autant de fois qu'il y a d'abonnes
    {
        for (int i = 0; i < listeAbonnes.size(); i++) //parcours de la liste
        {
            if(listeAbonnes.get(i).testNumero(numero))  //test du numéro d'1 abonné
                return listeAbonnes.get(i);    
        }
        return null;
    }
    
    public boolean testNom(String nom)
    {
        if (this.nom.equals(nom)) //accolades optionnelles tant qu'il n'y a qu'une seule ligne dans le if
            return true;
        else
            return false;
    }
    
    public void triParNom()
    {
        Collections.sort(listeAbonnes);
    }
    
    
    
            
        
           

    
    }
    
    

    

