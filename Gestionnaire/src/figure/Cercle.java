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
public class Cercle extends Figure {
    private float rayon;
    
    public Cercle (float rayon){
        this.rayon = rayon;
    }
    
    public float getRayon(){
        return this.rayon;
    }
    
    public float perimetre(){
        return (float)((2.0F * this.rayon) * Math.PI);
    }
    
    public float surface(){
        return (float)(Math.PI * Math.pow(this.rayon, 2.0D)) ;
    }
}
