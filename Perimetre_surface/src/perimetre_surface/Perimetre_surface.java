/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetre_surface;

/**
 *
 * @author Ivan Domche
 */
public class Perimetre_surface {
    
    private double longueur, largeur,rayon; 
    private double pi = 3.14;
    
    /*Tout concernant le Rectangle*/
    public void Perimetre_surface_rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    public void perimetreRectangle() {
        double perimetre = 2 * ( longueur + largeur );
        System.out.println("Le perimetre est : " + perimetre);
    }
    
    public void surfaceRectangle() {
        double surface = longueur * largeur ;
        System.out.println("La surface est : " + surface);
    }
    
    /*Tout concernant le Cercle*/
    public void Perimetre_surface_cercle(double rayon) {
        this.rayon = rayon;
    }
    
    public void perimetreCercle(){
        double perimetre = 2 * pi * rayon;
        System.out.println("Le prémitre est : " + perimetre);
    }
    
    public void surfaceCercle(){
        double surface = pi * Math.pow(rayon,2);
        System.out.println("La surface est : " + surface);
    }
    
    /*Tout concernant le Carre*/
    public void Perimetre_surface_carre(double longueur){
        this.longueur = longueur;
    }
    
    public void perimetreCarre() {
        double perimetre = 4 * longueur;
        System.out.println("Le perimetre est : " + perimetre);
    }
    
    public void surfaceCarre() {
        double surface = longueur * longueur ;
        System.out.println("La surface est : " + surface);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perimetre_surface obj = new Perimetre_surface();
        
        /*obj.Perimetre_surface_rectangle(2, 2);
        obj.perimetreRectangle();        
        obj.surfaceRectangle();*/
        
        /*obj.Perimetre_surface_cercle(2);
        obj.perimetreCercle();
        obj.surfaceCercle();*/
        
        /*obj.Perimetre_surface_carre(2);
        obj.perimetreCarre();
        obj.surfaceCarre();*/

        
    }
    
}
