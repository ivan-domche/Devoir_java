package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

public class Rectangle extends Figure {
    private float longueur;
    private float largeur;

    public Rectangle() {
        this.setType(FigureType.RECTANGLE);
    }

    public Rectangle(float longueur, float largeur) {
        this.setType(FigureType.RECTANGLE);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public float perimetre() {
        return 2 * ( longueur + largeur );
    }

    @Override
    public float surface() {
        return longueur * largeur ;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
}
