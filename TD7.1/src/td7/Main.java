/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td7;

/**
 *
 * @author pierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Activite ac1 = new Activite("tennis");
        Abonne ab1 = new Abonne("Bob", "1111111");
        Abonne ab2 = new Abonne("John", "2222222");
        Abonne ab3 = new Abonne("William", "3333333");
        Abonne ab4 = new Abonne("Bob", "4444444");
        
        ac1.ajout(ab1); //programme de test: g plein d'activités, là on n'en prend qu'une. On ajouter les 4 gus dans la LinkedList
        ac1.ajout(ab2);
        ac1.ajout(ab3);
        ac1.ajout(ab4);
        
        System.out.println(ac1);
        System.out.println(ac1.recherche("3333333"));
        System.out.println(ac1.recherche("5555555"));
        
        ac1.triParNom();
        System.out.println(ac1);*/
        
        Club troyes = new Club();
        troyes.ajout("Tennis");
        troyes.ajout("squash");
        troyes.ajout("Badminton");
        troyes.ajout("1111111","Bob");
        troyes.ajout("2222222","John");
        troyes.ajout("3333333","William");
        troyes.ajout("4444444","Joe");
        troyes.ajout("4444444","Joe");
        troyes.ajout_Ab_Ac("1111111", "Tennis");
        troyes.ajout_Ab_Ac("4444444", "Tennis");
        troyes.ajout_Ab_Ac("1111111", "Badminton");
        troyes.ajout_Ab_Ac("3333333", "Badminton");
        troyes.ajout_Ab_Ac("3333333", "Squash");
        
        System.out.println(troyes);
        System.out.println(troyes.listeAbonnes());
        
                
        
        


    }
    
}
