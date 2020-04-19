/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

import vue.Gestionnaire;

/**
 *
 * @author Ivan Domche
 */
public class Figure {
    public float perimetre(){
        return 0.0F;
    }
    
    public float surface(){
        return 0.0F;
    }
    
    public static void main(String[] args){
        Gestionnaire monGestionnaire = new Gestionnaire();
        monGestionnaire.setVisible(true);
    }
}
