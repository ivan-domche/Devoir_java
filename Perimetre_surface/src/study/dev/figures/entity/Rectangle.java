package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

public class Rectangle extends Figure {
    private long longueur;
    private long largeur;

    public Rectangle() {
        this.setType(FigureType.RECTANGLE);
    }

    public Rectangle(long longueur, long largeur) {
        this.setType(FigureType.RECTANGLE);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 1;
    }

    @Override
    public double surface() {
        return 1;
    }

    public long getLongueur() {
        return longueur;
    }

    public void setLongueur(long longueur) {
        this.longueur = longueur;
    }

    public long getLargeur() {
        return largeur;
    }

    public void setLargeur(long largeur) {
        this.largeur = largeur;
    }
}
