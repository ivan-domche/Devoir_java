package study.dev.figures.entity;

import study.dev.figures.enumeration.FigureType;

public class Cercle extends Figure {
    private float rayon;
    public static final double PI = 3.14;

    public Cercle() {
        this.setType(FigureType.CERCLE);
    }

    public Cercle(float rayon) {
        this.setType(FigureType.CERCLE);
        this.rayon = rayon;
    }

    @Override
    public float perimetre() {
        return (float) (2 * Cercle.PI * rayon);
    }

    @Override
    public float surface() {
        return (float) (Cercle.PI * Math.pow(rayon,2));
    }
    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }
}
