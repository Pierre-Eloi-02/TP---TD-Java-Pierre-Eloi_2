/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td7;

import java.util.Objects;

/**
 *
 * @author pierr
 */
public class Abonne implements Comparable
{
    private String nom;
    private String numero;   

    public Abonne(String nom, String numero) //source, constructor
    {
        this.nom = nom;
        this.numero = numero;
    }

    @Override
    public String toString() //source toSring
    {
        return "nom=" + nom + ", numero=" + numero;
    }
    
    public boolean testNumero(String numero)
    {
        if (this.numero.equals(numero))
        {  
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) //o = objet avec lequel je compare l'objet considéré
    {
        Abonne temp = (Abonne) o;
        return this.nom.compareTo(temp.nom);
        
    }

    @Override
    public int hashCode() //source insert equal and hascode, seulement les numero
    {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Abonne other = (Abonne) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
            
    
    
}
