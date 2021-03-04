/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author pierr
 */
public class Club 
{
    private HashSet<Abonne>ensAbonnes = new HashSet<>();
    private ArrayList<Activite>listesActivites = new ArrayList<>();
    
    public void ajout(String numero, String nom)
    {
        Abonne temp = new Abonne(nom, numero);
        ensAbonnes.add(temp);
    }
    
    public void ajout(String nomActivite)
    {
        Activite temp = new Activite(nomActivite);
        listesActivites.add(temp);
        
    }
    public void ajout_Ab_Ac(String numero, String nomActivite)
    { 
        Activite acTemp = null;
        for (int i = 0; i < listesActivites.size(); i++) 
        {
            if(listesActivites.get(i).testNom(nomActivite)) 
            { 
              acTemp = listesActivites.get(i);
              break;  
            }
        }
        Abonne abTemp = null;
        Iterator<Abonne>curseur = ensAbonnes.iterator();
        while(curseur.hasNext())
        {
            Abonne a = curseur.next();
            if(a.testNumero(numero))
            {
                abTemp = a;
                break;          
            }
        }
        if(acTemp!=null && abTemp!=null)
        acTemp.ajout(abTemp);
    }

    @Override
    public String toString() {
        return "Club{" + "listesActivites=" + listesActivites + '}';
    }
    
    public HashSet<Abonne>listeAbonnes()
    {
        return ensAbonnes; 
    }
         
    
    
}
    





