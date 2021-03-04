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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Produit[] monTableauDeProduit = new Produit[4]; //tableau de produit
        
        //raquette de tennis « Federer Replica » en Carbone
        Raquette r1 = new Raquette("Federer Replica", "ref1", "tennis", "carbone");
        r1.setCoutDeProduction(5);
        //raquette de tennis « Nadal Replica » en Aluminium
        Raquette r2 = new Raquette("Nadal Replica", "ref2", "tennis", "aluminum");
        r2.setCoutDeProduction(10);
        //raquette de badminton « Lee Replica » en Carbone
        Raquette r3 = new Raquette("Lee Replica", "ref3", "badminton", "carbone");
        r3.setCoutDeProduction(15);
        //club de golf « bois » « Woods Replica »
        ClubDeGolf c1 = new ClubDeGolf("Woods Replica", "ref4", false);
        c1.setCoutDeProduction(20);
        
        
        Usine usineDeTroyes = new Usine("Troyes");
        Usine usineDeParis = new Usine("Paris");
        
        usineDeTroyes.ajouterUnProduit(r1);
        usineDeTroyes.ajouterUnProduit(r2);
        usineDeTroyes.ajouterUnProduit(r3);
        usineDeTroyes.ajouterUnProduit(c1);
        
        usineDeParis.ajouterUnProduit(r1);
        usineDeParis.ajouterUnProduit(c1);
        
        
        System.out.println(usineDeTroyes);
        System.out.println(usineDeParis);
        
        System.out.println("Usine de Troyes + Federer Replica = " + usineDeTroyes.recherche("Federer Replica"));
        System.out.println("Usine de Troyes + Federer Rep = " + usineDeTroyes.recherche("Federer Rep"));
        System.out.println("Usine de Troyes + r1 = " + usineDeTroyes.recherche(r1));
        System.out.println("Usine de Paris + r2 = " + usineDeParis.recherche(r2));
        
        
        System.out.println("Cout moyen de production, Usine de Troyes = " + usineDeTroyes.getCoutMoyen());
        
        
        /*monTableauDeProduit[0] = r1;
        monTableauDeProduit[1] = r2;
        monTableauDeProduit[2] = r3;
        monTableauDeProduit[3] = c1;
        
        System.out.println(monTableauDeProduit);
        
        for (int i = 0; i < monTableauDeProduit.length; i++) 
        {
            System.out.println(monTableauDeProduit[i]);
        }*/
        
        
    }
    
}
