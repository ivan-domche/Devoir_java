/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

/**
 *
 * @author Ivan Domche
 */
public class Rectangle extends Figure {
    private float longueur, largeur;
    
    public Rectangle(float longueur, float largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    public float getLargeur(){
        return this.largeur;
    }
    
    public void setLargeur(float largeur){
        this.largeur = largeur;
    }
    
    public float perimetre(){
        return (this.largeur + this.longueur) * 2.0F;
    }
    
    public float surface(){
        return (this.largeur * this.longueur);
    }
     
    public float getLongueur(){
        return this.longueur;
    } 
    
    public void setLongueur(float longueur){
        this.longueur = longueur;
    }
}
